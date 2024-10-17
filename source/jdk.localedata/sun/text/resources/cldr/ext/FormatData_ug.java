/*
 * Copyright (c) 2012, 2024, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (c) 1991-2022 Unicode, Inc. All rights reserved.
 * Distributed under the Terms of Use in https://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of the Unicode data files and any associated documentation
 * (the "Data Files") or Unicode software and any associated documentation
 * (the "Software") to deal in the Data Files or Software
 * without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, and/or sell copies of
 * the Data Files or Software, and to permit persons to whom the Data Files
 * or Software are furnished to do so, provided that either
 * (a) this copyright and permission notice appear with all copies
 * of the Data Files or Software, or
 * (b) this copyright and permission notice appear in associated
 * Documentation.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF
 * ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT OF THIRD PARTY RIGHTS.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS
 * NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL
 * DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder
 * shall not be used in advertising or otherwise to promote the sale,
 * use or other dealings in these Data Files or Software without prior
 * written authorization of the copyright holder.
 */

package sun.text.resources.cldr.ext;

import java.util.ListResourceBundle;

public class FormatData_ug extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String metaValue_generic_DateFormatItem_Gy = "y G";
        final String[] metaValue_MonthNames = new String[] {
            "\u064a\u0627\u0646\u06cb\u0627\u0631",
            "\u0641\u06d0\u06cb\u0631\u0627\u0644",
            "\u0645\u0627\u0631\u062a",
            "\u0626\u0627\u067e\u0631\u06d0\u0644",
            "\u0645\u0627\u064a",
            "\u0626\u0649\u064a\u06c7\u0646",
            "\u0626\u0649\u064a\u06c7\u0644",
            "\u0626\u0627\u06cb\u063a\u06c7\u0633\u062a",
            "\u0633\u06d0\u0646\u062a\u06d5\u0628\u0649\u0631",
            "\u0626\u06c6\u0643\u062a\u06d5\u0628\u0649\u0631",
            "\u0646\u0648\u064a\u0627\u0628\u0649\u0631",
            "\u062f\u06d0\u0643\u0627\u0628\u0649\u0631",
            "",
        };
        final String[] metaValue_generic_DayNames = new String[] {
            "\u064a\u06d5\u0643\u0634\u06d5\u0646\u0628\u06d5",
            "\u062f\u06c8\u0634\u06d5\u0646\u0628\u06d5",
            "\u0633\u06d5\u064a\u0634\u06d5\u0646\u0628\u06d5",
            "\u0686\u0627\u0631\u0634\u06d5\u0646\u0628\u06d5",
            "\u067e\u06d5\u064a\u0634\u06d5\u0646\u0628\u06d5",
            "\u062c\u06c8\u0645\u06d5",
            "\u0634\u06d5\u0646\u0628\u06d5",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "\u064a\u06d5",
            "\u062f\u06c8",
            "\u0633\u06d5",
            "\u0686\u0627",
            "\u067e\u06d5",
            "\u062c\u06c8",
            "\u0634\u06d5",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "\u064a",
            "\u062f",
            "\u0633",
            "\u0686",
            "\u067e",
            "\u062c",
            "\u0634",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "\u0628\u0649\u0631\u0649\u0646\u0686\u0649 \u067e\u06d5\u0633\u0649\u0644",
            "\u0626\u0649\u0643\u0643\u0649\u0646\u0686\u0649 \u067e\u06d5\u0633\u0649\u0644",
            "\u0626\u06c8\u0686\u0649\u0646\u0686\u0649 \u067e\u06d5\u0633\u0649\u0644",
            "\u062a\u06c6\u062a\u0649\u0646\u0686\u0649 \u067e\u06d5\u0633\u0649\u0644",
        };
        final String[] metaValue_generic_QuarterAbbreviations = new String[] {
            "1-\u067e\u06d5\u0633\u0649\u0644",
            "2-\u067e\u06d5\u0633\u0649\u0644",
            "3-\u067e\u06d5\u0633\u0649\u0644",
            "4-\u067e\u06d5\u0633\u0649\u0644",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "\u0686\u06c8\u0634\u062a\u0649\u0646 \u0628\u06c7\u0631\u06c7\u0646",
            "\u0686\u06c8\u0634\u062a\u0649\u0646 \u0643\u06d0\u064a\u0649\u0646",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
        };
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "\u0628",
            "\u0643",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
        };
        final String[] metaValue_generic_abbreviated_AmPmMarkers = new String[] {
            "\u0686.\u0628",
            "\u0686.\u0643",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
        };
        final String[] metaValue_Eras = new String[] {
            "BCE",
            "\u0645\u0649\u0644\u0627\u062f\u0649\u064a\u06d5",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "HH:mm:ss zzzz",
            "HH:mm:ss z",
            "HH:mm:ss",
            "HH:mm",
        };
        final String[] metaValue_generic_DateTimePatterns = new String[] {
            "{1} {0}",
            "{1} {0}",
            "{1}\u060c {0}",
            "{1}\u060c {0}",
        };
        final String metaValue_generic_DateFormatItem_yw = "Y\u060c w-\u06be\u06d5\u067e\u062a\u06d5";
        final String metaValue_generic_DateFormatItem_MMMMd = "d-MMMM";
        final String metaValue_generic_DateFormatItem_MMMEd = "d-MMM\u060c E";
        final String metaValue_generic_DateFormatItem_MMMd = "d-MMM";
        final String metaValue_generic_DateFormatItem_MMMMW = "MMMM\u060c W-\u06be\u06d5\u067e\u062a\u06d5";
        final String metaValue_generic_DateFormatItem_GyMMM = "y MMM G";
        final String metaValue_generic_DateFormatItem_yMMMEd = "y d-MMM\u060c E";
        final String metaValue_generic_DateFormatItem_yMEd = "y-d-M\u060c E";
        final String metaValue_generic_DateFormatItem_GyMMMd = "y d-MMM G";
        final String metaValue_generic_DateFormatItem_yMMMd = "y d-MMM";
        final String metaValue_generic_DateFormatItem_Md = "d-M";
        final String metaValue_generic_DateFormatItem_Ed = "d E";
        final String metaValue_generic_DateFormatItem_MEd = "d-M\u060c E";
        final String metaValue_generic_DateFormatItem_GyMMMEd = "y d-MMM\u060c E G";
        final String metaValue_generic_DateFormatItem_yMd = "y-d-M";
        final String metaValue_generic_DateFormatItem_yM = "M-y";
        final String[] metaValue_generic_QuarterNarrows = new String[] {
            "1",
            "2",
            "3",
            "4",
        };
        final String[] metaValue_java_time_buddhist_long_Eras = new String[] {
            "BC",
            "\u0628\u06c7\u062f\u062f\u0627 \u064a\u0649\u0644\u0646\u0627\u0645\u06d5\u0633\u0649",
        };
        final String[] metaValue_java_time_buddhist_Eras = new String[] {
            "BC",
            "BE",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE\u060c MMMM d\u060c y G",
            "MMMM d\u060c y G",
            "MMM d\u060c y G",
            "M/d/y GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE\u060c MMMM d\u060c y GGGG",
            "MMMM d\u060c y GGGG",
            "MMM d\u060c y GGGG",
            "M/d/y G",
        };
        final String metaValue_generic_DateFormatItem_hmv = "h:mm a v";
        final String metaValue_generic_DateFormatItem_hmsv = "h:mm:ss a v";
        final String metaValue_generic_DateFormatItem_yQQQ = "y QQQ";
        final String metaValue_generic_DateFormatItem_Hmsv = "HH:mm:ss v";
        final String metaValue_generic_DateFormatItem_y = "y";
        final String metaValue_generic_DateFormatItem_yMMM = "y MMM";
        final String metaValue_generic_DateFormatItem_Hmv = "HH:mm v";
        final String metaValue_generic_DateFormatItem_yMMMM = "y MMMM";
        final String metaValue_generic_DateFormatItem_yQQQQ = "y QQQQ";
        final String metaValue_buddhist_DateFormatItem_hm = "h:mm a";
        final String metaValue_buddhist_DateFormatItem_Ehm = "E h:mm a";
        final String metaValue_buddhist_DateFormatItem_hms = "h:mm:ss a";
        final String metaValue_buddhist_DateFormatItem_Hm = "HH:mm";
        final String metaValue_buddhist_DateFormatItem_EHm = "E HH:mm";
        final String metaValue_buddhist_DateFormatItem_E = "ccc";
        final String metaValue_buddhist_DateFormatItem_H = "HH";
        final String metaValue_buddhist_DateFormatItem_M = "L";
        final String metaValue_buddhist_DateFormatItem_d = "d";
        final String metaValue_buddhist_DateFormatItem_h = "h a";
        final String metaValue_buddhist_DateFormatItem_Ehms = "E h:mm:ss a";
        final String metaValue_buddhist_DateFormatItem_ms = "mm:ss";
        final String metaValue_buddhist_DateFormatItem_EHms = "E HH:mm:ss";
        final String metaValue_buddhist_DateFormatItem_MMM = "LLL";
        final String metaValue_buddhist_DateFormatItem_Hms = "HH:mm:ss";
        final String[] metaValue_java_time_roc_long_Eras = new String[] {
            "\u062c\u06c7\u06ad\u062e\u06c7\u0627 \u0645\u0649\u0646\u06af\u0648\u062f\u0649\u0646 \u0628\u06c7\u0631\u06c7\u0646",
            "\u0645\u0649\u0646\u06af\u0648",
        };
        final String[] metaValue_java_time_roc_Eras = new String[] {
            "Before R.O.C.",
            "\u0645\u0649\u0646\u06af\u0648",
        };
        final String[] metaValue_islamic_MonthNames = new String[] {
            "\u0645\u06c7\u06be\u06d5\u0631\u0631\u06d5\u0645",
            "\u0633\u06d5\u067e\u06d5\u0631",
            "\u0631\u06d5\u0628\u0649\u0626\u06c7\u0644\u0626\u06d5\u06cb\u06cb\u06d5\u0644",
            "\u0631\u06d5\u0628\u0649\u0626\u06c7\u0644\u0626\u0627\u062e\u0649\u0631",
            "\u062c\u06d5\u0645\u0627\u062f\u0649\u064a\u06d5\u0644\u0626\u06d5\u06cb\u06cb\u06d5\u0644",
            "\u062c\u06d5\u0645\u0627\u062f\u0649\u064a\u06d5\u0644\u0626\u0627\u062e\u0649\u0631",
            "\u0631\u06d5\u062c\u06d5\u0628",
            "\u0634\u06d5\u0626\u0628\u0627\u0646",
            "\u0631\u0627\u0645\u0649\u0632\u0627\u0646",
            "\u0634\u06d5\u06cb\u06cb\u0627\u0644",
            "\u0632\u06c7\u0644\u0642\u06d5\u0626\u062f\u06d5",
            "\u0632\u06c7\u0644\u06be\u06d5\u062c\u062c\u06d5",
            "",
        };
        final String[] metaValue_java_time_islamic_long_Eras = new String[] {
            "",
            "\u06be\u0649\u062c\u0631\u0649\u064a\u06d5",
        };
        final String metaValue_generic_DateFormatItem_yyyyMMM = "MMM y G";
        final String metaValue_calendarname_gregorian = "\u0645\u0649\u0644\u0627\u062f\u0649\u064a\u06d5 \u064a\u0649\u0644\u0646\u0627\u0645\u06d5\u0633\u0649";
        final Object[][] data = new Object[][] {
            { "generic.DayNames", metaValue_generic_DayNames },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "generic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "generic.DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "generic.DateFormatItem.yyyyQQQQ", "QQQQ y G" },
            { "generic.DateFormatItem.yyyyMMMd", "MMM d\u060c y G" },
            { "generic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "generic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "generic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "generic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "generic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "generic.DateFormatItem.yyyy", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "generic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "generic.DateFormatItem.yyyyMMMEd", "E\u060c MMM d\u060c y G" },
            { "generic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "generic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DateFormatItem.yyyyMEd", "E\u060c M/d/y GGGGG" },
            { "generic.DateFormatItem.yyyyMd", "M/d/y GGGGG" },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "generic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.yyyyQQQ", "QQQ y G" },
            { "generic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "generic.DateFormatItem.yyyyM", "M/y GGGGG" },
            { "generic.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "generic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "MonthNames", metaValue_MonthNames },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "MonthAbbreviations", metaValue_MonthNames },
            { "standalone.MonthAbbreviations", metaValue_MonthNames },
            { "DayNames", metaValue_generic_DayNames },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "standalone.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "standalone.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "long.Eras",
                new String[] {
                    "\u0645\u0649\u0644\u0627\u062f\u0649\u064a\u06d5\u062f\u0649\u0646 \u0628\u06c7\u0631\u06c7\u0646",
                    "\u0645\u0649\u0644\u0627\u062f\u0649\u064a\u06d5",
                }
            },
            { "Eras", metaValue_Eras },
            { "narrow.Eras", metaValue_Eras },
            { "field.era", "\u0645\u0649\u0644\u0627\u062f\u0649\u064a\u06d5" },
            { "field.year", "\u064a\u0649\u0644" },
            { "field.month", "\u0626\u0627\u064a" },
            { "field.week", "\u06be\u06d5\u067e\u062a\u06d5" },
            { "field.weekday", "\u06be\u06d5\u067e\u062a\u06d5 \u0643\u06c8\u0646\u0644\u0649\u0631\u0649" },
            { "field.dayperiod", "\u0686\u06c8\u0634\u062a\u0649\u0646 \u0628\u06c7\u0631\u06c7\u0646/\u0686\u06c8\u0634\u062a\u0649\u0646 \u0643\u06d0\u064a\u0649\u0646" },
            { "field.hour", "\u0633\u0627\u0626\u06d5\u062a" },
            { "timezone.regionFormat", "{0} \u06cb\u0627\u0642\u062a\u0649" },
            { "timezone.regionFormat.daylight", "{0} \u064a\u0627\u0632\u0644\u0649\u0642 \u06cb\u0627\u0642\u062a\u0649" },
            { "timezone.regionFormat.standard", "{0} \u0626\u06c6\u0644\u0686\u06d5\u0645\u0644\u0649\u0643 \u06cb\u0627\u0642\u062a\u0649" },
            { "field.minute", "\u0645\u0649\u0646\u06c7\u062a" },
            { "field.second", "\u0633\u06d0\u0643\u06c7\u0646\u062a" },
            { "field.zone", "\u06cb\u0627\u0642\u0649\u062a \u0631\u0627\u064a\u0648\u0646\u0649" },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "DatePatterns",
                new String[] {
                    "y d-MMMM\u060c EEEE",
                    "d-MMMM\u060c y",
                    "d-MMM\u060c y",
                    "y-MM-dd",
                }
            },
            { "DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "PluralRules", "one:n = 1" },
            { "DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthNames },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.DayNarrows", metaValue_generic_DayNarrows },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "buddhist.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "java.time.buddhist.Eras", metaValue_java_time_buddhist_Eras },
            { "buddhist.Eras", metaValue_java_time_buddhist_Eras },
            { "java.time.buddhist.narrow.Eras", metaValue_java_time_buddhist_Eras },
            { "buddhist.narrow.Eras", metaValue_java_time_buddhist_Eras },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "buddhist.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "buddhist.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "buddhist.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "buddhist.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "buddhist.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "buddhist.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "buddhist.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "buddhist.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "buddhist.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "buddhist.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "buddhist.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "buddhist.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "buddhist.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "buddhist.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "buddhist.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "buddhist.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "buddhist.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "buddhist.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "buddhist.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "buddhist.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "buddhist.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "buddhist.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "japanese.MonthAbbreviations", metaValue_MonthNames },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "japanese.DayNarrows", metaValue_generic_DayNarrows },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "japanese.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "japanese.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "japanese.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.japanese.DatePatterns",
                new String[] {
                    "EEEE, MMMM d\u060c y G",
                    "MMMM d\u060c y G",
                    "MMM d\u060c y G",
                    "M/d/y GGGGG",
                }
            },
            { "japanese.DatePatterns",
                new String[] {
                    "EEEE, MMMM d\u060c y GGGG",
                    "MMMM d\u060c y GGGG",
                    "MMM d\u060c y GGGG",
                    "M/d/y G",
                }
            },
            { "japanese.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "japanese.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "japanese.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "japanese.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "japanese.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "japanese.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "japanese.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "japanese.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "japanese.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "japanese.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "japanese.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "japanese.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "japanese.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "japanese.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "japanese.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "japanese.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "japanese.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "japanese.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "japanese.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "japanese.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "japanese.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "japanese.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "japanese.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "japanese.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "japanese.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "roc.MonthNames", metaValue_MonthNames },
            { "roc.MonthAbbreviations", metaValue_MonthNames },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "roc.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "java.time.roc.Eras", metaValue_java_time_roc_Eras },
            { "roc.Eras", metaValue_java_time_roc_Eras },
            { "java.time.roc.narrow.Eras", metaValue_java_time_roc_Eras },
            { "roc.narrow.Eras", metaValue_java_time_roc_Eras },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "roc.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "roc.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "roc.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "roc.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "roc.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "roc.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "roc.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "roc.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "roc.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "roc.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "roc.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "roc.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "roc.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "roc.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "roc.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "roc.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "roc.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "roc.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "roc.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "roc.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "roc.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "roc.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "roc.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "roc.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "roc.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic.MonthNames", metaValue_islamic_MonthNames },
            { "islamic.MonthAbbreviations", metaValue_islamic_MonthNames },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "java.time.islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "java.time.islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.islamic.DatePatterns",
                new String[] {
                    "EEEE\u060c d MMMM\u060c y G",
                    "d MMMM\u060c y G",
                    "d MMM\u060c y G",
                    "d\u200f/M\u200f/y GGGGG",
                }
            },
            { "islamic.DatePatterns",
                new String[] {
                    "EEEE\u060c d MMMM\u060c y GGGG",
                    "d MMMM\u060c y GGGG",
                    "d MMM\u060c y GGGG",
                    "d\u200f/M\u200f/y G",
                }
            },
            { "islamic.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "islamic.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "islamic.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "islamic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "islamic.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "islamic.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "islamic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "islamic.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "islamic.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "islamic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "islamic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "islamic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DateFormatItem.yyyyMEd", "E\u060c d/\u200fM/\u200fy G" },
            { "islamic.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "islamic.DateFormatItem.yyyyMd", "d\u200f/M\u200f/y G" },
            { "islamic.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "islamic.DateFormatItem.yyyyM", "M\u200f/y G" },
            { "islamic.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic-civil.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "islamic-civil.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "islamic-civil.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "islamic-civil.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-civil.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic-civil.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic-civil.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-civil.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "islamic-civil.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "islamic-civil.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "islamic-civil.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-civil.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "islamic-civil.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic-civil.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "islamic-civil.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-civil.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "islamic-civil.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-civil.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "islamic-civil.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-civil.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic-civil.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "islamic-civil.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-civil.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "islamic-civil.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic-civil.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-civil.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-civil.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic-umalqura.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "islamic-umalqura.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "islamic-umalqura.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "islamic-umalqura.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-umalqura.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic-umalqura.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic-umalqura.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-umalqura.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "islamic-umalqura.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "islamic-umalqura.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "islamic-umalqura.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-umalqura.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "islamic-umalqura.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic-umalqura.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "islamic-umalqura.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-umalqura.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-umalqura.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "islamic-umalqura.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-umalqura.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "islamic-umalqura.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic-umalqura.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "islamic-umalqura.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "islamic-umalqura.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic-umalqura.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-umalqura.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-umalqura.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "calendarname.islamic-civil", "\u0626\u0649\u0633\u0644\u0627\u0645 \u06be\u0649\u062c\u0631\u0649\u064a\u06d5 \u064a\u0649\u0644\u0646\u0627\u0645\u06d5\u0633\u0649 (\u0645\u06d5\u062f\u0649\u0646\u06d5)" },
            { "calendarname.islamic", "\u0626\u0649\u0633\u0644\u0627\u0645 \u06be\u0649\u062c\u0631\u0649\u064a\u06d5 \u064a\u0649\u0644\u0646\u0627\u0645\u06d5\u0633\u0649" },
            { "calendarname.buddhist", "\u0628\u06c7\u062f\u062f\u0627 \u064a\u0649\u0644\u0646\u0627\u0645\u06d5\u0633\u0649" },
            { "calendarname.japanese", "\u064a\u0627\u067e\u0648\u0646\u0649\u064a\u06d5 \u064a\u0649\u0644\u0646\u0627\u0645\u06d5\u0633\u0649" },
            { "calendarname.roc", "\u0645\u0649\u0646\u06af\u0648 \u064a\u0649\u0644\u0646\u0627\u0645\u06d5\u0633\u0649" },
            { "calendarname.islamic-umalqura", "\u0626\u0649\u0633\u0644\u0627\u0645 \u06be\u0649\u062c\u0631\u0649\u064a\u06d5 \u064a\u0649\u0644\u0646\u0627\u0645\u06d5\u0633\u0649 (\u0626\u06c7\u0645 \u0626\u06d5\u0644\u0642\u06c7\u0631\u0627)" },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
            { "latn.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                    "",
                    "",
                }
            },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4#,##0.00",
                    "#,##0%",
                    "\u00a4#,##0.00;(\u00a4#,##0.00)",
                }
            },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0\u0645\u0649\u06ad other:0\u0645\u0649\u06ad}",
                    "{one:00\u0645\u0649\u06ad other:00\u0645\u0649\u06ad}",
                    "{one:000\u0645\u0649\u06ad other:000\u0645\u0649\u06ad}",
                    "{one:0\u0645\u0649\u0644\u064a\u0648\u0646 other:0\u0645\u0649\u0644\u064a\u0648\u0646}",
                    "{one:00\u0645\u0649\u0644\u064a\u0648\u0646 other:00\u0645\u0649\u0644\u064a\u0648\u0646}",
                    "{one:000\u0645\u0649\u0644\u064a\u0648\u0646 other:000\u0645\u0649\u0644\u064a\u0648\u0646}",
                    "{one:0\u0645\u0649\u0644\u064a\u0627\u0631\u062f other:0\u0645\u0649\u0644\u064a\u0627\u0631\u062f}",
                    "{one:00\u0645\u0649\u0644\u064a\u0627\u0631\u062f other:00\u0645\u0649\u0644\u064a\u0627\u0631\u062f}",
                    "{one:000\u0645\u0649\u0644\u064a\u0627\u0631\u062f other:000\u0645\u0649\u0644\u064a\u0627\u0631\u062f}",
                    "{one:0T other:0T}",
                    "{one:00T other:00T}",
                    "{one:000T other:000T}",
                }
            },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0' '\u0645\u0649\u06ad other:0' '\u0645\u0649\u06ad}",
                    "{one:00' '\u0645\u0649\u06ad other:00' '\u0645\u0649\u06ad}",
                    "{one:000' '\u0645\u0649\u06ad other:000' '\u0645\u0649\u06ad}",
                    "{one:0' '\u0645\u0649\u0644\u064a\u0648\u0646 other:0' '\u0645\u0649\u0644\u064a\u0648\u0646}",
                    "{one:00' '\u0645\u0649\u0644\u064a\u0648\u0646 other:00' '\u0645\u0649\u0644\u064a\u0648\u0646}",
                    "{one:000' '\u0645\u0649\u0644\u064a\u0648\u0646 other:000' '\u0645\u0649\u0644\u064a\u0648\u0646}",
                    "{one:0' '\u0645\u0649\u0644\u064a\u0627\u0631\u062f other:0' '\u0645\u0649\u0644\u064a\u0627\u0631\u062f}",
                    "{one:00' '\u0645\u0649\u0644\u064a\u0627\u0631\u062f other:00' '\u0645\u0649\u0644\u064a\u0627\u0631\u062f}",
                    "{one:000' '\u0645\u0649\u0644\u064a\u0627\u0631\u062f other:000' '\u0645\u0649\u0644\u064a\u0627\u0631\u062f}",
                    "{one:0' '\u062a\u0649\u0631\u0649\u0644\u064a\u0648\u0646 other:0' '\u062a\u0649\u0631\u0649\u0644\u064a\u0648\u0646}",
                    "{one:00' '\u062a\u0649\u0631\u0649\u0644\u064a\u0648\u0646 other:00' '\u062a\u0649\u0631\u0649\u0644\u064a\u0648\u0646}",
                    "{one:000' '\u062a\u0649\u0631\u0649\u0644\u064a\u0648\u0646 other:000' '\u062a\u0649\u0631\u0649\u0644\u064a\u0648\u0646}",
                }
            },
        };
        return data;
    }
}