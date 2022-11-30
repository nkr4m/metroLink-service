package com.r4m.metroLink.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MapBuilder {
	
	
	public List<List<LinkInfo>> linkMap(){
		
		List<List<LinkInfo>> linkMap = new ArrayList<>();
		for(int i=0; i<=320; i++) {
			linkMap.add(new ArrayList<>());
		}
		
//		blue line node linkage <-- start -->
		
//		ex : new LinkInfo(stationCode, eta, underConstruct);
		
		linkMap.get(1).add(new LinkInfo(2,95,false, "Blue"));
		linkMap.get(1).add(new LinkInfo(273,95,false, "Orange"));
		
		linkMap.get(2).add(new LinkInfo(1,95,false, "Blue"));
		linkMap.get(2).add(new LinkInfo(3,95,false, "Blue"));

		linkMap.get(3).add(new LinkInfo(2,95,false, "Blue"));
		linkMap.get(3).add(new LinkInfo(4,95,false, "Blue"));
		
		linkMap.get(4).add(new LinkInfo(3,95,false, "Blue"));
		linkMap.get(4).add(new LinkInfo(5,95,false, "Blue"));
		
		linkMap.get(5).add(new LinkInfo(4,95,false, "Blue"));
		linkMap.get(5).add(new LinkInfo(6,95,false, "Blue"));
		
		linkMap.get(6).add(new LinkInfo(5,95,false, "Blue"));
		linkMap.get(6).add(new LinkInfo(7,95,false, "Blue"));
		
		linkMap.get(7).add(new LinkInfo(6,95,false, "Blue"));
		linkMap.get(7).add(new LinkInfo(8,95,false, "Blue"));
		
		linkMap.get(8).add(new LinkInfo(7,95,false, "Blue"));
		linkMap.get(8).add(new LinkInfo(9,95,false, "Blue"));
		
		linkMap.get(9).add(new LinkInfo(8,95,false, "Blue"));
		linkMap.get(9).add(new LinkInfo(270,95,false, "Grey"));
		linkMap.get(9).add(new LinkInfo(10,95,false, "Blue"));
		
		linkMap.get(10).add(new LinkInfo(9,95,false, "Blue"));
		linkMap.get(10).add(new LinkInfo(11,95,false, "Blue"));
		
		linkMap.get(11).add(new LinkInfo(10,95,false, "Blue"));
		linkMap.get(11).add(new LinkInfo(12,95,false, "Blue"));
		
		linkMap.get(12).add(new LinkInfo(11,95,false, "Blue"));
		linkMap.get(12).add(new LinkInfo(13,95,false, "Blue"));
		
		linkMap.get(13).add(new LinkInfo(12,95,false, "Blue"));
		linkMap.get(13).add(new LinkInfo(14,95,false, "Blue"));
		
		linkMap.get(14).add(new LinkInfo(13,95,false, "Blue"));
		linkMap.get(14).add(new LinkInfo(184,95,false, "Magenta"));
		linkMap.get(14).add(new LinkInfo(15,95,false, "Blue"));
		linkMap.get(14).add(new LinkInfo(183,95,true, "Magenta"));
		
		
		linkMap.get(15).add(new LinkInfo(14,95,false, "Blue"));
		linkMap.get(15).add(new LinkInfo(16,95,false, "Blue"));
		
		linkMap.get(16).add(new LinkInfo(15,95,false, "Blue"));
		linkMap.get(16).add(new LinkInfo(17,95,false, "Blue"));
		
		linkMap.get(17).add(new LinkInfo(16,95,false, "Blue"));
		linkMap.get(17).add(new LinkInfo(18,95,false, "Blue"));
		
		linkMap.get(18).add(new LinkInfo(17,95,false, "Blue"));
		linkMap.get(18).add(new LinkInfo(19,95,false, "Blue"));
		
		linkMap.get(19).add(new LinkInfo(18,95,false, "Blue"));
		linkMap.get(19).add(new LinkInfo(230,95,false, "Pink"));
		linkMap.get(19).add(new LinkInfo(229,95,false, "Pink"));
		linkMap.get(19).add(new LinkInfo(20,95,false, "Blue"));
		
		linkMap.get(20).add(new LinkInfo(19,95,false, "Blue"));
		linkMap.get(20).add(new LinkInfo(21,95,false, "Blue"));
		
		linkMap.get(21).add(new LinkInfo(20,95,false, "Blue"));
		linkMap.get(21).add(new LinkInfo(22,95,false, "Blue"));
		
		linkMap.get(22).add(new LinkInfo(21,95,false, "Blue"));
//		linkMap.get(22).add(new LinkInfo(,95,false)); -> black line
		linkMap.get(22).add(new LinkInfo(113,95,false, "Green"));
		linkMap.get(22).add(new LinkInfo(23,95,false, "Blue"));
		
		linkMap.get(23).add(new LinkInfo(22,95,false, "Blue"));
		linkMap.get(23).add(new LinkInfo(24,95,false, "Blue"));
		
		linkMap.get(24).add(new LinkInfo(23,95,false, "Blue"));
		linkMap.get(24).add(new LinkInfo(25,95,false, "Blue"));
		
		linkMap.get(25).add(new LinkInfo(24,95,false, "Blue"));
		linkMap.get(25).add(new LinkInfo(26,95,false, "Blue"));
		
		linkMap.get(26).add(new LinkInfo(25,95,false, "Blue"));
		linkMap.get(26).add(new LinkInfo(27,95,false, "Blue"));
		
		linkMap.get(27).add(new LinkInfo(26,95,false, "Blue"));
		linkMap.get(27).add(new LinkInfo(28,95,false, "Blue"));
		
		linkMap.get(28).add(new LinkInfo(27,95,false, "Blue"));
		linkMap.get(28).add(new LinkInfo(118,95,false, "Magenta"));
		linkMap.get(28).add(new LinkInfo(29,95,false, "Blue"));
		
		linkMap.get(29).add(new LinkInfo(28,95,false, "Blue"));
		linkMap.get(29).add(new LinkInfo(73,95,false, "Yellow"));
		linkMap.get(29).add(new LinkInfo(72,95,false, "Yellow"));
		linkMap.get(29).add(new LinkInfo(30,95,false, "Blue"));
		
		linkMap.get(30).add(new LinkInfo(29,95,false, "Blue"));
		linkMap.get(30).add(new LinkInfo(31,95,false, "Blue"));
		
		linkMap.get(31).add(new LinkInfo(30,95,false, "Blue"));
		linkMap.get(31).add(new LinkInfo(243,95,false, "Violet"));
		linkMap.get(31).add(new LinkInfo(32,95,false, "Blue"));
		linkMap.get(31).add(new LinkInfo(244,95,false, "Violet"));
		
		linkMap.get(32).add(new LinkInfo(31,95,false, "Blue"));
		linkMap.get(32).add(new LinkInfo(33,95,false, "Blue"));
		
		linkMap.get(33).add(new LinkInfo(32,95,false, "Blue"));
		linkMap.get(33).add(new LinkInfo(34,95,false, "Blue"));
		linkMap.get(33).add(new LinkInfo(121,95,true, "Green"));
		
		linkMap.get(34).add(new LinkInfo(33,95,false, "Blue"));
		linkMap.get(34).add(new LinkInfo(35,95,false, "Blue"));
		linkMap.get(34).add(new LinkInfo(42,95,false, "Blue"));
		
		linkMap.get(35).add(new LinkInfo(34,95,false, "Blue"));
		linkMap.get(35).add(new LinkInfo(36,95,false, "Blue"));
		
		linkMap.get(36).add(new LinkInfo(35,95,false, "Blue"));
		linkMap.get(36).add(new LinkInfo(37,95,false, "Blue"));
		
		linkMap.get(37).add(new LinkInfo(36,95,false, "Blue"));
		linkMap.get(37).add(new LinkInfo(38,95,false, "Blue"));
		
		
		linkMap.get(38).add(new LinkInfo(37,95,false, "Blue"));
		linkMap.get(38).add(new LinkInfo(39,95,false, "Blue"));
		linkMap.get(38).add(new LinkInfo(39,95,false, "Pink"));
		
		linkMap.get(39).add(new LinkInfo(38,95,false, "Blue"));
		linkMap.get(39).add(new LinkInfo(38,95,false, "Pink"));
		linkMap.get(39).add(new LinkInfo(214,95,false, "Pink"));
		linkMap.get(39).add(new LinkInfo(40,95,false, "Blue"));
		
		linkMap.get(40).add(new LinkInfo(39,95,false, "Blue"));
		linkMap.get(40).add(new LinkInfo(41,95,false, "Blue"));
		
		linkMap.get(41).add(new LinkInfo(40,95,false, "Blue"));
		
		linkMap.get(42).add(new LinkInfo(34,95,false, "Blue"));
		linkMap.get(42).add(new LinkInfo(43,95,false, "Blue"));
		
		linkMap.get(43).add(new LinkInfo(42,95,false, "Blue"));
		linkMap.get(43).add(new LinkInfo(219,95,false, "Pink"));
		linkMap.get(43).add(new LinkInfo(218,95,false, "Pink"));
		linkMap.get(43).add(new LinkInfo(44,95,false, "Blue"));
		
		linkMap.get(44).add(new LinkInfo(43,95,false, "Blue"));
		linkMap.get(44).add(new LinkInfo(45,95,false, "Blue"));
		
		linkMap.get(45).add(new LinkInfo(44,95,false, "Blue"));
		linkMap.get(45).add(new LinkInfo(46,95,false, "Blue"));
		
		linkMap.get(46).add(new LinkInfo(45,95,false, "Blue"));
		linkMap.get(46).add(new LinkInfo(47,95,false, "Blue"));
		
		linkMap.get(47).add(new LinkInfo(46,95,false, "Blue"));
		linkMap.get(47).add(new LinkInfo(48,95,false, "Blue"));
		
		linkMap.get(48).add(new LinkInfo(47,95,false, "Blue"));
		linkMap.get(48).add(new LinkInfo(49,95,false, "Blue"));
		
		linkMap.get(49).add(new LinkInfo(48,95,false, "Blue"));
		linkMap.get(49).add(new LinkInfo(205,95,false, "Magenta"));
		linkMap.get(49).add(new LinkInfo(50,95,false, "Blue"));
		
		linkMap.get(50).add(new LinkInfo(49,95,false, "Blue"));
		linkMap.get(50).add(new LinkInfo(51,95,false, "Blue"));
		
		linkMap.get(51).add(new LinkInfo(50,95,false, "Blue"));
		linkMap.get(51).add(new LinkInfo(52,95,false, "Blue"));
		
		linkMap.get(52).add(new LinkInfo(51,95,false, "Blue"));
		linkMap.get(52).add(new LinkInfo(53,95,false, "Blue"));
		
		linkMap.get(53).add(new LinkInfo(52,95,false, "Blue"));
		linkMap.get(53).add(new LinkInfo(54,95,false, "Blue"));
		
		linkMap.get(54).add(new LinkInfo(53,95,false, "Blue"));
		linkMap.get(54).add(new LinkInfo(55,95,false, "Blue"));
		
		linkMap.get(55).add(new LinkInfo(54,95,false, "Blue"));
		linkMap.get(55).add(new LinkInfo(56,95,false, "Blue"));
		
		linkMap.get(56).add(new LinkInfo(55,95,false, "Blue"));
		linkMap.get(56).add(new LinkInfo(57,95,false, "Blue"));
		
		linkMap.get(57).add(new LinkInfo(56,95,false, "Blue"));	
//		blue line node linkage <-- end -->
		
		
//		yellow line node linkage <-- start -->
		linkMap.get(58).add(new LinkInfo(59,95,false, "Yellow"));
		
		linkMap.get(59).add(new LinkInfo(58,95,false, "Yellow"));
		linkMap.get(59).add(new LinkInfo(60,95,false, "Yellow"));
		
		linkMap.get(60).add(new LinkInfo(59,95,false, "Yellow"));
		linkMap.get(60).add(new LinkInfo(173,95,true, "Magenta"));
		linkMap.get(60).add(new LinkInfo(174,95,true, "Magenta"));
		linkMap.get(60).add(new LinkInfo(61,95,false, "Yellow"));
		
		linkMap.get(61).add(new LinkInfo(60,95,false, "Yellow"));
		linkMap.get(61).add(new LinkInfo(62,95,false, "Yellow"));
		
		linkMap.get(62).add(new LinkInfo(61,95,false, "Yellow"));
		linkMap.get(62).add(new LinkInfo(63,95,false, "Yellow"));

		linkMap.get(63).add(new LinkInfo(62,95,false, "Yellow"));
		linkMap.get(63).add(new LinkInfo(233,95,false, "Pink"));
		linkMap.get(63).add(new LinkInfo(172,95,true, "Pink"));
		linkMap.get(63).add(new LinkInfo(172,95,true, "Magenta"));
		linkMap.get(63).add(new LinkInfo(171,95,true, "Magenta"));
		linkMap.get(63).add(new LinkInfo(64,95,false, "Yellow"));
		
		
		linkMap.get(64).add(new LinkInfo(63,95,false, "Yellow"));
		linkMap.get(64).add(new LinkInfo(65,95,false, "Yellow"));
		
		
		linkMap.get(65).add(new LinkInfo(64,95,false, "Yellow"));
		linkMap.get(65).add(new LinkInfo(66,95,false, "Yellow"));
		
		linkMap.get(66).add(new LinkInfo(65,95,false, "Yellow"));
		linkMap.get(66).add(new LinkInfo(67,95,false, "Yellow"));
		
		linkMap.get(67).add(new LinkInfo(66,95,false, "Yellow"));
		linkMap.get(67).add(new LinkInfo(68,95,false, "Yellow"));
		
		
		linkMap.get(68).add(new LinkInfo(67,95,false, "Yellow"));
		linkMap.get(68).add(new LinkInfo(69,95,false, "Yellow"));
		
		linkMap.get(69).add(new LinkInfo(68,95,false, "Yellow"));
		linkMap.get(69).add(new LinkInfo(152,95,false, "Red"));
		linkMap.get(69).add(new LinkInfo(153,95,false, "Red"));
		linkMap.get(69).add(new LinkInfo(241,95,false, "Violet"));
		linkMap.get(69).add(new LinkInfo(70,95,false, "Yellow"));
		
		linkMap.get(70).add(new LinkInfo(69,95,false, "Yellow"));
		linkMap.get(70).add(new LinkInfo(71,95,false, "Yellow"));
		
		linkMap.get(71).add(new LinkInfo(70,95,false, "Yellow"));
		linkMap.get(71).add(new LinkInfo(72,95,false, "Yellow"));
		
		linkMap.get(72).add(new LinkInfo(71,95,false, "Yellow"));
		linkMap.get(72).add(new LinkInfo(118,95,true, "Green"));
		linkMap.get(72).add(new LinkInfo(119,95,true,"Green"));
		linkMap.get(72).add(new LinkInfo(277,95,false, "Orange"));
		linkMap.get(72).add(new LinkInfo(29,95,false, "Yellow"));
		
		linkMap.get(73).add(new LinkInfo(29,95,false, "Yellow"));
		linkMap.get(73).add(new LinkInfo(245,95,false, "Yellow"));
		
//		central sec.
		linkMap.get(245).add(new LinkInfo(73,95,false, "Yellow"));
		linkMap.get(245).add(new LinkInfo(244,95,false, "Violet"));
		linkMap.get(245).add(new LinkInfo(246,95,false, "Violet"));
		linkMap.get(245).add(new LinkInfo(74,95,false, "Yellow"));
		
		linkMap.get(74).add(new LinkInfo(245,95,false, "Yellow"));
		linkMap.get(74).add(new LinkInfo(75,95,false, "Yellow"));
		
		linkMap.get(75).add(new LinkInfo(74,95,false, "Yellow"));
		linkMap.get(75).add(new LinkInfo(76,95,false, "Yellow"));
		
		linkMap.get(76).add(new LinkInfo(75,95,false, "Yellow"));
		linkMap.get(76).add(new LinkInfo(77,95,false, "Yellow"));
		
		linkMap.get(77).add(new LinkInfo(76,95,false, "Yellow"));
		linkMap.get(77).add(new LinkInfo(224,95,false, "Pink"));
		linkMap.get(77).add(new LinkInfo(223,95,false, "Pink"));
		linkMap.get(77).add(new LinkInfo(78,95,false, "Yellow"));
		
		linkMap.get(78).add(new LinkInfo(77,95,false, "Yellow"));
		linkMap.get(78).add(new LinkInfo(79,95,false, "Yellow"));
		
		linkMap.get(79).add(new LinkInfo(78,95,false, "Yellow"));
		linkMap.get(79).add(new LinkInfo(80,95,false, "Yellow"));
		
		linkMap.get(80).add(new LinkInfo(79,95,false, "Yellow"));
		linkMap.get(80).add(new LinkInfo(193,95,false, "Magenta"));
		linkMap.get(80).add(new LinkInfo(194,95,false, "Magenta"));
		linkMap.get(80).add(new LinkInfo(81,95,false, "Yellow"));
		
		
		linkMap.get(81).add(new LinkInfo(80,95,false, "Yellow"));
		linkMap.get(81).add(new LinkInfo(82,95,false, "Yellow"));
		
		
		linkMap.get(82).add(new LinkInfo(81,95,false, "Yellow"));
		linkMap.get(82).add(new LinkInfo(83,95,false, "Yellow"));
		
		linkMap.get(83).add(new LinkInfo(82,95,false, "Yellow"));
		linkMap.get(83).add(new LinkInfo(84,95,false, "Yellow"));
		
		linkMap.get(84).add(new LinkInfo(83,95,false, "Yellow"));
		linkMap.get(84).add(new LinkInfo(85,95,false, "Yellow"));
		
		linkMap.get(85).add(new LinkInfo(84,95,false, "Yellow"));
		linkMap.get(85).add(new LinkInfo(86,95,false, "Yellow"));
		
		linkMap.get(86).add(new LinkInfo(85,95,false, "Yellow"));
		linkMap.get(86).add(new LinkInfo(87,95,false, "Yellow"));
		
		linkMap.get(87).add(new LinkInfo(86,95,false, "Yellow"));
		linkMap.get(87).add(new LinkInfo(88,95,false, "Yellow"));
		
		linkMap.get(88).add(new LinkInfo(87,95,false, "Yellow"));
		linkMap.get(88).add(new LinkInfo(89,95,false, "Yellow"));
		
		linkMap.get(89).add(new LinkInfo(88,95,false, "Yellow"));
		linkMap.get(89).add(new LinkInfo(304,95,false, "Rapid"));
		linkMap.get(89).add(new LinkInfo(303,95,false, "Rapid"));
		linkMap.get(89).add(new LinkInfo(90,95,false, "Yellow"));
		
		linkMap.get(90).add(new LinkInfo(89,95,false, "Yellow"));
		linkMap.get(90).add(new LinkInfo(91,95,false, "Yellow"));
		
		linkMap.get(91).add(new LinkInfo(90,95,false, "Yellow"));
		linkMap.get(91).add(new LinkInfo(92,95,false, "Yellow"));
		
		linkMap.get(92).add(new LinkInfo(91,95,false, "Yellow"));
//		yellow line node linkage <-- end -->
		
		
		
//		green line node linkage <-- start -->
		linkMap.get(93).add(new LinkInfo(94,95,false, "Green"));
		
		linkMap.get(94).add(new LinkInfo(93,95,false, "Green"));
		linkMap.get(94).add(new LinkInfo(95,95,false, "Green"));
		
		linkMap.get(95).add(new LinkInfo(96,95,false, "Green"));
		linkMap.get(95).add(new LinkInfo(97,95,false, "Green"));
		
		linkMap.get(96).add(new LinkInfo(95,95,false, "Green"));
		linkMap.get(96).add(new LinkInfo(97,95,false, "Green"));
		
		linkMap.get(97).add(new LinkInfo(96,95,false, "Green"));
		linkMap.get(97).add(new LinkInfo(98,95,false, "Green"));
		
		linkMap.get(98).add(new LinkInfo(97,95,false, "Green"));
		linkMap.get(98).add(new LinkInfo(99,95,false, "Green"));
		
		linkMap.get(99).add(new LinkInfo(98,95,false, "Green"));
		linkMap.get(99).add(new LinkInfo(100,95,false, "Green"));
		
		linkMap.get(100).add(new LinkInfo(99,95,false, "Green"));
		linkMap.get(100).add(new LinkInfo(101,95,false, "Green"));
		
		linkMap.get(101).add(new LinkInfo(100,95,false, "Green"));
		linkMap.get(101).add(new LinkInfo(102,95,false, "Green"));
		
		linkMap.get(102).add(new LinkInfo(101,95,false, "Green"));
		linkMap.get(102).add(new LinkInfo(103,95,false, "Green"));
		
		linkMap.get(103).add(new LinkInfo(102,95,false, "Green"));
		linkMap.get(103).add(new LinkInfo(104,95,false, "Green"));
		
		linkMap.get(104).add(new LinkInfo(103,95,false, "Green"));
		linkMap.get(104).add(new LinkInfo(105,95,false, "Green"));
		
		linkMap.get(105).add(new LinkInfo(104,95,false, "Green"));
		linkMap.get(105).add(new LinkInfo(106,95,false, "Green"));
		
		linkMap.get(106).add(new LinkInfo(105,95,false, "Green"));
		linkMap.get(106).add(new LinkInfo(107,95,false, "Green"));
		linkMap.get(106).add(new LinkInfo(180,95,true, "Magenta"));
		linkMap.get(106).add(new LinkInfo(181,95,true, "Magenta"));
		
		linkMap.get(107).add(new LinkInfo(106,95,false, "Green"));
		linkMap.get(107).add(new LinkInfo(108,95,false, "Green"));
		
		linkMap.get(108).add(new LinkInfo(107,95,false, "Green"));
		linkMap.get(108).add(new LinkInfo(109,95,false, "Green"));
		
		linkMap.get(109).add(new LinkInfo(108,95,false, "Green"));
		linkMap.get(109).add(new LinkInfo(110,95,false, "Green"));
		
		linkMap.get(110).add(new LinkInfo(109,95,false, "Green"));
		linkMap.get(110).add(new LinkInfo(111,95,false, "Green"));
		
		linkMap.get(111).add(new LinkInfo(110,95,false, "Green"));
		linkMap.get(111).add(new LinkInfo(112,95,false, "Green"));
		
		linkMap.get(112).add(new LinkInfo(111,95,false, "Green"));
		linkMap.get(112).add(new LinkInfo(114,95,false, "Green"));
		linkMap.get(112).add(new LinkInfo(113,95,false, "Green"));
		
		linkMap.get(113).add(new LinkInfo(112,95,false, "Green"));
		linkMap.get(113).add(new LinkInfo(22,95,false, "Green"));
		
		linkMap.get(114).add(new LinkInfo(112,95,false, "Green"));
		linkMap.get(114).add(new LinkInfo(149,95,false, "Red"));
		linkMap.get(114).add(new LinkInfo(115,95,true, "Green"));
		
		linkMap.get(115).add(new LinkInfo(114,95,true, "Green"));
		linkMap.get(115).add(new LinkInfo(116,95,true, "Green"));
		
		linkMap.get(116).add(new LinkInfo(115,95,true, "Green"));
		linkMap.get(116).add(new LinkInfo(117,95,true, "Green"));
		
		linkMap.get(117).add(new LinkInfo(116,95,true, "Green"));
		linkMap.get(117).add(new LinkInfo(118,95,true, "Green"));
		
		linkMap.get(118).add(new LinkInfo(117,95,true, "Green"));
		linkMap.get(118).add(new LinkInfo(168,95,true, "Magenta"));
		linkMap.get(118).add(new LinkInfo(72,95,true, "Green"));
		linkMap.get(118).add(new LinkInfo(28,95,true, "Magenta"));
		
		linkMap.get(119).add(new LinkInfo(72,95,true, "Green"));
		linkMap.get(119).add(new LinkInfo(120,95,true, "Green"));
		
		linkMap.get(120).add(new LinkInfo(119,95,true, "Green"));
		linkMap.get(120).add(new LinkInfo(243,95,false, "Violet"));
		linkMap.get(120).add(new LinkInfo(242,95,false, "Violet"));
		linkMap.get(120).add(new LinkInfo(121,95,true, "Green"));
		
		linkMap.get(121).add(new LinkInfo(120,95,true, "Green"));
		linkMap.get(121).add(new LinkInfo(33,95,true, "Green"));
//		green line node linkage <-- end -->
		
		
		
		
//		red line node linkage <-- end -->
		
		
		linkMap.get(122).add(new LinkInfo(123,95,true, "Red"));
		
		linkMap.get(123).add(new LinkInfo(122,95,true, "Red"));
		linkMap.get(123).add(new LinkInfo(124,95,true, "Red"));
		
		linkMap.get(124).add(new LinkInfo(123,95,true, "Red"));
		linkMap.get(124).add(new LinkInfo(125,95,true, "Red"));
		
		linkMap.get(125).add(new LinkInfo(124,95,true, "Red"));
		linkMap.get(125).add(new LinkInfo(127,95,true, "Red"));
		
		linkMap.get(127).add(new LinkInfo(125,95,true, "Red"));
		linkMap.get(127).add(new LinkInfo(126,95,true, "Red"));
		
		linkMap.get(126).add(new LinkInfo(127,95,true, "Red"));
		linkMap.get(126).add(new LinkInfo(128,95,true, "Red"));
		
		linkMap.get(128).add(new LinkInfo(126,95,true, "Red"));
		linkMap.get(128).add(new LinkInfo(129,95,true, "Red"));
		
		linkMap.get(129).add(new LinkInfo(128,95,true, "Red"));
		linkMap.get(129).add(new LinkInfo(130,95,true, "Red"));
		
		linkMap.get(130).add(new LinkInfo(129,95,true, "Red"));
		linkMap.get(130).add(new LinkInfo(131,95,true, "Red"));
		
		linkMap.get(131).add(new LinkInfo(130,95,true, "Red"));
		linkMap.get(131).add(new LinkInfo(132,95,true, "Red"));
		
		linkMap.get(131).add(new LinkInfo(130,95,true, "Red"));
		linkMap.get(131).add(new LinkInfo(132,95,true, "Red"));
		
		linkMap.get(132).add(new LinkInfo(131,95,true, "Red"));
		linkMap.get(132).add(new LinkInfo(133,95,true, "Red"));
		
		linkMap.get(133).add(new LinkInfo(132,95,true, "Red"));
		linkMap.get(133).add(new LinkInfo(134,95,true, "Red"));
		
		linkMap.get(134).add(new LinkInfo(133,95,true, "Red"));
		linkMap.get(134).add(new LinkInfo(135,95,true, "Red"));
		
		linkMap.get(135).add(new LinkInfo(134,95,true, "Red"));
		linkMap.get(135).add(new LinkInfo(136,95,true, "Red"));
		
		linkMap.get(136).add(new LinkInfo(135,95,true, "Red"));
		linkMap.get(136).add(new LinkInfo(137,95,true, "Red"));
		
		linkMap.get(137).add(new LinkInfo(136,95,true, "Red"));
		linkMap.get(137).add(new LinkInfo(138,95,true, "Red"));
		
		linkMap.get(138).add(new LinkInfo(137,95,true, "Red"));
		linkMap.get(138).add(new LinkInfo(139,95,true, "Red"));
		
		linkMap.get(139).add(new LinkInfo(138,95,true, "Red"));
		linkMap.get(139).add(new LinkInfo(140,95,true, "Red"));
		
		linkMap.get(140).add(new LinkInfo(139,95,true, "Red"));
		linkMap.get(140).add(new LinkInfo(141,95,true, "Red"));
		
		linkMap.get(141).add(new LinkInfo(140,95,true, "Red"));
		linkMap.get(141).add(new LinkInfo(142,95,false, "Red"));
		
		linkMap.get(142).add(new LinkInfo(141,95,false, "Red"));
		linkMap.get(142).add(new LinkInfo(143,95,false, "Red"));
		
		
		linkMap.get(143).add(new LinkInfo(142,95,false, "Red"));
		linkMap.get(143).add(new LinkInfo(144,95,false, "Red"));
		
		linkMap.get(144).add(new LinkInfo(143,95,false, "Red"));
		linkMap.get(144).add(new LinkInfo(176,95,true, "Magenta"));
		linkMap.get(144).add(new LinkInfo(175,95,true, "Magenta"));
		linkMap.get(144).add(new LinkInfo(145,95,false, "Red"));
		
		linkMap.get(145).add(new LinkInfo(144,95,false, "Red"));
		linkMap.get(145).add(new LinkInfo(146,95,false, "Red"));
		
		linkMap.get(146).add(new LinkInfo(145,95,false, "Red"));
		linkMap.get(146).add(new LinkInfo(232,95,false, "Pink"));
		linkMap.get(146).add(new LinkInfo(233,95,false, "Pink"));
		linkMap.get(146).add(new LinkInfo(147,95,false, "Red"));
		
		linkMap.get(147).add(new LinkInfo(146,95,false, "Red"));
		linkMap.get(147).add(new LinkInfo(148,95,false, "Red"));
		
		linkMap.get(148).add(new LinkInfo(147,95,false, "Red"));
		linkMap.get(148).add(new LinkInfo(114,95,false, "Red"));
		
		linkMap.get(149).add(new LinkInfo(114,95,false, "Red"));
		linkMap.get(149).add(new LinkInfo(150,95,false, "Red"));
		
		linkMap.get(150).add(new LinkInfo(149,95,false, "Red"));
		linkMap.get(150).add(new LinkInfo(151,95,false, "Red"));
		
		linkMap.get(151).add(new LinkInfo(150,95,false, "Red"));
		linkMap.get(151).add(new LinkInfo(169,95,true, "Magenta"));
		linkMap.get(151).add(new LinkInfo(168,95,true, "Magenta"));
		linkMap.get(151).add(new LinkInfo(152,95,false, "Red"));
		
		linkMap.get(152).add(new LinkInfo(151,95,false, "Red"));
		linkMap.get(152).add(new LinkInfo(69,95,false, "Red"));
		
		linkMap.get(153).add(new LinkInfo(69,95,false, "Red"));
		linkMap.get(153).add(new LinkInfo(154,95,false, "Red"));
		
		linkMap.get(154).add(new LinkInfo(153,95,false, "Red"));
		linkMap.get(154).add(new LinkInfo(155,95,false, "Red"));
		
		linkMap.get(155).add(new LinkInfo(154,95,false, "Red"));
		linkMap.get(155).add(new LinkInfo(156,95,false, "Red"));
		
		linkMap.get(156).add(new LinkInfo(155,95,false, "Red"));
		linkMap.get(156).add(new LinkInfo(157,95,false, "Red"));
		
		linkMap.get(157).add(new LinkInfo(156,95,false, "Red"));
		linkMap.get(157).add(new LinkInfo(158,95,false, "Red"));
		
		linkMap.get(158).add(new LinkInfo(157,95,false, "Red"));
		linkMap.get(158).add(new LinkInfo(159,95,false, "Red"));
		
		linkMap.get(159).add(new LinkInfo(158,95,false, "Red"));
		linkMap.get(159).add(new LinkInfo(160,95,false, "Red"));
		
		
		linkMap.get(160).add(new LinkInfo(159,95,false, "Red"));
		linkMap.get(160).add(new LinkInfo(161,95,false, "Red"));
		
		linkMap.get(161).add(new LinkInfo(160,95,false, "Red"));
		linkMap.get(161).add(new LinkInfo(162,95,false, "Red"));
		
		linkMap.get(162).add(new LinkInfo(161,95,false, "Red"));
		linkMap.get(162).add(new LinkInfo(163,95,false, "Red"));
		
		linkMap.get(163).add(new LinkInfo(162,95,false, "Red"));
		linkMap.get(163).add(new LinkInfo(164,95,false, "Red"));
		
		linkMap.get(164).add(new LinkInfo(163,95,false, "Red"));
		linkMap.get(164).add(new LinkInfo(165,95,false, "Red"));
		
		linkMap.get(165).add(new LinkInfo(164,95,false, "Red"));
		linkMap.get(165).add(new LinkInfo(166,95,false, "Red"));
		
		linkMap.get(166).add(new LinkInfo(165,95,false, "Red"));
		linkMap.get(166).add(new LinkInfo(167,95,false, "Red"));
		
		linkMap.get(167).add(new LinkInfo(166,95,false, "Red"));
		
//		red line node linkage <-- end -->
		
//		magenta line node linkage <-- start -->
		
		linkMap.get(168).add(new LinkInfo(118,95,true, "Magenta"));
		linkMap.get(168).add(new LinkInfo(151,95,true, "Magenta"));
		
		linkMap.get(169).add(new LinkInfo(151,95,true, "Magenta"));
		linkMap.get(169).add(new LinkInfo(170,95,true, "Magenta"));
		
		linkMap.get(170).add(new LinkInfo(169,95,true, "Magenta"));
		linkMap.get(170).add(new LinkInfo(171,95,true, "Magenta"));
		
		linkMap.get(171).add(new LinkInfo(170,95,true, "Magenta"));
		linkMap.get(171).add(new LinkInfo(63,95,true, "Magenta"));
		
		linkMap.get(172).add(new LinkInfo(63,95,true, "Magenta"));
		linkMap.get(172).add(new LinkInfo(63,95,true, "Pink"));
		linkMap.get(172).add(new LinkInfo(234,95,true, "Pink"));
		linkMap.get(172).add(new LinkInfo(173,95,true, "Magenta"));
		
		linkMap.get(173).add(new LinkInfo(172,95,true, "Magenta"));
		linkMap.get(173).add(new LinkInfo(60,95,true, "Magenta"));
		
		linkMap.get(174).add(new LinkInfo(60,95,true, "Magenta"));
		linkMap.get(174).add(new LinkInfo(175,95,true, "Magenta"));
		
		linkMap.get(175).add(new LinkInfo(174,95,true, "Magenta"));
		linkMap.get(175).add(new LinkInfo(144,95,true, "Magenta"));
		
		linkMap.get(176).add(new LinkInfo(144,95,true, "Magenta"));
		linkMap.get(176).add(new LinkInfo(177,95,true, "Magenta"));
		
		linkMap.get(177).add(new LinkInfo(176,95,true, "Magenta"));
		linkMap.get(177).add(new LinkInfo(178,95,true, "Magenta"));
		
		linkMap.get(178).add(new LinkInfo(177,95,true, "Magenta"));
		linkMap.get(178).add(new LinkInfo(179,95,true, "Magenta"));
		
		linkMap.get(179).add(new LinkInfo(178,95,true, "Magenta"));
		linkMap.get(179).add(new LinkInfo(180,95,true, "Magenta"));
		
		linkMap.get(180).add(new LinkInfo(179,95,true, "Magenta"));
		linkMap.get(180).add(new LinkInfo(106,95,true, "Magenta"));
		
		linkMap.get(181).add(new LinkInfo(106,95,true, "Magenta"));
		linkMap.get(181).add(new LinkInfo(182,95,true, "Magenta"));
		
		linkMap.get(182).add(new LinkInfo(181,95,true, "Magenta"));
		linkMap.get(182).add(new LinkInfo(183,95,true, "Magenta"));
		
		linkMap.get(183).add(new LinkInfo(182,95,true, "Magenta"));
		linkMap.get(183).add(new LinkInfo(14,95,true, "Magenta"));
		
		linkMap.get(184).add(new LinkInfo(14,95,false, "Magenta"));
		linkMap.get(184).add(new LinkInfo(185,95,false, "Magenta"));
		
		linkMap.get(185).add(new LinkInfo(184,95,false, "Magenta"));
		linkMap.get(185).add(new LinkInfo(186,95,false, "Magenta"));
		
		linkMap.get(186).add(new LinkInfo(185,95,false, "Magenta"));
		linkMap.get(186).add(new LinkInfo(187,95,false, "Magenta"));
		
		linkMap.get(187).add(new LinkInfo(186,95,false, "Magenta"));
		linkMap.get(187).add(new LinkInfo(188,95,false, "Magenta"));
		
		linkMap.get(188).add(new LinkInfo(187,95,false, "Magenta"));
		linkMap.get(188).add(new LinkInfo(189,95,false, "Magenta"));
		
		linkMap.get(189).add(new LinkInfo(188,95,false, "Magenta"));
		linkMap.get(189).add(new LinkInfo(190,95,false, "Magenta"));
		
		linkMap.get(190).add(new LinkInfo(189,95,false, "Magenta"));
		linkMap.get(190).add(new LinkInfo(191,95,false, "Magenta"));
		
		linkMap.get(191).add(new LinkInfo(190,95,false, "Magenta"));
		linkMap.get(191).add(new LinkInfo(192,95,false, "Magenta"));
		
		linkMap.get(192).add(new LinkInfo(191,95,false, "Magenta"));
		linkMap.get(192).add(new LinkInfo(193,95,false, "Magenta"));
		
		linkMap.get(193).add(new LinkInfo(192,95,false, "Magenta"));
		linkMap.get(193).add(new LinkInfo(80,95,false, "Magenta"));
		
		linkMap.get(194).add(new LinkInfo(80,95,false, "Magenta"));
		linkMap.get(194).add(new LinkInfo(195,95,false, "Magenta"));
		
		linkMap.get(195).add(new LinkInfo(194,95,false, "Magenta"));
		linkMap.get(195).add(new LinkInfo(196,95,false, "Magenta"));
		
		linkMap.get(196).add(new LinkInfo(195,95,false, "Magenta"));
		linkMap.get(196).add(new LinkInfo(197,95,false, "Magenta"));
		
		linkMap.get(197).add(new LinkInfo(196,95,false, "Magenta"));
		linkMap.get(197).add(new LinkInfo(198,95,false, "Magenta"));
		
		linkMap.get(198).add(new LinkInfo(197,95,false, "Magenta"));
		linkMap.get(198).add(new LinkInfo(252,95,false, "Violet"));
		linkMap.get(198).add(new LinkInfo(251,95,false, "Violet"));
		linkMap.get(198).add(new LinkInfo(199,95,false, "Magenta"));
		
		linkMap.get(199).add(new LinkInfo(198,95,false, "Magenta"));
		linkMap.get(199).add(new LinkInfo(200,95,false, "Magenta"));
		
		linkMap.get(200).add(new LinkInfo(199,95,false, "Magenta"));
		linkMap.get(200).add(new LinkInfo(201,95,false, "Magenta"));
		
		linkMap.get(201).add(new LinkInfo(200,95,false, "Magenta"));
		linkMap.get(201).add(new LinkInfo(202,95,false, "Magenta"));
		
		linkMap.get(202).add(new LinkInfo(201,95,false, "Magenta"));
		linkMap.get(202).add(new LinkInfo(203,95,false, "Magenta"));
		
		linkMap.get(203).add(new LinkInfo(202,95,false, "Magenta"));
		linkMap.get(203).add(new LinkInfo(204,95,false, "Magenta"));
		
		linkMap.get(204).add(new LinkInfo(203,95,false, "Magenta"));
		linkMap.get(204).add(new LinkInfo(205,95,false, "Magenta"));
		
		linkMap.get(205).add(new LinkInfo(204,95,false, "Magenta"));
		linkMap.get(205).add(new LinkInfo(49,95,false, "Magenta"));
//		magenta line node linkage <-- end -->
		
//		pink line node linkage <-- start -->
		
		linkMap.get(206).add(new LinkInfo(207,95,false, "Pink"));
		
		linkMap.get(207).add(new LinkInfo(206,95,false, "Pink"));
		linkMap.get(207).add(new LinkInfo(208,95,false, "Pink"));
		
		linkMap.get(208).add(new LinkInfo(207,95,false, "Pink"));
		linkMap.get(208).add(new LinkInfo(209,95,false, "Pink"));
		
		linkMap.get(209).add(new LinkInfo(208,95,false, "Pink"));
		linkMap.get(209).add(new LinkInfo(240,95,true, "Pink"));
		linkMap.get(209).add(new LinkInfo(210,95,false, "Pink"));
		
		linkMap.get(201).add(new LinkInfo(209,95,false, "Pink"));
		linkMap.get(210).add(new LinkInfo(155,95,false, "Pink"));
		
		linkMap.get(211).add(new LinkInfo(155,95,false, "Pink"));
		linkMap.get(211).add(new LinkInfo(212,95,false, "Pink"));
		
		linkMap.get(212).add(new LinkInfo(211,95,false, "Pink"));
		linkMap.get(212).add(new LinkInfo(213,95,false, "Pink"));
		
		linkMap.get(213).add(new LinkInfo(212,95,false, "Pink"));
		linkMap.get(213).add(new LinkInfo(38,95,false, "Pink"));
		
		linkMap.get(214).add(new LinkInfo(39,95,false, "Pink"));
		linkMap.get(214).add(new LinkInfo(215,95,false, "Pink"));
		
		linkMap.get(215).add(new LinkInfo(214,95,false, "Pink"));
		linkMap.get(215).add(new LinkInfo(216,95,false, "Pink"));
		
		linkMap.get(216).add(new LinkInfo(215,95,false, "Pink"));
		linkMap.get(216).add(new LinkInfo(217,95,false, "Pink"));
		
		linkMap.get(217).add(new LinkInfo(216,95,false, "Pink"));
		linkMap.get(217).add(new LinkInfo(218,95,false, "Pink"));
		
		linkMap.get(218).add(new LinkInfo(217,95,false, "Pink"));
		linkMap.get(218).add(new LinkInfo(43,95,false, "Pink"));
		
		linkMap.get(219).add(new LinkInfo(43,95,false, "Pink"));
		linkMap.get(219).add(new LinkInfo(220,95,false, "Pink"));
		
		linkMap.get(220).add(new LinkInfo(219,95,false, "Pink"));
		linkMap.get(220).add(new LinkInfo(221,95,false, "Pink"));
		
		linkMap.get(221).add(new LinkInfo(220,95,false, "Pink"));
		linkMap.get(221).add(new LinkInfo(222,95,false, "Pink"));
		
		linkMap.get(222).add(new LinkInfo(221,95,false, "Pink"));
		linkMap.get(222).add(new LinkInfo(248,95,false, "Violet"));
		linkMap.get(222).add(new LinkInfo(249,95,false, "Violet"));
		linkMap.get(222).add(new LinkInfo(223,95,false, "Pink"));
		
		linkMap.get(223).add(new LinkInfo(222,95,false, "Pink"));
		linkMap.get(223).add(new LinkInfo(77,95,false, "Pink"));
		
		linkMap.get(224).add(new LinkInfo(77,95,false, "Pink"));
		linkMap.get(224).add(new LinkInfo(225,95,false, "Pink"));
		
		linkMap.get(225).add(new LinkInfo(224,95,false, "Pink"));
		linkMap.get(225).add(new LinkInfo(226,95,false, "Pink"));
		
		linkMap.get(226).add(new LinkInfo(225,95,false, "Pink"));
		linkMap.get(226).add(new LinkInfo(276,95,false, "Pink"));
		
		linkMap.get(276).add(new LinkInfo(226,95,false, "Pink"));
		linkMap.get(276).add(new LinkInfo(227,95,false, "Pink"));
		
		linkMap.get(227).add(new LinkInfo(276,95,false, "Pink"));
		linkMap.get(227).add(new LinkInfo(228,95,false, "Pink"));
		
		linkMap.get(228).add(new LinkInfo(227,95,false, "Pink"));
		linkMap.get(228).add(new LinkInfo(229,95,false, "Pink"));
		
		linkMap.get(229).add(new LinkInfo(228,95,false, "Pink"));
		linkMap.get(229).add(new LinkInfo(19,95,false, "Pink"));
		
		linkMap.get(230).add(new LinkInfo(19,95,false, "Pink"));
		linkMap.get(230).add(new LinkInfo(231,95,false, "Pink"));
		
		linkMap.get(231).add(new LinkInfo(230,95,false, "Pink"));
		linkMap.get(231).add(new LinkInfo(232,95,false, "Pink"));
		
		linkMap.get(232).add(new LinkInfo(231,95,false, "Pink"));
		linkMap.get(232).add(new LinkInfo(146,95,false, "Pink"));
		
		linkMap.get(233).add(new LinkInfo(146,95,false, "Pink"));
		linkMap.get(233).add(new LinkInfo(63,95,false, "Pink"));
		
		linkMap.get(234).add(new LinkInfo(172,95,true, "Pink"));
		linkMap.get(234).add(new LinkInfo(235,95,true, "Pink"));
		
		linkMap.get(235).add(new LinkInfo(234,95,true, "Pink"));
		linkMap.get(235).add(new LinkInfo(236,95,true, "Pink"));
		
		linkMap.get(236).add(new LinkInfo(235,95,true, "Pink"));
		linkMap.get(236).add(new LinkInfo(309,95,true, "Pink"));
		
		linkMap.get(309).add(new LinkInfo(236,95,true, "Pink"));
		linkMap.get(309).add(new LinkInfo(237,95,true, "Pink"));
		
		linkMap.get(237).add(new LinkInfo(309,95,true, "Pink"));
		linkMap.get(237).add(new LinkInfo(238,95,true, "Pink"));
		
		linkMap.get(238).add(new LinkInfo(237,95,true, "Pink"));
		linkMap.get(238).add(new LinkInfo(239,95,true, "Pink"));
		
		linkMap.get(239).add(new LinkInfo(238,95,true, "Pink"));
		linkMap.get(239).add(new LinkInfo(240,95,true, "Pink"));
		
		linkMap.get(240).add(new LinkInfo(239,95,true, "Pink"));
		linkMap.get(240).add(new LinkInfo(209,95,true, "Pink"));

//		pink line node linkage <-- end -->
		

//		voilet line node linkage <-- start -->
		
		linkMap.get(241).add(new LinkInfo(69,95,false, "Violet"));
		linkMap.get(241).add(new LinkInfo(242,95,false, "Violet"));
		
		linkMap.get(242).add(new LinkInfo(241,95,false, "Violet"));
		linkMap.get(242).add(new LinkInfo(120,95,false, "Violet"));
		
		linkMap.get(243).add(new LinkInfo(120,95,false, "Violet"));
		linkMap.get(243).add(new LinkInfo(31,95,false, "Violet"));
		
		linkMap.get(244).add(new LinkInfo(31,95,false, "Violet"));
		linkMap.get(244).add(new LinkInfo(245,95,false, "Violet"));
		
		linkMap.get(246).add(new LinkInfo(245,95,false, "Violet"));
		linkMap.get(246).add(new LinkInfo(247,95,false, "Violet"));
		
		
		linkMap.get(247).add(new LinkInfo(246,95,false, "Violet"));
		linkMap.get(247).add(new LinkInfo(248,95,false, "Violet"));
		
		
		linkMap.get(248).add(new LinkInfo(247,95,false, "Violet"));
		linkMap.get(248).add(new LinkInfo(222,95,false, "Violet"));
		
		linkMap.get(249).add(new LinkInfo(222,95,false, "Violet"));
		linkMap.get(249).add(new LinkInfo(250,95,false, "Violet"));
		
		linkMap.get(250).add(new LinkInfo(249,95,false, "Violet"));
		linkMap.get(250).add(new LinkInfo(251,95,false, "Violet"));
		
		linkMap.get(251).add(new LinkInfo(250,95,false, "Violet"));
		linkMap.get(251).add(new LinkInfo(198,95,false, "Violet"));
		
		linkMap.get(252).add(new LinkInfo(198,95,false, "Violet"));
		linkMap.get(252).add(new LinkInfo(253,95,false, "Violet"));
		
		linkMap.get(253).add(new LinkInfo(252,95,false, "Violet"));
		linkMap.get(253).add(new LinkInfo(254,95,false, "Violet"));
		
		linkMap.get(254).add(new LinkInfo(253,95,false, "Violet"));
		linkMap.get(254).add(new LinkInfo(255,95,false, "Violet"));
		
		linkMap.get(255).add(new LinkInfo(254,95,false, "Violet"));
		linkMap.get(255).add(new LinkInfo(256,95,false, "Violet"));
		
		linkMap.get(256).add(new LinkInfo(255,95,false, "Violet"));
		linkMap.get(256).add(new LinkInfo(257,95,false, "Violet"));
		
		linkMap.get(257).add(new LinkInfo(256,95,false, "Violet"));
		linkMap.get(257).add(new LinkInfo(258,95,false, "Violet"));
		
		linkMap.get(258).add(new LinkInfo(257,95,false, "Violet"));
		linkMap.get(258).add(new LinkInfo(259,95,false, "Violet"));
		
		linkMap.get(259).add(new LinkInfo(258,95,false, "Violet"));
		linkMap.get(259).add(new LinkInfo(260,95,false, "Violet"));
		
		linkMap.get(260).add(new LinkInfo(259,95,false, "Violet"));
		linkMap.get(260).add(new LinkInfo(261,95,false, "Violet"));
		
		linkMap.get(261).add(new LinkInfo(260,95,false, "Violet"));
		linkMap.get(261).add(new LinkInfo(262,95,false, "Violet"));
		
		linkMap.get(262).add(new LinkInfo(261,95,false, "Violet"));
		linkMap.get(262).add(new LinkInfo(263,95,false, "Violet"));
		
		linkMap.get(263).add(new LinkInfo(262,95,false, "Violet"));
		linkMap.get(263).add(new LinkInfo(264,95,false, "Violet"));
		
		linkMap.get(264).add(new LinkInfo(263,95,false, "Violet"));
		linkMap.get(264).add(new LinkInfo(265,95,false, "Violet"));
		
		linkMap.get(265).add(new LinkInfo(264,95,false, "Violet"));
		linkMap.get(265).add(new LinkInfo(266,95,false, "Violet"));
		
		linkMap.get(266).add(new LinkInfo(265,95,false, "Violet"));
		linkMap.get(266).add(new LinkInfo(267,95,false, "Violet"));
		
		linkMap.get(267).add(new LinkInfo(266,95,false, "Violet"));
		linkMap.get(267).add(new LinkInfo(268,95,false, "Violet"));
		
		linkMap.get(268).add(new LinkInfo(267,95,false, "Violet"));
		linkMap.get(268).add(new LinkInfo(269,95,false, "Violet"));
		
		linkMap.get(269).add(new LinkInfo(268,95,false, "Violet"));
		
		
//		voilet line node linkage <-- end -->
		
//		grey line node linkage <-- start -->
		
		linkMap.get(270).add(new LinkInfo(9,95,false, "Grey"));
		linkMap.get(270).add(new LinkInfo(271,95,false, "Grey"));
		
		linkMap.get(271).add(new LinkInfo(270,95,false, "Grey"));
		linkMap.get(271).add(new LinkInfo(272,95,false, "Grey"));
		
		linkMap.get(272).add(new LinkInfo(271,95,false, "Grey"));
				
//		grey line node linkage <-- end -->
		
//		orange line node linkage <-- start -->
		
		linkMap.get(273).add(new LinkInfo(1,95,false, "Orange"));
		linkMap.get(273).add(new LinkInfo(274,95,false, "Orange"));
		
		
		linkMap.get(274).add(new LinkInfo(273,95,false, "Orange"));
		linkMap.get(274).add(new LinkInfo(275,95,false, "Orange"));
		
		linkMap.get(275).add(new LinkInfo(274,95,false, "Orange"));
		linkMap.get(275).add(new LinkInfo(277,95,false, "Orange"));
		
		linkMap.get(277).add(new LinkInfo(275,95,false, "Orange"));
		linkMap.get(277).add(new LinkInfo(72,95,false, "Orange"));
		
//		orange line node linkage <-- end -->
		
//		aqua line node linkage <-- start -->
		
		linkMap.get(278).add(new LinkInfo(279,95,false, "Aqua"));
		
		linkMap.get(279).add(new LinkInfo(278,95,false, "Aqua"));
		linkMap.get(279).add(new LinkInfo(280,95,false, "Aqua"));
		
		linkMap.get(280).add(new LinkInfo(279,95,false, "Aqua"));
		linkMap.get(280).add(new LinkInfo(281,95,false, "Aqua"));
		
		linkMap.get(281).add(new LinkInfo(280,95,false, "Aqua"));
		linkMap.get(281).add(new LinkInfo(281,95,false, "Aqua"));
		
		linkMap.get(282).add(new LinkInfo(281,95,false, "Aqua"));
		linkMap.get(282).add(new LinkInfo(283,95,false, "Aqua"));
		
		linkMap.get(283).add(new LinkInfo(282,95,false, "Aqua"));
		linkMap.get(283).add(new LinkInfo(284,95,false, "Aqua"));
		
		linkMap.get(284).add(new LinkInfo(283,95,false, "Aqua"));
		linkMap.get(284).add(new LinkInfo(285,95,false, "Aqua"));
		
		linkMap.get(285).add(new LinkInfo(284,95,false, "Aqua"));
		linkMap.get(285).add(new LinkInfo(286,95,false, "Aqua"));
		
		linkMap.get(286).add(new LinkInfo(285,95,false, "Aqua"));
		linkMap.get(286).add(new LinkInfo(287,95,false, "Aqua"));
		
		linkMap.get(287).add(new LinkInfo(286,95,false, "Aqua"));
		linkMap.get(287).add(new LinkInfo(288,95,false, "Aqua"));
		
		linkMap.get(288).add(new LinkInfo(287,95,false, "Aqua"));
		linkMap.get(288).add(new LinkInfo(289,95,false, "Aqua"));
		
		linkMap.get(289).add(new LinkInfo(288,95,false, "Aqua"));
		linkMap.get(289).add(new LinkInfo(290,95,false, "Aqua"));
		
		linkMap.get(290).add(new LinkInfo(289,95,false, "Aqua"));
		linkMap.get(290).add(new LinkInfo(291,95,false, "Aqua"));
		
		linkMap.get(291).add(new LinkInfo(290,95,false, "Aqua"));
		linkMap.get(291).add(new LinkInfo(292,95,false, "Aqua"));
		
		linkMap.get(292).add(new LinkInfo(291,95,false, "Aqua"));
		linkMap.get(292).add(new LinkInfo(293,95,false, "Aqua"));
		
		linkMap.get(293).add(new LinkInfo(292,95,false, "Aqua"));
		linkMap.get(293).add(new LinkInfo(294,95,false, "Aqua"));
		
		linkMap.get(294).add(new LinkInfo(293,95,false, "Aqua"));
		linkMap.get(294).add(new LinkInfo(295,95,false, "Aqua"));
		
		linkMap.get(295).add(new LinkInfo(294,95,false, "Aqua"));
		linkMap.get(295).add(new LinkInfo(296,95,false, "Aqua"));
		
		linkMap.get(296).add(new LinkInfo(295,95,false, "Aqua"));
		linkMap.get(296).add(new LinkInfo(297,95,false, "Aqua"));
		
		linkMap.get(297).add(new LinkInfo(296,95,false, "Aqua"));
		linkMap.get(297).add(new LinkInfo(298,95,false, "Aqua"));
		
		linkMap.get(298).add(new LinkInfo(297,95,false, "Aqua"));
		
//		aqua line node linkage <-- end -->
		
//		rapid line node linkage <-- end -->
		
		linkMap.get(299).add(new LinkInfo(300,95,false, "Rapid"));
		
		linkMap.get(300).add(new LinkInfo(299,95,false, "Rapid"));
		linkMap.get(300).add(new LinkInfo(301,95,false, "Rapid"));
		
		linkMap.get(301).add(new LinkInfo(300,95,false, "Rapid"));
		linkMap.get(301).add(new LinkInfo(302,95,false, "Rapid"));
		
		linkMap.get(302).add(new LinkInfo(301,95,false, "Rapid"));
		linkMap.get(302).add(new LinkInfo(303,95,false, "Rapid"));
		
		linkMap.get(303).add(new LinkInfo(302,95,false, "Rapid"));
		linkMap.get(303).add(new LinkInfo(89,95,false, "Rapid"));
		
		linkMap.get(304).add(new LinkInfo(89,95,false, "Rapid"));
		linkMap.get(304).add(new LinkInfo(308,95,false, "Rapid"));
		linkMap.get(304).add(new LinkInfo(305,95,false, "Rapid"));
		
		linkMap.get(305).add(new LinkInfo(304,95,false, "Rapid"));
		linkMap.get(305).add(new LinkInfo(306,95,false, "Rapid"));
		
		linkMap.get(306).add(new LinkInfo(305,95,false, "Rapid"));
		linkMap.get(306).add(new LinkInfo(307,95,false, "Rapid"));
		
		linkMap.get(307).add(new LinkInfo(306,95,false, "Rapid"));
		linkMap.get(307).add(new LinkInfo(308,95,false, "Rapid"));
		
		linkMap.get(308).add(new LinkInfo(307,95,false, "Rapid"));
		linkMap.get(308).add(new LinkInfo(304,95,false, "Rapid"));
		
		
		
//		rapid line node linkage <-- end -->
		
		return linkMap;
		
	}
	
	
	
	public HashMap<Integer, MapNode> buildMap(){
		HashMap<Integer, MapNode> map = new HashMap<>();
		
		return map;
	}
	
	public HashMap<Integer, StationDetails> fetchStationInfo(){
		HashMap<Integer, StationDetails> map = new HashMap<>();
		
//		blue line st
		map.put(1, new StationDetails("Dwarak Sector-21", 1));
		map.put(2, new StationDetails("Dwarak Sector-8", 2));
		map.put(3, new StationDetails("Dwarak Sector-9", 3));
		map.put(4, new StationDetails("Dwarak Sector-10", 4));
		map.put(5, new StationDetails("Dwarak Sector-11", 5));
		map.put(6, new StationDetails("Dwarak Sector-12", 6));
		map.put(7, new StationDetails("Dwarak Sector-13", 7));
		map.put(8, new StationDetails("Dwarak Sector-14", 8));
		map.put(9, new StationDetails("Dwarak", 9));
		map.put(10, new StationDetails("Dwarak Mor", 10));
		map.put(11, new StationDetails("Nawada", 11));
		map.put(12, new StationDetails("Uttam Nagar(West)", 12));
		map.put(13, new StationDetails("Uttam Nagar(East)", 13));
		map.put(14, new StationDetails("Janakpuri(West)", 14));
		map.put(15, new StationDetails("Janakpuri(East)", 15));
		map.put(16, new StationDetails("Tilak Nagar", 16));
		map.put(17, new StationDetails("Subhash Nagar", 17));
		map.put(18, new StationDetails("Tagore Garden", 18));
		map.put(19, new StationDetails("Rajouri Garden", 19));
		map.put(20, new StationDetails("Ramesh Nagar", 20));
		map.put(21, new StationDetails("Moti Nagar", 21));
		map.put(22, new StationDetails("Kirti Nagar", 22));
		map.put(23, new StationDetails("Shadipur", 23));
		map.put(24, new StationDetails("Patel Nagar", 24));
		map.put(25, new StationDetails("Rajendra Place", 25));
		map.put(26, new StationDetails("Karol Bagh", 26));
		map.put(27, new StationDetails("Jhandewalan", 27));
		map.put(28, new StationDetails("RK Ashram Marg", 28));
		map.put(29, new StationDetails("Rajiv Chowk", 29));
		map.put(30, new StationDetails("Barakhamba Road", 30));
		map.put(31, new StationDetails("Mandi House", 31));
		map.put(32, new StationDetails("Supreme Court", 32));
		map.put(33, new StationDetails("Indraprastha", 33));
		map.put(34, new StationDetails("Yamuna Bank", 34));
		map.put(35, new StationDetails("Laxmi Nagar", 35));
		map.put(36, new StationDetails("Nirman Vihar", 36));
		map.put(37, new StationDetails("Preet Vihar", 37));
		map.put(38, new StationDetails("Karkarduma", 38));
		map.put(39, new StationDetails("Anand Vihar ISBT", 39));
		map.put(40, new StationDetails("Kaushambi", 40));
		map.put(41, new StationDetails("Vaishali", 41));
		map.put(42, new StationDetails("Akshardham", 42));
		map.put(43, new StationDetails("Mayur Vihar Phase-I", 43));
		map.put(44, new StationDetails("Mayur Vihar Extension", 44));
		map.put(45, new StationDetails("New Ashok Nagar", 45));
		map.put(46, new StationDetails("Noida Sector-15", 46));
		map.put(47, new StationDetails("Noida Sector-16", 47));
		map.put(48, new StationDetails("Noida Sector-18", 48));
		map.put(49, new StationDetails("Botanical Garden", 49));
		map.put(50, new StationDetails("Golf Course", 50));
		map.put(51, new StationDetails("Noida City Center", 51));
		map.put(52, new StationDetails("Sector-34", 52));
		map.put(53, new StationDetails("Sector-52", 53));
		map.put(54, new StationDetails("Sector-54", 54));
		map.put(55, new StationDetails("Sector-55", 55));
		map.put(56, new StationDetails("Sector-62", 56));
		map.put(57, new StationDetails("Noida Electronic City", 57));
		
//		yellow line st
		map.put(58, new StationDetails("Samaypuyr Badli", 58));
		map.put(59, new StationDetails("Rohini Sector-18,19", 59));
		map.put(60, new StationDetails("Haiderpur Badli Mor", 60));
		map.put(61, new StationDetails("Jahangirpuri", 61));
		map.put(62, new StationDetails("Adarsh Nagar", 62));
		map.put(63, new StationDetails("Azadpur", 63));
		map.put(64, new StationDetails("Model Townr", 64));
		map.put(65, new StationDetails("Gurur Teg Bahadur Nagar", 65));
		map.put(66, new StationDetails("Vishwavidyalaya", 66));
		map.put(67, new StationDetails("Vidhan Sabha", 67));
		map.put(68, new StationDetails("Civil Lines", 68));
		map.put(69, new StationDetails("Kashmere Gate", 69));
		map.put(70, new StationDetails("Chandni Chowk", 70));
		map.put(71, new StationDetails("Chawri Bazar", 71));
		map.put(72, new StationDetails("New Delhi", 72));
		map.put(73, new StationDetails("Patel Chowk", 73));
		map.put(74, new StationDetails("Udyog Bhawan", 74));
		map.put(75, new StationDetails("Lok Kalyan Marg", 75));
		map.put(76, new StationDetails("Jor Bagh", 76));
		map.put(77, new StationDetails("Dilli Haat-INA", 77));
		map.put(78, new StationDetails("AIIMS", 78));
		map.put(79, new StationDetails("Green Park", 79));
		map.put(80, new StationDetails("Hauz Khas", 80));
		map.put(81, new StationDetails("Malviya Nagar", 81));
		map.put(82, new StationDetails("Saket", 82));
		map.put(83, new StationDetails("Qutab Minar", 83));
		map.put(84, new StationDetails("Chhattarpur", 84));
		map.put(85, new StationDetails("Sultanpur", 85));
		map.put(86, new StationDetails("Ghitorni", 86));
		map.put(87, new StationDetails("Arjangarh", 87));
		map.put(88, new StationDetails("Guru Dronacharya", 88));
		map.put(89, new StationDetails("Sikanderpur", 89));
		map.put(90, new StationDetails("MG Road", 90));
		map.put(91, new StationDetails("IFCO Chowk", 91));
		map.put(92, new StationDetails("Huda City Center", 92));
		
//		green line st
		map.put(93, new StationDetails("Brig. Hoshiar Singh", 93));
		map.put(94, new StationDetails("Bahadurgarh City", 94));
		map.put(95, new StationDetails("Pandit Shree Ram Shamra", 95));
		map.put(96, new StationDetails("Tikri Border", 96));
		map.put(97, new StationDetails("Tikri Kalan", 97));
		map.put(98, new StationDetails("Ghevra", 98));
		map.put(99, new StationDetails("Mundka Industrial Area", 99));
		map.put(100, new StationDetails("Mundka", 100));
		map.put(101, new StationDetails("Rajdhani Park", 101));
		map.put(102, new StationDetails("Nangloi Railway Station", 102));
		map.put(103, new StationDetails("Nangloi", 103));
		map.put(104, new StationDetails("Maharaja Surajmal Stadium", 104));
		map.put(105, new StationDetails("Udyog Nagar", 105));
		map.put(106, new StationDetails("Peeragarhi", 106));
		map.put(107, new StationDetails("Pashchim Vihar(West)", 107));
		map.put(108, new StationDetails("Pashchim Vihar(East)", 108));
		map.put(109, new StationDetails("Madipur", 109));
		map.put(110, new StationDetails("Shivaji Park", 110));
		map.put(111, new StationDetails("Punjabi Bagh", 111));
		map.put(112, new StationDetails("Ashok Park Main", 112));
		map.put(113, new StationDetails("Satguru Ram Singh Marg", 113));
		map.put(114, new StationDetails("Inderlok", 114));
		map.put(115, new StationDetails("Daya Basti", 115));
		map.put(116, new StationDetails("Sarai Rohilla", 116));
		map.put(117, new StationDetails("Ajmal Khan Park", 117));
		map.put(118, new StationDetails("Nabi Karim", 118));
		map.put(119, new StationDetails("LNKP Hospital", 119));
		map.put(120, new StationDetails("Delhi Gate", 120));
		map.put(121, new StationDetails("Indira Gandhi Stadium", 121));
		
		
//		red line st
		map.put(122, new StationDetails("Narela", 122));
		map.put(123, new StationDetails("DDA Sports Compelx Narela", 123));
		map.put(124, new StationDetails("Anaj Mandi Narela", 124));
		map.put(125, new StationDetails("Bhorgarh Village", 125));
		map.put(126, new StationDetails("New Sanoth Colony", 126));
		map.put(127, new StationDetails("Sanoth Depot Station", 127));
		map.put(128, new StationDetails("Sanoth", 128));
		map.put(129, new StationDetails("Bawana JJ Colony", 129));
		map.put(130, new StationDetails("Bawana", 130));
		map.put(131, new StationDetails("Bawana Industrial Area-II", 131));
		map.put(132, new StationDetails("Bawana Industrial Area-I", 132));
		map.put(133, new StationDetails("Puth Khurd", 133));
		map.put(134, new StationDetails("Barwala", 134));
		map.put(135, new StationDetails("Rohini Sector-37", 135));
		map.put(136, new StationDetails("Rohini Sector-36", 136));
		map.put(137, new StationDetails("Rohini Sector-32", 137));
		map.put(138, new StationDetails("Rohini Sector-31", 138));
		map.put(139, new StationDetails("Rohini Sector-26", 139));
		map.put(140, new StationDetails("Rohini Sector-25", 140));
		map.put(141, new StationDetails("Rithala", 141));
		map.put(142, new StationDetails("Rohini(West)", 142));
		map.put(143, new StationDetails("Rohini(East)", 143));
		map.put(144, new StationDetails("Pitampura", 144));
		map.put(145, new StationDetails("Kohat Enclave", 145));
		map.put(146, new StationDetails("Netaji Subhash Place", 146));
		map.put(147, new StationDetails("Keshav Puram", 147));
		map.put(148, new StationDetails("Kanhaiya Nagar", 148));
		map.put(149, new StationDetails("Shastri Nagar", 149));
		map.put(150, new StationDetails("Pratap Nagar", 150));
		map.put(151, new StationDetails("Pulbangash", 151));
		map.put(152, new StationDetails("Tis Hazari", 152));
		map.put(153, new StationDetails("Shastri Park", 153));
		map.put(154, new StationDetails("Seelampur", 154));
		map.put(155, new StationDetails("Welcome", 155));
		map.put(156, new StationDetails("Shahdara", 156));
		map.put(157, new StationDetails("Mansarovar Park", 157));
		map.put(158, new StationDetails("Jhilmil", 158));
		map.put(159, new StationDetails("Dilshad Garden", 159));
		map.put(160, new StationDetails("Shaheed Nagar", 160));
		map.put(161, new StationDetails("Raj bagh", 161));
		map.put(162, new StationDetails("Major Mohit Sharma Rajendra Nagar", 162));
		map.put(163, new StationDetails("Shyam Park", 163));
		map.put(164, new StationDetails("Mohan Nagar", 164));
		map.put(165, new StationDetails("Arthala ", 165));
		map.put(166, new StationDetails("Hindon River", 166));
		map.put(167, new StationDetails("Shaheed Sthal(New Bus Adda)", 167));
		
//		magenta line st
		map.put(168, new StationDetails("Sadar Bazar", 168));
		map.put(169, new StationDetails("Ghanta Ghar", 169));
		map.put(170, new StationDetails("Derawal", 170));
		map.put(171, new StationDetails("Ashok Vihar", 171));
		map.put(172, new StationDetails("Majlis Park", 172));
		map.put(173, new StationDetails("Bhalswa", 173));
		map.put(174, new StationDetails("North Pitampura", 174));
		map.put(175, new StationDetails("Prashant Vihar", 175));
		map.put(176, new StationDetails("Madhuban Chowk", 176));
		map.put(177, new StationDetails("Deepali Chowk", 177));
		map.put(178, new StationDetails("Pushpanjali", 178));
		map.put(179, new StationDetails("West Enclave", 179));
		map.put(180, new StationDetails("Mangol Puri", 180));
		map.put(181, new StationDetails("Paschim Vihar", 181));
		map.put(182, new StationDetails("Keshopur", 182));
		map.put(183, new StationDetails("Krishna Park Extn.", 183));
		map.put(184, new StationDetails("Dabri Mor", 184));
		map.put(185, new StationDetails("Dashrath Puri", 185));
		map.put(186, new StationDetails("Palam", 186));
		map.put(187, new StationDetails("Sadar Bazar Cantonment", 187));
		map.put(188, new StationDetails("Terminal 1-IGI Airport", 188));
		map.put(189, new StationDetails("Shankar Vihar", 189));
		map.put(190, new StationDetails("Vasant Vihar", 190));
		map.put(191, new StationDetails("Munirka", 191));
		map.put(192, new StationDetails("R.K. Puram", 192));
		map.put(193, new StationDetails("I.I.T", 193));
		map.put(194, new StationDetails("Panchsheel Park", 194));
		map.put(195, new StationDetails("Chirag Delhi", 195));
		map.put(196, new StationDetails("G.K", 196));
		map.put(197, new StationDetails("Nehru Enclave", 197));
		map.put(198, new StationDetails("Kalkaji Mandir", 198));
		map.put(199, new StationDetails("Okhla NSIC", 199));
		map.put(200, new StationDetails("Sukhdev Vihar", 200));
		map.put(201, new StationDetails("Jamia Milia Islamia", 201));
		map.put(202, new StationDetails("Okhla Vihar", 202));
		map.put(203, new StationDetails("Jasola Vihar Shaheen Bagh", 203));
		map.put(204, new StationDetails("Kalindi Kunj", 204));
		map.put(205, new StationDetails("Okhla Bird Sanctuary", 205));
		
//		pink line st
		map.put(206, new StationDetails("Shiv Vihar", 206));
		map.put(207, new StationDetails("Jor Enclave", 207));
		map.put(208, new StationDetails("Gokulpuri", 208));
		map.put(209, new StationDetails("Maujpur-Babarpur", 209));
		map.put(210, new StationDetails("Jafrabad", 210));
		map.put(211, new StationDetails("East Azad Nagar", 211));
		map.put(212, new StationDetails("Krishna Nagar", 212));
		map.put(213, new StationDetails("Karkarduma Court", 213));
		map.put(214, new StationDetails("IP Extension", 214));
		map.put(215, new StationDetails("Mandawali-West Vinod Nagar", 215));
		map.put(216, new StationDetails("East Vinod Nagar - Mayur Vihar-II", 216));
		map.put(217, new StationDetails("Trilokpuri - Sanjay Lake", 217));
		map.put(218, new StationDetails("Mayur Vihar Pocket-I", 218));
		map.put(219, new StationDetails("Sarai Kale Khan Nizamuddin", 219));
		map.put(220, new StationDetails("Ashram", 220));
		map.put(221, new StationDetails("Vinoba Puri", 221));
		map.put(222, new StationDetails("Lajpat Nagar", 222));
		map.put(223, new StationDetails("South Extn.", 223));
		map.put(224, new StationDetails("Sarojini Nagar", 224));
		map.put(225, new StationDetails("Bhikaji Cama Place", 225));
		map.put(226, new StationDetails("Sir M. Vishweshwaraiah Moti Bagh", 226));
		map.put(227, new StationDetails("Delhi Cantt.", 227));
		map.put(228, new StationDetails("Naraina Vihar", 228));
		map.put(229, new StationDetails("Mayapuri", 229));
		map.put(230, new StationDetails("ESI Hospital", 230));
		map.put(231, new StationDetails("Punjabi Bagh(W)", 231));
		map.put(232, new StationDetails("Shakur Pur", 232));
		map.put(233, new StationDetails("Shalimar Bagh", 233));
		map.put(234, new StationDetails("Burari", 234));
		map.put(235, new StationDetails("Jharoda", 235));
		map.put(236, new StationDetails("Jagatpur Village", 236));
		map.put(237, new StationDetails("Sonia Vihar", 237));
		map.put(238, new StationDetails("Khajuri Khas", 238));
		map.put(239, new StationDetails("Bhajanpura", 239));
		map.put(240, new StationDetails("Yamuna Vihar", 240));
		
//		violet line st
		map.put(241, new StationDetails("Lal Qila", 241));
		map.put(242, new StationDetails("Jama Masjid", 242));
		map.put(243, new StationDetails("ITO", 243));
		map.put(244, new StationDetails("Janpath", 244));
		map.put(245, new StationDetails("Central Secretariat", 245));
		map.put(246, new StationDetails("Khan Market", 246));
		map.put(247, new StationDetails("JLN Stadium", 247));
		map.put(248, new StationDetails("Jangpura", 248));
		map.put(249, new StationDetails("Moolchand", 249));
		map.put(250, new StationDetails("Kailash Colony", 250));
		map.put(251, new StationDetails("Nehru Place", 251));
		map.put(252, new StationDetails("Govind Puri", 252));
		map.put(253, new StationDetails("Harkesh Nagar Okhla", 253));
		map.put(254, new StationDetails("Jasola Apollo", 254));
		map.put(255, new StationDetails("Sarita Vihar", 255));
		map.put(256, new StationDetails("Mohan Estate", 256));
		map.put(257, new StationDetails("Tughlakabad", 257));
		map.put(258, new StationDetails("Badarpur Border", 258));
		map.put(259, new StationDetails("Sarai", 259));
		map.put(260, new StationDetails("NHPC Chowk", 260));
		map.put(261, new StationDetails("Mewala Maharajpur", 261));
		map.put(262, new StationDetails("Sector-28", 262));
		map.put(263, new StationDetails("Badkal Mor", 263));
		map.put(264, new StationDetails("Old Faridabad", 264));
		map.put(265, new StationDetails("Neelam Chowk Ajronda", 265));
		map.put(266, new StationDetails("Bata Chowk", 266));
		map.put(267, new StationDetails("Escorts Mujesar", 267));
		map.put(268, new StationDetails("Sant Surdas(SIHI)", 268));
		map.put(269, new StationDetails("Raja Nahar Singh", 269));
		
//		grey line st
		map.put(270, new StationDetails("Nangli", 270));
		map.put(271, new StationDetails("Najafgarh", 271));
		map.put(272, new StationDetails("Dhansa Bus Stand", 272));
		
//		orange line st
		map.put(273, new StationDetails("Airport(T-3)", 273));
		map.put(274, new StationDetails("Delhi Aerocity", 274));
		map.put(275, new StationDetails("Dhaula Kuan", 275));
		map.put(276, new StationDetails("Durgabai Deshmukh South Campus", 276));
		map.put(277, new StationDetails("Shivaji Stadium", 277));
		
//		aqua line st
		map.put(278, new StationDetails("Sector-51", 278));
		map.put(279, new StationDetails("Sector-50", 279));
		map.put(280, new StationDetails("Sector-76", 280));
		map.put(281, new StationDetails("Sector-101", 281));
		map.put(282, new StationDetails("Sector-81", 282));
		map.put(283, new StationDetails("NSEZ", 283));
		map.put(284, new StationDetails("Sector-83", 284));
		map.put(285, new StationDetails("Sector-137", 285));
		map.put(286, new StationDetails("Sector-142", 286));
		map.put(287, new StationDetails("Sector-143", 287));
		map.put(288, new StationDetails("Sector-144", 288));
		map.put(289, new StationDetails("Sector-145", 289));
		map.put(290, new StationDetails("Sector-146", 290));
		map.put(291, new StationDetails("Sector-147", 291));
		map.put(292, new StationDetails("Sector-148", 292));
		map.put(293, new StationDetails("KP-2", 293));
		map.put(294, new StationDetails("Pari Chowk", 294));
		map.put(295, new StationDetails("Alpha-1", 295));
		map.put(296, new StationDetails("Delta-1", 296));
		map.put(297, new StationDetails("Gnida Office", 297));
		map.put(298, new StationDetails("Depot Station", 298));
		
//		rapid line st
		map.put(299, new StationDetails("Sector-55-56", 299));
		map.put(300, new StationDetails("Sector-54 Chowk", 300));
		map.put(301, new StationDetails("Sector-53-54", 301));
		map.put(302, new StationDetails("Sector-42-43", 302));
		map.put(303, new StationDetails("Phase-1", 303));
		map.put(304, new StationDetails("Phase-2", 304));
		map.put(305, new StationDetails("Phase-3", 305));
		map.put(306, new StationDetails("Moulsari Avenue", 306));
		map.put(307, new StationDetails("Cyber City", 307));
		map.put(308, new StationDetails("Belvedere Towers", 308));
		return map;
	}

}
