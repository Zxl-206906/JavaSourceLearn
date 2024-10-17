/*
 * Copyright (c) 2002, 2014, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.java.swing.plaf.gtk;

import javax.swing.plaf.ColorUIResource;

/**
 * Utility class to convert color names to a color object.
 */
class XColors {

    // No.
    private XColors() {}

    /**
     * Converts a color name to a {@link ColorUIResource}.
     *
     * @param name name of the color
     * @return null, or a {@link java.awt.Color Color} object
     */
    static ColorUIResource lookupColor(String name) {
        return switch (name.toLowerCase()) {
            case "alice blue", "aliceblue" -> new ColorUIResource(240, 248, 255);
            case "antique white", "antiquewhite" -> new ColorUIResource(250, 235, 215);
            case "antiquewhite1" -> new ColorUIResource(255, 239, 219);
            case "antiquewhite2" -> new ColorUIResource(238, 223, 204);
            case "antiquewhite3" -> new ColorUIResource(205, 192, 176);
            case "antiquewhite4" -> new ColorUIResource(139, 131, 120);
            case "aquamarine", "aquamarine1" -> new ColorUIResource(127, 255, 212);
            case "aquamarine2" -> new ColorUIResource(118, 238, 198);
            case "aquamarine3", "medium aquamarine", "mediumaquamarine" -> new ColorUIResource(102, 205, 170);
            case "aquamarine4" -> new ColorUIResource(69, 139, 116);
            case "azure", "azure1" -> new ColorUIResource(240, 255, 255);
            case "azure2" -> new ColorUIResource(224, 238, 238);
            case "azure3" -> new ColorUIResource(193, 205, 205);
            case "azure4" -> new ColorUIResource(131, 139, 139);
            case "beige" -> new ColorUIResource(245, 245, 220);
            case "bisque", "bisque1" -> new ColorUIResource(255, 228, 196);
            case "bisque2" -> new ColorUIResource(238, 213, 183);
            case "bisque3" -> new ColorUIResource(205, 183, 158);
            case "bisque4" -> new ColorUIResource(139, 125, 107);
            case "blanched almond", "blanchedalmond" -> new ColorUIResource(255, 235, 205);
            case "blue", "blue1" -> new ColorUIResource(0, 0, 255);
            case "blue2" -> new ColorUIResource(0, 0, 238);
            case "blue3", "medium blue", "mediumblue" -> new ColorUIResource(0, 0, 205);
            case "blue4", "dark blue", "darkblue" -> new ColorUIResource(0, 0, 139);
            case "blue violet", "blueviolet" -> new ColorUIResource(138, 43, 226);
            case "brown" -> new ColorUIResource(165, 42, 42);
            case "brown1" -> new ColorUIResource(255, 64, 64);
            case "brown2" -> new ColorUIResource(238, 59, 59);
            case "brown3" -> new ColorUIResource(205, 51, 51);
            case "brown4" -> new ColorUIResource(139, 35, 35);
            case "burlywood" -> new ColorUIResource(222, 184, 135);
            case "burlywood1" -> new ColorUIResource(255, 211, 155);
            case "burlywood2" -> new ColorUIResource(238, 197, 145);
            case "burlywood3" -> new ColorUIResource(205, 170, 125);
            case "burlywood4" -> new ColorUIResource(139, 115, 85);
            case "cadet blue", "cadetblue" -> new ColorUIResource(95, 158, 160);
            case "cadetblue1" -> new ColorUIResource(152, 245, 255);
            case "cadetblue2" -> new ColorUIResource(142, 229, 238);
            case "cadetblue3" -> new ColorUIResource(122, 197, 205);
            case "cadetblue4" -> new ColorUIResource(83, 134, 139);
            case "chartreuse", "chartreuse1" -> new ColorUIResource(127, 255, 0);
            case "chartreuse2" -> new ColorUIResource(118, 238, 0);
            case "chartreuse3" -> new ColorUIResource(102, 205, 0);
            case "chartreuse4" -> new ColorUIResource(69, 139, 0);
            case "chocolate" -> new ColorUIResource(210, 105, 30);
            case "chocolate1" -> new ColorUIResource(255, 127, 36);
            case "chocolate2" -> new ColorUIResource(238, 118, 33);
            case "chocolate3" -> new ColorUIResource(205, 102, 29);
            case "chocolate4", "saddle brown", "saddlebrown" -> new ColorUIResource(139, 69, 19);
            case "coral" -> new ColorUIResource(255, 127, 80);
            case "coral1" -> new ColorUIResource(255, 114, 86);
            case "coral2" -> new ColorUIResource(238, 106, 80);
            case "coral3" -> new ColorUIResource(205, 91, 69);
            case "coral4" -> new ColorUIResource(139, 62, 47);
            case "cornflower blue", "cornflowerblue" -> new ColorUIResource(100, 149, 237);
            case "cornsilk", "cornsilk1" -> new ColorUIResource(255, 248, 220);
            case "cornsilk2" -> new ColorUIResource(238, 232, 205);
            case "cornsilk3" -> new ColorUIResource(205, 200, 177);
            case "cornsilk4" -> new ColorUIResource(139, 136, 120);
            case "cyan", "cyan1" -> new ColorUIResource(0, 255, 255);
            case "cyan2" -> new ColorUIResource(0, 238, 238);
            case "cyan3" -> new ColorUIResource(0, 205, 205);
            case "cyan4", "dark cyan", "darkcyan" -> new ColorUIResource(0, 139, 139);
            case "dark goldenrod", "darkgoldenrod" -> new ColorUIResource(184, 134, 11);
            case "darkgoldenrod1" -> new ColorUIResource(255, 185, 15);
            case "darkgoldenrod2" -> new ColorUIResource(238, 173, 14);
            case "darkgoldenrod3" -> new ColorUIResource(205, 149, 12);
            case "darkgoldenrod4" -> new ColorUIResource(139, 101, 8);
            case "dark gray", "darkgray", "dark grey", "darkgrey" -> new ColorUIResource(169, 169, 169);
            case "dark green", "darkgreen" -> new ColorUIResource(0, 100, 0);
            case "dark khaki", "darkkhaki" -> new ColorUIResource(189, 183, 107);
            case "dark olive green", "darkolivegreen" -> new ColorUIResource(85, 107, 47);
            case "darkolivegreen1" -> new ColorUIResource(202, 255, 112);
            case "darkolivegreen2" -> new ColorUIResource(188, 238, 104);
            case "darkolivegreen3" -> new ColorUIResource(162, 205, 90);
            case "darkolivegreen4" -> new ColorUIResource(110, 139, 61);
            case "dark orange", "darkorange" -> new ColorUIResource(255, 140, 0);
            case "darkorange1" -> new ColorUIResource(255, 127, 0);
            case "darkorange2" -> new ColorUIResource(238, 118, 0);
            case "darkorange3" -> new ColorUIResource(205, 102, 0);
            case "darkorange4" -> new ColorUIResource(139, 69, 0);
            case "dark orchid", "darkorchid" -> new ColorUIResource(153, 50, 204);
            case "darkorchid1" -> new ColorUIResource(191, 62, 255);
            case "darkorchid2" -> new ColorUIResource(178, 58, 238);
            case "darkorchid3" -> new ColorUIResource(154, 50, 205);
            case "darkorchid4" -> new ColorUIResource(104, 34, 139);
            case "dark salmon", "darksalmon" -> new ColorUIResource(233, 150, 122);
            case "dark sea green", "darkseagreen" -> new ColorUIResource(143, 188, 143);
            case "darkseagreen1" -> new ColorUIResource(193, 255, 193);
            case "darkseagreen2" -> new ColorUIResource(180, 238, 180);
            case "darkseagreen3" -> new ColorUIResource(155, 205, 155);
            case "darkseagreen4" -> new ColorUIResource(105, 139, 105);
            case "dark slate blue", "darkslateblue" -> new ColorUIResource(72, 61, 139);
            case "dark slate gray", "dark slate grey", "darkslategray", "darkslategrey" -> new ColorUIResource(47, 79, 79);
            case "darkslategray1" -> new ColorUIResource(151, 255, 255);
            case "darkslategray2" -> new ColorUIResource(141, 238, 238);
            case "darkslategray3" -> new ColorUIResource(121, 205, 205);
            case "darkslategray4" -> new ColorUIResource(82, 139, 139);
            case "dark turquoise", "darkturquoise" -> new ColorUIResource(0, 206, 209);
            case "dark violet", "darkviolet" -> new ColorUIResource(148, 0, 211);
            case "deep pink", "deeppink", "deeppink1" -> new ColorUIResource(255, 20, 147);
            case "deeppink2" -> new ColorUIResource(238, 18, 137);
            case "deeppink3" -> new ColorUIResource(205, 16, 118);
            case "deeppink4" -> new ColorUIResource(139, 10, 80);
            case "deep sky blue", "deepskyblue", "deepskyblue1" -> new ColorUIResource(0, 191, 255);
            case "deepskyblue2" -> new ColorUIResource(0, 178, 238);
            case "deepskyblue3" -> new ColorUIResource(0, 154, 205);
            case "deepskyblue4" -> new ColorUIResource(0, 104, 139);
            case "dodger blue", "dodgerblue", "dodgerblue1" -> new ColorUIResource(30, 144, 255);
            case "dodgerblue2" -> new ColorUIResource(28, 134, 238);
            case "dodgerblue3" -> new ColorUIResource(24, 116, 205);
            case "dodgerblue4" -> new ColorUIResource(16, 78, 139);
            case "firebrick" -> new ColorUIResource(178, 34, 34);
            case "firebrick1" -> new ColorUIResource(255, 48, 48);
            case "firebrick2" -> new ColorUIResource(238, 44, 44);
            case "firebrick3" -> new ColorUIResource(205, 38, 38);
            case "firebrick4" -> new ColorUIResource(139, 26, 26);
            case "floral white", "floralwhite" -> new ColorUIResource(255, 250, 240);
            case "forest green", "forestgreen" -> new ColorUIResource(34, 139, 34);
            case "gainsboro" -> new ColorUIResource(220, 220, 220);
            case "ghost white", "ghostwhite" -> new ColorUIResource(248, 248, 255);
            case "gold", "gold1" -> new ColorUIResource(255, 215, 0);
            case "gold2" -> new ColorUIResource(238, 201, 0);
            case "gold3" -> new ColorUIResource(205, 173, 0);
            case "gold4" -> new ColorUIResource(139, 117, 0);
            case "goldenrod" -> new ColorUIResource(218, 165, 32);
            case "goldenrod1" -> new ColorUIResource(255, 193, 37);
            case "goldenrod2" -> new ColorUIResource(238, 180, 34);
            case "goldenrod3" -> new ColorUIResource(205, 155, 29);
            case "goldenrod4" -> new ColorUIResource(139, 105, 20);
            case "gray", "grey" -> new ColorUIResource(190, 190, 190);
            case "gray0", "grey0", "black" -> new ColorUIResource(0, 0, 0);
            case "gray1", "grey1" -> new ColorUIResource(3, 3, 3);
            case "gray2", "grey2" -> new ColorUIResource(5, 5, 5);
            case "gray3", "grey3" -> new ColorUIResource(8, 8, 8);
            case "gray4", "grey4" -> new ColorUIResource(10, 10, 10);
            case "gray5", "grey5" -> new ColorUIResource(13, 13, 13);
            case "gray6", "grey6" -> new ColorUIResource(15, 15, 15);
            case "gray7", "grey7" -> new ColorUIResource(18, 18, 18);
            case "gray8", "grey8" -> new ColorUIResource(20, 20, 20);
            case "gray9", "grey9" -> new ColorUIResource(23, 23, 23);
            case "gray10", "grey10" -> new ColorUIResource(26, 26, 26);
            case "gray11", "grey11" -> new ColorUIResource(28, 28, 28);
            case "gray12", "grey12" -> new ColorUIResource(31, 31, 31);
            case "gray13", "grey13" -> new ColorUIResource(33, 33, 33);
            case "gray14", "grey14" -> new ColorUIResource(36, 36, 36);
            case "gray15", "grey15" -> new ColorUIResource(38, 38, 38);
            case "gray16", "grey16" -> new ColorUIResource(41, 41, 41);
            case "gray17", "grey17" -> new ColorUIResource(43, 43, 43);
            case "gray18", "grey18" -> new ColorUIResource(46, 46, 46);
            case "gray19", "grey19" -> new ColorUIResource(48, 48, 48);
            case "gray20", "grey20" -> new ColorUIResource(51, 51, 51);
            case "gray21", "grey21" -> new ColorUIResource(54, 54, 54);
            case "gray22", "grey22" -> new ColorUIResource(56, 56, 56);
            case "gray23", "grey23" -> new ColorUIResource(59, 59, 59);
            case "gray24", "grey24" -> new ColorUIResource(61, 61, 61);
            case "gray25", "grey25" -> new ColorUIResource(64, 64, 64);
            case "gray26", "grey26" -> new ColorUIResource(66, 66, 66);
            case "gray27", "grey27" -> new ColorUIResource(69, 69, 69);
            case "gray28", "grey28" -> new ColorUIResource(71, 71, 71);
            case "gray29", "grey29" -> new ColorUIResource(74, 74, 74);
            case "gray30", "grey30" -> new ColorUIResource(77, 77, 77);
            case "gray31", "grey31" -> new ColorUIResource(79, 79, 79);
            case "gray32", "grey32" -> new ColorUIResource(82, 82, 82);
            case "gray33", "grey33" -> new ColorUIResource(84, 84, 84);
            case "gray34", "grey34" -> new ColorUIResource(87, 87, 87);
            case "gray35", "grey35" -> new ColorUIResource(89, 89, 89);
            case "gray36", "grey36" -> new ColorUIResource(92, 92, 92);
            case "gray37", "grey37" -> new ColorUIResource(94, 94, 94);
            case "gray38", "grey38" -> new ColorUIResource(97, 97, 97);
            case "gray39", "grey39" -> new ColorUIResource(99, 99, 99);
            case "gray40", "grey40" -> new ColorUIResource(102, 102, 102);
            case "gray41", "grey41", "dim gray", "dim grey", "dimgray", "dimgrey" -> new ColorUIResource(105, 105, 105);
            case "gray42", "grey42" -> new ColorUIResource(107, 107, 107);
            case "gray43", "grey43" -> new ColorUIResource(110, 110, 110);
            case "gray44", "grey44" -> new ColorUIResource(112, 112, 112);
            case "gray45", "grey45" -> new ColorUIResource(115, 115, 115);
            case "gray46", "grey46" -> new ColorUIResource(117, 117, 117);
            case "gray47", "grey47" -> new ColorUIResource(120, 120, 120);
            case "gray48", "grey48" -> new ColorUIResource(122, 122, 122);
            case "gray49", "grey49" -> new ColorUIResource(125, 125, 125);
            case "gray50", "grey50" -> new ColorUIResource(127, 127, 127);
            case "gray51", "grey51" -> new ColorUIResource(130, 130, 130);
            case "gray52", "grey52" -> new ColorUIResource(133, 133, 133);
            case "gray53", "grey53" -> new ColorUIResource(135, 135, 135);
            case "gray54", "grey54" -> new ColorUIResource(138, 138, 138);
            case "gray55", "grey55" -> new ColorUIResource(140, 140, 140);
            case "gray56", "grey56" -> new ColorUIResource(143, 143, 143);
            case "gray57", "grey57" -> new ColorUIResource(145, 145, 145);
            case "gray58", "grey58" -> new ColorUIResource(148, 148, 148);
            case "gray59", "grey59" -> new ColorUIResource(150, 150, 150);
            case "gray60", "grey60" -> new ColorUIResource(153, 153, 153);
            case "gray61", "grey61" -> new ColorUIResource(156, 156, 156);
            case "gray62", "grey62" -> new ColorUIResource(158, 158, 158);
            case "gray63", "grey63" -> new ColorUIResource(161, 161, 161);
            case "gray64", "grey64" -> new ColorUIResource(163, 163, 163);
            case "gray65", "grey65" -> new ColorUIResource(166, 166, 166);
            case "gray66", "grey66" -> new ColorUIResource(168, 168, 168);
            case "gray67", "grey67" -> new ColorUIResource(171, 171, 171);
            case "gray68", "grey68" -> new ColorUIResource(173, 173, 173);
            case "gray69", "grey69" -> new ColorUIResource(176, 176, 176);
            case "gray70", "grey70" -> new ColorUIResource(179, 179, 179);
            case "gray71", "grey71" -> new ColorUIResource(181, 181, 181);
            case "gray72", "grey72" -> new ColorUIResource(184, 184, 184);
            case "gray73", "grey73" -> new ColorUIResource(186, 186, 186);
            case "gray74", "grey74" -> new ColorUIResource(189, 189, 189);
            case "gray75", "grey75" -> new ColorUIResource(191, 191, 191);
            case "gray76", "grey76" -> new ColorUIResource(194, 194, 194);
            case "gray77", "grey77" -> new ColorUIResource(196, 196, 196);
            case "gray78", "grey78" -> new ColorUIResource(199, 199, 199);
            case "gray79", "grey79" -> new ColorUIResource(201, 201, 201);
            case "gray80", "grey80" -> new ColorUIResource(204, 204, 204);
            case "gray81", "grey81" -> new ColorUIResource(207, 207, 207);
            case "gray82", "grey82" -> new ColorUIResource(209, 209, 209);
            case "gray83", "grey83" -> new ColorUIResource(212, 212, 212);
            case "gray84", "grey84" -> new ColorUIResource(214, 214, 214);
            case "gray85", "grey85" -> new ColorUIResource(217, 217, 217);
            case "gray86", "grey86" -> new ColorUIResource(219, 219, 219);
            case "gray87", "grey87" -> new ColorUIResource(222, 222, 222);
            case "gray88", "grey88" -> new ColorUIResource(224, 224, 224);
            case "gray89", "grey89" -> new ColorUIResource(227, 227, 227);
            case "gray90", "grey90" -> new ColorUIResource(229, 229, 229);
            case "gray91", "grey91" -> new ColorUIResource(232, 232, 232);
            case "gray92", "grey92" -> new ColorUIResource(235, 235, 235);
            case "gray93", "grey93" -> new ColorUIResource(237, 237, 237);
            case "gray94", "grey94" -> new ColorUIResource(240, 240, 240);
            case "gray95", "grey95" -> new ColorUIResource(242, 242, 242);
            case "gray96", "grey96", "white smoke", "whitesmoke" -> new ColorUIResource(245, 245, 245);
            case "gray97", "grey97" -> new ColorUIResource(247, 247, 247);
            case "gray98", "grey98" -> new ColorUIResource(250, 250, 250);
            case "gray99", "grey99" -> new ColorUIResource(252, 252, 252);
            case "gray100", "grey100", "white" -> new ColorUIResource(255, 255, 255);
            case "green yellow", "greenyellow" -> new ColorUIResource(173, 255, 47);
            case "green", "green1" -> new ColorUIResource(0, 255, 0);
            case "green2" -> new ColorUIResource(0, 238, 0);
            case "green3" -> new ColorUIResource(0, 205, 0);
            case "green4" -> new ColorUIResource(0, 139, 0);
            case "honeydew", "honeydew1" -> new ColorUIResource(240, 255, 240);
            case "honeydew2" -> new ColorUIResource(224, 238, 224);
            case "honeydew3" -> new ColorUIResource(193, 205, 193);
            case "honeydew4" -> new ColorUIResource(131, 139, 131);
            case "hot pink", "hotpink" -> new ColorUIResource(255, 105, 180);
            case "hotpink1" -> new ColorUIResource(255, 110, 180);
            case "hotpink2" -> new ColorUIResource(238, 106, 167);
            case "hotpink3" -> new ColorUIResource(205, 96, 144);
            case "hotpink4" -> new ColorUIResource(139, 58, 98);
            case "indian red", "indianred" -> new ColorUIResource(205, 92, 92);
            case "indianred1" -> new ColorUIResource(255, 106, 106);
            case "indianred2" -> new ColorUIResource(238, 99, 99);
            case "indianred3" -> new ColorUIResource(205, 85, 85);
            case "indianred4" -> new ColorUIResource(139, 58, 58);
            case "ivory", "ivory1" -> new ColorUIResource(255, 255, 240);
            case "ivory2" -> new ColorUIResource(238, 238, 224);
            case "ivory3" -> new ColorUIResource(205, 205, 193);
            case "ivory4" -> new ColorUIResource(139, 139, 131);
            case "khaki" -> new ColorUIResource(240, 230, 140);
            case "khaki1" -> new ColorUIResource(255, 246, 143);
            case "khaki2" -> new ColorUIResource(238, 230, 133);
            case "khaki3" -> new ColorUIResource(205, 198, 115);
            case "khaki4" -> new ColorUIResource(139, 134, 78);
            case "lavender" -> new ColorUIResource(230, 230, 250);
            case "lavender blush", "lavenderblush", "lavenderblush1" -> new ColorUIResource(255, 240, 245);
            case "lavenderblush2" -> new ColorUIResource(238, 224, 229);
            case "lavenderblush3" -> new ColorUIResource(205, 193, 197);
            case "lavenderblush4" -> new ColorUIResource(139, 131, 134);
            case "lawn green", "lawngreen" -> new ColorUIResource(124, 252, 0);
            case "lemon chiffon", "lemonchiffon", "lemonchiffon1" -> new ColorUIResource(255, 250, 205);
            case "lemonchiffon2" -> new ColorUIResource(238, 233, 191);
            case "lemonchiffon3" -> new ColorUIResource(205, 201, 165);
            case "lemonchiffon4" -> new ColorUIResource(139, 137, 112);
            case "light blue", "lightblue" -> new ColorUIResource(173, 216, 230);
            case "lightblue1" -> new ColorUIResource(191, 239, 255);
            case "lightblue2" -> new ColorUIResource(178, 223, 238);
            case "lightblue3" -> new ColorUIResource(154, 192, 205);
            case "lightblue4" -> new ColorUIResource(104, 131, 139);
            case "light coral", "lightcoral" -> new ColorUIResource(240, 128, 128);
            case "light cyan", "lightcyan", "lightcyan1" -> new ColorUIResource(224, 255, 255);
            case "lightcyan2" -> new ColorUIResource(209, 238, 238);
            case "lightcyan3" -> new ColorUIResource(180, 205, 205);
            case "lightcyan4" -> new ColorUIResource(122, 139, 139);
            case "light goldenrod", "lightgoldenrod" -> new ColorUIResource(238, 221, 130);
            case "lightgoldenrod1" -> new ColorUIResource(255, 236, 139);
            case "lightgoldenrod2" -> new ColorUIResource(238, 220, 130);
            case "lightgoldenrod3" -> new ColorUIResource(205, 190, 112);
            case "lightgoldenrod4" -> new ColorUIResource(139, 129, 76);
            case "light goldenrod yellow", "lightgoldenrodyellow" -> new ColorUIResource(250, 250, 210);
            case "light gray", "lightgray", "light grey", "lightgrey" -> new ColorUIResource(211, 211, 211);
            case "light pink", "lightpink" -> new ColorUIResource(255, 182, 193);
            case "lightpink1" -> new ColorUIResource(255, 174, 185);
            case "lightpink2" -> new ColorUIResource(238, 162, 173);
            case "lightpink3" -> new ColorUIResource(205, 140, 149);
            case "lightpink4" -> new ColorUIResource(139, 95, 101);
            case "light salmon", "lightsalmon", "lightsalmon1" -> new ColorUIResource(255, 160, 122);
            case "lightsalmon2" -> new ColorUIResource(238, 149, 114);
            case "lightsalmon3" -> new ColorUIResource(205, 129, 98);
            case "lightsalmon4" -> new ColorUIResource(139, 87, 66);
            case "light sea green", "lightseagreen" -> new ColorUIResource(32, 178, 170);
            case "light sky blue", "lightskyblue" -> new ColorUIResource(135, 206, 250);
            case "lightskyblue1" -> new ColorUIResource(176, 226, 255);
            case "lightskyblue2" -> new ColorUIResource(164, 211, 238);
            case "lightskyblue3" -> new ColorUIResource(141, 182, 205);
            case "lightskyblue4" -> new ColorUIResource(96, 123, 139);
            case "light slate blue", "lightslateblue" -> new ColorUIResource(132, 112, 255);
            case "light slate gray", "light slate grey", "lightslategray", "lightslategrey" -> new ColorUIResource(119, 136, 153);
            case "light steel blue", "lightsteelblue" -> new ColorUIResource(176, 196, 222);
            case "lightsteelblue1" -> new ColorUIResource(202, 225, 255);
            case "lightsteelblue2" -> new ColorUIResource(188, 210, 238);
            case "lightsteelblue3" -> new ColorUIResource(162, 181, 205);
            case "lightsteelblue4" -> new ColorUIResource(110, 123, 139);
            case "light yellow", "lightyellow", "lightyellow1" -> new ColorUIResource(255, 255, 224);
            case "lightyellow2" -> new ColorUIResource(238, 238, 209);
            case "lightyellow3" -> new ColorUIResource(205, 205, 180);
            case "lightyellow4" -> new ColorUIResource(139, 139, 122);
            case "lime green", "limegreen" -> new ColorUIResource(50, 205, 50);
            case "linen" -> new ColorUIResource(250, 240, 230);
            case "magenta", "magenta1" -> new ColorUIResource(255, 0, 255);
            case "magenta2" -> new ColorUIResource(238, 0, 238);
            case "magenta3" -> new ColorUIResource(205, 0, 205);
            case "magenta4", "dark magenta", "darkmagenta" -> new ColorUIResource(139, 0, 139);
            case "maroon" -> new ColorUIResource(176, 48, 96);
            case "maroon1" -> new ColorUIResource(255, 52, 179);
            case "maroon2" -> new ColorUIResource(238, 48, 167);
            case "maroon3" -> new ColorUIResource(205, 41, 144);
            case "maroon4" -> new ColorUIResource(139, 28, 98);
            case "medium orchid", "mediumorchid" -> new ColorUIResource(186, 85, 211);
            case "mediumorchid1" -> new ColorUIResource(224, 102, 255);
            case "mediumorchid2" -> new ColorUIResource(209, 95, 238);
            case "mediumorchid3" -> new ColorUIResource(180, 82, 205);
            case "mediumorchid4" -> new ColorUIResource(122, 55, 139);
            case "medium purple", "mediumpurple" -> new ColorUIResource(147, 112, 219);
            case "mediumpurple1" -> new ColorUIResource(171, 130, 255);
            case "mediumpurple2" -> new ColorUIResource(159, 121, 238);
            case "mediumpurple3" -> new ColorUIResource(137, 104, 205);
            case "mediumpurple4" -> new ColorUIResource(93, 71, 139);
            case "medium sea green", "mediumseagreen" -> new ColorUIResource(60, 179, 113);
            case "medium slate blue", "mediumslateblue" -> new ColorUIResource(123, 104, 238);
            case "medium spring green", "mediumspringgreen" -> new ColorUIResource(0, 250, 154);
            case "medium turquoise", "mediumturquoise" -> new ColorUIResource(72, 209, 204);
            case "medium violet red", "mediumvioletred" -> new ColorUIResource(199, 21, 133);
            case "midnight blue", "midnightblue" -> new ColorUIResource(25, 25, 112);
            case "mint cream", "mintcream" -> new ColorUIResource(245, 255, 250);
            case "misty rose", "mistyrose", "mistyrose1" -> new ColorUIResource(255, 228, 225);
            case "mistyrose2" -> new ColorUIResource(238, 213, 210);
            case "mistyrose3" -> new ColorUIResource(205, 183, 181);
            case "mistyrose4" -> new ColorUIResource(139, 125, 123);
            case "moccasin" -> new ColorUIResource(255, 228, 181);
            case "navajo white", "navajowhite", "navajowhite1" -> new ColorUIResource(255, 222, 173);
            case "navajowhite2" -> new ColorUIResource(238, 207, 161);
            case "navajowhite3" -> new ColorUIResource(205, 179, 139);
            case "navajowhite4" -> new ColorUIResource(139, 121, 94);
            case "navy", "navy blue", "navyblue" -> new ColorUIResource(0, 0, 128);
            case "old lace", "oldlace" -> new ColorUIResource(253, 245, 230);
            case "olive drab", "olivedrab" -> new ColorUIResource(107, 142, 35);
            case "olivedrab1" -> new ColorUIResource(192, 255, 62);
            case "olivedrab2" -> new ColorUIResource(179, 238, 58);
            case "olivedrab3", "yellow green" -> new ColorUIResource(154, 205, 50);
            case "olivedrab4" -> new ColorUIResource(105, 139, 34);
            case "orange", "orange1" -> new ColorUIResource(255, 165, 0);
            case "orange2" -> new ColorUIResource(238, 154, 0);
            case "orange3" -> new ColorUIResource(205, 133, 0);
            case "orange4" -> new ColorUIResource(139, 90, 0);
            case "orange red", "orangered", "orangered1" -> new ColorUIResource(255, 69, 0);
            case "orangered2" -> new ColorUIResource(238, 64, 0);
            case "orangered3" -> new ColorUIResource(205, 55, 0);
            case "orangered4" -> new ColorUIResource(139, 37, 0);
            case "orchid" -> new ColorUIResource(218, 112, 214);
            case "orchid1" -> new ColorUIResource(255, 131, 250);
            case "orchid2" -> new ColorUIResource(238, 122, 233);
            case "orchid3" -> new ColorUIResource(205, 105, 201);
            case "orchid4" -> new ColorUIResource(139, 71, 137);
            case "pale goldenrod", "palegoldenrod" -> new ColorUIResource(238, 232, 170);
            case "pale green", "palegreen" -> new ColorUIResource(152, 251, 152);
            case "palegreen1" -> new ColorUIResource(154, 255, 154);
            case "palegreen2", "light green", "lightgreen" -> new ColorUIResource(144, 238, 144);
            case "palegreen3" -> new ColorUIResource(124, 205, 124);
            case "palegreen4" -> new ColorUIResource(84, 139, 84);
            case "pale turquoise", "paleturquoise" -> new ColorUIResource(175, 238, 238);
            case "paleturquoise1" -> new ColorUIResource(187, 255, 255);
            case "paleturquoise2" -> new ColorUIResource(174, 238, 238);
            case "paleturquoise3" -> new ColorUIResource(150, 205, 205);
            case "paleturquoise4" -> new ColorUIResource(102, 139, 139);
            case "pale violet red", "palevioletred" -> new ColorUIResource(219, 112, 147);
            case "palevioletred1" -> new ColorUIResource(255, 130, 171);
            case "palevioletred2" -> new ColorUIResource(238, 121, 159);
            case "palevioletred3" -> new ColorUIResource(205, 104, 137);
            case "palevioletred4" -> new ColorUIResource(139, 71, 93);
            case "papaya whip", "papayawhip" -> new ColorUIResource(255, 239, 213);
            case "peach puff", "peachpuff", "peachpuff1" -> new ColorUIResource(255, 218, 185);
            case "peachpuff2" -> new ColorUIResource(238, 203, 173);
            case "peachpuff3" -> new ColorUIResource(205, 175, 149);
            case "peachpuff4" -> new ColorUIResource(139, 119, 101);
            case "pink" -> new ColorUIResource(255, 192, 203);
            case "pink1" -> new ColorUIResource(255, 181, 197);
            case "pink2" -> new ColorUIResource(238, 169, 184);
            case "pink3" -> new ColorUIResource(205, 145, 158);
            case "pink4" -> new ColorUIResource(139, 99, 108);
            case "plum" -> new ColorUIResource(221, 160, 221);
            case "plum1" -> new ColorUIResource(255, 187, 255);
            case "plum2" -> new ColorUIResource(238, 174, 238);
            case "plum3" -> new ColorUIResource(205, 150, 205);
            case "plum4" -> new ColorUIResource(139, 102, 139);
            case "powder blue", "powderblue" -> new ColorUIResource(176, 224, 230);
            case "purple" -> new ColorUIResource(160, 32, 240);
            case "purple1" -> new ColorUIResource(155, 48, 255);
            case "purple2" -> new ColorUIResource(145, 44, 238);
            case "purple3" -> new ColorUIResource(125, 38, 205);
            case "purple4" -> new ColorUIResource(85, 26, 139);
            case "red", "red1" -> new ColorUIResource(255, 0, 0);
            case "red2" -> new ColorUIResource(238, 0, 0);
            case "red3" -> new ColorUIResource(205, 0, 0);
            case "red4", "dark red", "darkred" -> new ColorUIResource(139, 0, 0);
            case "rosy brown", "rosybrown" -> new ColorUIResource(188, 143, 143);
            case "rosybrown1" -> new ColorUIResource(255, 193, 193);
            case "rosybrown2" -> new ColorUIResource(238, 180, 180);
            case "rosybrown3" -> new ColorUIResource(205, 155, 155);
            case "rosybrown4" -> new ColorUIResource(139, 105, 105);
            case "royal blue", "royalblue" -> new ColorUIResource(65, 105, 225);
            case "royalblue1" -> new ColorUIResource(72, 118, 255);
            case "royalblue2" -> new ColorUIResource(67, 110, 238);
            case "royalblue3" -> new ColorUIResource(58, 95, 205);
            case "royalblue4" -> new ColorUIResource(39, 64, 139);
            case "salmon" -> new ColorUIResource(250, 128, 114);
            case "salmon1" -> new ColorUIResource(255, 140, 105);
            case "salmon2" -> new ColorUIResource(238, 130, 98);
            case "salmon3" -> new ColorUIResource(205, 112, 84);
            case "salmon4" -> new ColorUIResource(139, 76, 57);
            case "sandy brown", "sandybrown" -> new ColorUIResource(244, 164, 96);
            case "sea green", "seagreen", "seagreen4" -> new ColorUIResource(46, 139, 87);
            case "seagreen1" -> new ColorUIResource(84, 255, 159);
            case "seagreen2" -> new ColorUIResource(78, 238, 148);
            case "seagreen3" -> new ColorUIResource(67, 205, 128);
            case "seashell", "seashell1" -> new ColorUIResource(255, 245, 238);
            case "seashell2" -> new ColorUIResource(238, 229, 222);
            case "seashell3" -> new ColorUIResource(205, 197, 191);
            case "seashell4" -> new ColorUIResource(139, 134, 130);
            case "sienna" -> new ColorUIResource(160, 82, 45);
            case "sienna1" -> new ColorUIResource(255, 130, 71);
            case "sienna2" -> new ColorUIResource(238, 121, 66);
            case "sienna3" -> new ColorUIResource(205, 104, 57);
            case "sienna4" -> new ColorUIResource(139, 71, 38);
            case "sky blue", "skyblue" -> new ColorUIResource(135, 206, 235);
            case "skyblue1" -> new ColorUIResource(135, 206, 255);
            case "skyblue2" -> new ColorUIResource(126, 192, 238);
            case "skyblue3" -> new ColorUIResource(108, 166, 205);
            case "skyblue4" -> new ColorUIResource(74, 112, 139);
            case "slate blue", "slateblue" -> new ColorUIResource(106, 90, 205);
            case "slateblue1" -> new ColorUIResource(131, 111, 255);
            case "slateblue2" -> new ColorUIResource(122, 103, 238);
            case "slateblue3" -> new ColorUIResource(105, 89, 205);
            case "slateblue4" -> new ColorUIResource(71, 60, 139);
            case "slategray", "slategrey", "slate gray", "slate grey" -> new ColorUIResource(112, 128, 144);
            case "slategray1" -> new ColorUIResource(198, 226, 255);
            case "slategray2" -> new ColorUIResource(185, 211, 238);
            case "slategray3" -> new ColorUIResource(159, 182, 205);
            case "slategray4" -> new ColorUIResource(108, 123, 139);
            case "snow", "snow1" -> new ColorUIResource(255, 250, 250);
            case "snow2" -> new ColorUIResource(238, 233, 233);
            case "snow3" -> new ColorUIResource(205, 201, 201);
            case "snow4" -> new ColorUIResource(139, 137, 137);
            case "spring green", "springgreen", "springgreen1" -> new ColorUIResource(0, 255, 127);
            case "springgreen2" -> new ColorUIResource(0, 238, 118);
            case "springgreen3" -> new ColorUIResource(0, 205, 102);
            case "springgreen4" -> new ColorUIResource(0, 139, 69);
            case "steel blue", "steelblue" -> new ColorUIResource(70, 130, 180);
            case "steelblue1" -> new ColorUIResource(99, 184, 255);
            case "steelblue2" -> new ColorUIResource(92, 172, 238);
            case "steelblue3" -> new ColorUIResource(79, 148, 205);
            case "steelblue4" -> new ColorUIResource(54, 100, 139);
            case "tan" -> new ColorUIResource(210, 180, 140);
            case "tan1" -> new ColorUIResource(255, 165, 79);
            case "tan2" -> new ColorUIResource(238, 154, 73);
            case "tan3", "peru" -> new ColorUIResource(205, 133, 63);
            case "tan4" -> new ColorUIResource(139, 90, 43);
            case "thistle" -> new ColorUIResource(216, 191, 216);
            case "thistle1" -> new ColorUIResource(255, 225, 255);
            case "thistle2" -> new ColorUIResource(238, 210, 238);
            case "thistle3" -> new ColorUIResource(205, 181, 205);
            case "thistle4" -> new ColorUIResource(139, 123, 139);
            case "tomato", "tomato1" -> new ColorUIResource(255, 99, 71);
            case "tomato2" -> new ColorUIResource(238, 92, 66);
            case "tomato3" -> new ColorUIResource(205, 79, 57);
            case "tomato4" -> new ColorUIResource(139, 54, 38);
            case "turquoise" -> new ColorUIResource(64, 224, 208);
            case "turquoise1" -> new ColorUIResource(0, 245, 255);
            case "turquoise2" -> new ColorUIResource(0, 229, 238);
            case "turquoise3" -> new ColorUIResource(0, 197, 205);
            case "turquoise4" -> new ColorUIResource(0, 134, 139);
            case "violet" -> new ColorUIResource(238, 130, 238);
            case "violet red", "violetred" -> new ColorUIResource(208, 32, 144);
            case "violetred1" -> new ColorUIResource(255, 62, 150);
            case "violetred2" -> new ColorUIResource(238, 58, 140);
            case "violetred3" -> new ColorUIResource(205, 50, 120);
            case "violetred4" -> new ColorUIResource(139, 34, 82);
            case "wheat" -> new ColorUIResource(245, 222, 179);
            case "wheat1" -> new ColorUIResource(255, 231, 186);
            case "wheat2" -> new ColorUIResource(238, 216, 174);
            case "wheat3" -> new ColorUIResource(205, 186, 150);
            case "wheat4" -> new ColorUIResource(139, 126, 102);
            case "yellow", "yellow1" -> new ColorUIResource(255, 255, 0);
            case "yellow2" -> new ColorUIResource(238, 238, 0);
            case "yellow3" -> new ColorUIResource(205, 205, 0);
            case "yellow4" -> new ColorUIResource(139, 139, 0);
            case "yellowgreen" -> new ColorUIResource(154, 205, 5);

            default -> null;
        };
    }
}
