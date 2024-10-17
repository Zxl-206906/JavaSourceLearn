/*
 * Copyright (c) 2000, 2022, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package sun.security.provider.certpath;

import sun.security.util.Debug;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXReason;
import java.security.cert.X509Certificate;

/**
 * This class is initialized with a list of <code>PKIXCertPathChecker</code>s
 * and is used to verify the certificates in a <code>CertPath</code> by
 * feeding each certificate to each <code>PKIXCertPathChecker</code>.
 *
 * @since       1.4
 * @author      Yassir Elley
 */
class PKIXMasterCertPathValidator {

    private static final Debug debug = Debug.getInstance("certpath");

    /**
     * Validates a certification path consisting exclusively of
     * <code>X509Certificate</code>s using the specified
     * <code>PKIXCertPathChecker</code>s. It is assumed that the
     * <code>PKIXCertPathChecker</code>s
     * have been initialized with any input parameters they may need.
     *
     * @param cpOriginal the original X509 CertPath passed in by the user
     * @param reversedCertList the reversed X509 CertPath (as a List)
     * @param certPathCheckers the PKIXCertPathCheckers
     * @throws CertPathValidatorException if cert path does not validate
     */
    static void validate(CertPath cpOriginal,
                         List<X509Certificate> reversedCertList,
                         List<PKIXCertPathChecker> certPathCheckers)
        throws CertPathValidatorException
    {
        // we actually process reversedCertList, but we keep cpOriginal because
        // we need to return the original certPath when we throw an exception.
        // we will also need to modify the index appropriately when we
        // throw an exception.

        int cpSize = reversedCertList.size();

        if (debug != null) {
            debug.println("--------------------------------------------------"
                  + "------------");
            debug.println("Executing PKIX certification path validation "
                  + "algorithm.");
        }

        for (int i = 0; i < cpSize; i++) {

            /* The basic loop algorithm is that we get the
             * current certificate, we verify the current certificate using
             * information from the previous certificate and from the state,
             * and we modify the state for the next loop by setting the
             * current certificate of this loop to be the previous certificate
             * of the next loop. The state is initialized during first loop.
             */
            X509Certificate currCert = reversedCertList.get(i);

            if (debug != null) {
                debug.println("Checking cert" + (i+1) + " - Subject: " +
                    currCert.getSubjectX500Principal());
            }

            Set<String> unresCritExts = currCert.getCriticalExtensionOIDs();
            if (unresCritExts == null) {
                unresCritExts = Collections.emptySet();
            }

            if (debug != null && !unresCritExts.isEmpty()) {
                StringJoiner joiner = new StringJoiner(", ", "{", "}");
                for (String oid : unresCritExts) {
                  joiner.add(oid);
                }
                debug.println("Set of critical extensions: " +
                        joiner.toString());
            }

            for (int j = 0; j < certPathCheckers.size(); j++) {

                PKIXCertPathChecker currChecker = certPathCheckers.get(j);
                if (debug != null) {
                    debug.println("-Using checker" + (j + 1) + " ... [" +
                        currChecker.getClass().getName() + "]");
                }

                if (i == 0)
                    currChecker.init(false);

                try {
                    currChecker.check(currCert, unresCritExts);

                    if (debug != null) {
                        debug.println("-checker" + (j + 1) +
                            " validation succeeded");
                    }

                } catch (CertPathValidatorException cpve) {
                    throw new CertPathValidatorException(cpve.getMessage(),
                        (cpve.getCause() != null) ? cpve.getCause() : cpve,
                            cpOriginal, cpSize - (i + 1), cpve.getReason());
                }
            }

            if (!unresCritExts.isEmpty()) {
                throw new CertPathValidatorException("unrecognized " +
                    "critical extension(s)", null, cpOriginal, cpSize-(i+1),
                    PKIXReason.UNRECOGNIZED_CRIT_EXT);
            }

            if (debug != null)
                debug.println("\ncert" + (i+1) + " validation succeeded.\n");
        }

        if (debug != null) {
            debug.println("Cert path validation succeeded. (PKIX validation "
                          + "algorithm)");
            debug.println("-------------------------------------------------"
                          + "-------------");
        }
    }
}
