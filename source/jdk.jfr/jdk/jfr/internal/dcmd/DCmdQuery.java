/*
 * Copyright (c) 2023, Oracle and/or its affiliates. All rights reserved.
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
package jdk.jfr.internal.dcmd;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import jdk.jfr.internal.query.Configuration;
import jdk.jfr.internal.query.QueryPrinter;
import jdk.jfr.internal.util.UserDataException;
import jdk.jfr.internal.util.UserSyntaxException;

/**
 * JFR.query
 */
// Instantiated by native
public final class DCmdQuery extends AbstractDCmd {

    protected void execute(ArgumentParser parser) throws DCmdException {
        parser.checkUnknownArguments();
        if (!parser.checkMandatory()) {
            println("The argument 'query' is mandatory");
            println();
            printHelpText();
            return;
        }

        Configuration configuration = new Configuration();
        configuration.output = getOutput();
        configuration.endTime = Instant.now().minusSeconds(1);
        Boolean verbose = parser.getOption("verbose");
        if (verbose != null) {
            configuration.verboseHeaders = verbose;
        }
        try (QueryRecording recording = new QueryRecording(configuration, parser)) {
            QueryPrinter printer = new QueryPrinter(configuration, recording.getStream());
            String query = parser.getOption("query");
            printer.execute(stripQuotes(query));
        } catch (UserDataException e) {
            throw new DCmdException(e.getMessage());
        } catch (UserSyntaxException e) {
            throw new DCmdException(e.getMessage());
        } catch (IOException e) {
            throw new DCmdException("Could not open repository. " + e.getMessage());
        } catch (IllegalArgumentException e) {
            throw new DCmdException(e.getMessage() + ". See help JFR.query");
        }
    }

    private String stripQuotes(String text) {
        if (text.startsWith("\"")) {
            text = text.substring(1);
        }
        if (text.endsWith("\"")) {
            text = text.substring(0, text.length() - 1);
        }
        return text;
    }

    @Override
    public String[] printHelp() {
        List<String> lines = new ArrayList<>();
        lines.addAll(getOptions().lines().toList());
        lines.add("");
        lines.addAll(QueryPrinter.getGrammarText().lines().toList());
        lines.add("");
        lines.addAll(getExamples().lines().toList());
        return lines.toArray(String[]::new);
    }

    private String getExamples() {
              // 0123456789001234567890012345678900123456789001234567890012345678900123456789001234567890
        return """
                 Example usage:

                  $ jcmd <pid> JFR.query '"SHOW EVENTS"'

                  $ jcmd <pid> JFR.query '"SHOW FIELDS ObjectAllocationSample"'

                  $ jcmd <pid> JFR.query '"SELECT * FROM ObjectAllocationSample"'
                                        verbose=true maxsize=10M

                  $ jcmd <pid> JFR.query '"SELECT pid, path FROM SystemProcess"'
                                        width=100

                  $ jcmd <pid> JFR.query '"SELECT stackTrace.topFrame AS T, SUM(weight)
                                        FROM ObjectAllocationSample GROUP BY T"'
                                        maxage=100s

                  $ jcmd <pid> JFR.query '"CAPTION 'Method', 'Percentage'
                                        FORMAT default, normalized;width:10
                                        SELECT stackTrace.topFrame AS T, COUNT(*) AS C
                                        GROUP BY T
                                        FROM ExecutionSample ORDER BY C DESC"'

                  $ jcmd <pid> JFR.query '"CAPTION 'Start', 'GC ID', 'Heap Before GC',
                                        'Heap After GC', 'Longest Pause'
                                        SELECT G.startTime, G.gcId, B.heapUsed,
                                               A.heapUsed, longestPause
                                        FROM GarbageCollection AS G,
                                             GCHeapSummary AS B,
                                             GCHeapSummary AS A
                                        WHERE B.when = 'Before GC' AND A.when = 'After GC'
                                        GROUP BY gcId
                                        ORDER BY G.startTime"'""";
    }

    private String getOptions() {
             // 0123456789001234567890012345678900123456789001234567890012345678900123456789001234567890
        return """
                Syntax : JFR.query [options]

                Options:

                  maxage     (Optional) Length of time for the query to span. (INTEGER followed by
                             's' for seconds 'm' for minutes or 'h' for hours, no default value)

                  maxsize    (Optional) Maximum size for the query to span in bytes if one of
                             the following suffixes is not used: 'm' or 'M' for megabytes OR
                             'g' or 'G' for gigabytes. (STRING, no default value)

                  <query>    (Mandatory) Query, for example '"SELECT * FROM GarbageCollection"'
                             See below for grammar. (STRING, no default value)

                  verbose    (Optional) Display additional information about the query execution.
                             (BOOLEAN, false)

                  width      (Optional) Maximum number of horizontal characters. (BOOLEAN, false)""";
    }

    @Override
    public Argument[] getArgumentInfos() {
        return new Argument[] {
            new Argument("maxage",
                    "Length of time for the query to span, in (s)econds, (m)inutes, (h)ours, or (d)ays, e.g. 60m, or 0 for no limit",
                    "NANOTIME", false, true, "10m", false),
            new Argument("maxsize",
                    "Maximum size for the query to span, in (M)B or (G)B, e.g. 500M, or 0 for no limit",
                    "MEMORY SIZE", false, true, "100M", false),
            new Argument("query", "Query, for example 'SELECT * FROM GarbageCollection'", "STRING", true, false,
                    null, false),
            new Argument("verbose", "Display additional information about the query execution", "BOOLEAN", false,
                    true, "false", false),
            new Argument("width", "Maximum number of horizontal characters", "JULONG", false, true, "100",
                    false), };
    }
}
