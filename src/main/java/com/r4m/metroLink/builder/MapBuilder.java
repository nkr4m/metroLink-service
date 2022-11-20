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
		
		linkMap.get(1).add(new LinkInfo(2,95,false));
		linkMap.get(1).add(new LinkInfo(273,95,false));
		
		linkMap.get(2).add(new LinkInfo(1,95,false));
		linkMap.get(2).add(new LinkInfo(3,95,false));

		linkMap.get(3).add(new LinkInfo(2,95,false));
		linkMap.get(3).add(new LinkInfo(4,95,false));
		
		linkMap.get(4).add(new LinkInfo(3,95,false));
		linkMap.get(4).add(new LinkInfo(5,95,false));
		
		linkMap.get(5).add(new LinkInfo(4,95,false));
		linkMap.get(5).add(new LinkInfo(6,95,false));
		
		linkMap.get(6).add(new LinkInfo(5,95,false));
		linkMap.get(6).add(new LinkInfo(7,95,false));
		
		linkMap.get(7).add(new LinkInfo(6,95,false));
		linkMap.get(7).add(new LinkInfo(8,95,false));
		
		linkMap.get(8).add(new LinkInfo(7,95,false));
		linkMap.get(8).add(new LinkInfo(9,95,false));
		
		linkMap.get(9).add(new LinkInfo(8,95,false));
		linkMap.get(9).add(new LinkInfo(270,95,false));
		linkMap.get(9).add(new LinkInfo(10,95,false));
		
		linkMap.get(10).add(new LinkInfo(9,95,false));
		linkMap.get(10).add(new LinkInfo(11,95,false));
		
		linkMap.get(11).add(new LinkInfo(10,95,false));
		linkMap.get(11).add(new LinkInfo(12,95,false));
		
		linkMap.get(12).add(new LinkInfo(11,95,false));
		linkMap.get(12).add(new LinkInfo(13,95,false));
		
		linkMap.get(13).add(new LinkInfo(12,95,false));
		linkMap.get(13).add(new LinkInfo(14,95,false));
		
		linkMap.get(14).add(new LinkInfo(13,95,false));
		linkMap.get(14).add(new LinkInfo(184,95,false));
		linkMap.get(14).add(new LinkInfo(15,95,false));
		linkMap.get(14).add(new LinkInfo(183,95,true));
		
		
		linkMap.get(15).add(new LinkInfo(14,95,false));
		linkMap.get(15).add(new LinkInfo(16,95,false));
		
		linkMap.get(16).add(new LinkInfo(15,95,false));
		linkMap.get(16).add(new LinkInfo(17,95,false));
		
		linkMap.get(17).add(new LinkInfo(16,95,false));
		linkMap.get(17).add(new LinkInfo(18,95,false));
		
		linkMap.get(18).add(new LinkInfo(17,95,false));
		linkMap.get(18).add(new LinkInfo(19,95,false));
		
		linkMap.get(19).add(new LinkInfo(18,95,false));
		linkMap.get(19).add(new LinkInfo(230,95,false));
		linkMap.get(19).add(new LinkInfo(229,95,false));
		linkMap.get(19).add(new LinkInfo(20,95,false));
		
		linkMap.get(20).add(new LinkInfo(19,95,false));
		linkMap.get(20).add(new LinkInfo(21,95,false));
		
		linkMap.get(21).add(new LinkInfo(20,95,false));
		linkMap.get(21).add(new LinkInfo(22,95,false));
		
		linkMap.get(22).add(new LinkInfo(21,95,false));
//		linkMap.get(22).add(new LinkInfo(,95,false)); -> black line
		linkMap.get(22).add(new LinkInfo(113,95,false));
		linkMap.get(22).add(new LinkInfo(23,95,false));
		
		linkMap.get(23).add(new LinkInfo(22,95,false));
		linkMap.get(23).add(new LinkInfo(24,95,false));
		
		linkMap.get(24).add(new LinkInfo(23,95,false));
		linkMap.get(24).add(new LinkInfo(25,95,false));
		
		linkMap.get(25).add(new LinkInfo(24,95,false));
		linkMap.get(25).add(new LinkInfo(26,95,false));
		
		linkMap.get(26).add(new LinkInfo(25,95,false));
		linkMap.get(26).add(new LinkInfo(27,95,false));
		
		linkMap.get(27).add(new LinkInfo(26,95,false));
		linkMap.get(27).add(new LinkInfo(28,95,false));
		
		linkMap.get(28).add(new LinkInfo(27,95,false));
		linkMap.get(28).add(new LinkInfo(118,95,false));
		linkMap.get(28).add(new LinkInfo(29,95,false));
		
		linkMap.get(29).add(new LinkInfo(28,95,false));
		linkMap.get(29).add(new LinkInfo(73,95,false));
		linkMap.get(29).add(new LinkInfo(72,95,false));
		linkMap.get(29).add(new LinkInfo(30,95,false));
		
		linkMap.get(30).add(new LinkInfo(29,95,false));
		linkMap.get(30).add(new LinkInfo(31,95,false));
		
		linkMap.get(31).add(new LinkInfo(30,95,false));
		linkMap.get(31).add(new LinkInfo(243,95,false));
		linkMap.get(31).add(new LinkInfo(32,95,false));
		linkMap.get(31).add(new LinkInfo(244,95,false));
		
		linkMap.get(32).add(new LinkInfo(31,95,false));
		linkMap.get(32).add(new LinkInfo(33,95,false));
		
		linkMap.get(33).add(new LinkInfo(32,95,false));
		linkMap.get(33).add(new LinkInfo(34,95,false));
		linkMap.get(33).add(new LinkInfo(121,95,true));
		
		linkMap.get(34).add(new LinkInfo(33,95,false));
		linkMap.get(34).add(new LinkInfo(35,95,false));
		linkMap.get(34).add(new LinkInfo(42,95,false));
		
		linkMap.get(35).add(new LinkInfo(34,95,false));
		linkMap.get(35).add(new LinkInfo(36,95,false));
		
		linkMap.get(36).add(new LinkInfo(35,95,false));
		linkMap.get(36).add(new LinkInfo(37,95,false));
		
		linkMap.get(37).add(new LinkInfo(36,95,false));
		linkMap.get(37).add(new LinkInfo(38,95,false));
		
		
		linkMap.get(38).add(new LinkInfo(37,95,false));
		linkMap.get(38).add(new LinkInfo(39,95,false));
		
		linkMap.get(39).add(new LinkInfo(38,95,false));
		linkMap.get(39).add(new LinkInfo(214,95,false));
		linkMap.get(39).add(new LinkInfo(40,95,false));
		
		linkMap.get(40).add(new LinkInfo(39,95,false));
		linkMap.get(40).add(new LinkInfo(41,95,false));
		
		linkMap.get(41).add(new LinkInfo(40,95,false));
		
		linkMap.get(42).add(new LinkInfo(34,95,false));
		linkMap.get(42).add(new LinkInfo(43,95,false));
		
		linkMap.get(43).add(new LinkInfo(42,95,false));
		linkMap.get(43).add(new LinkInfo(219,95,false));
		linkMap.get(43).add(new LinkInfo(218,95,false));
		linkMap.get(43).add(new LinkInfo(44,95,false));
		
		linkMap.get(44).add(new LinkInfo(43,95,false));
		linkMap.get(44).add(new LinkInfo(45,95,false));
		
		linkMap.get(45).add(new LinkInfo(44,95,false));
		linkMap.get(45).add(new LinkInfo(46,95,false));
		
		linkMap.get(46).add(new LinkInfo(45,95,false));
		linkMap.get(46).add(new LinkInfo(47,95,false));
		
		linkMap.get(47).add(new LinkInfo(46,95,false));
		linkMap.get(47).add(new LinkInfo(48,95,false));
		
		linkMap.get(48).add(new LinkInfo(47,95,false));
		linkMap.get(48).add(new LinkInfo(49,95,false));
		
		linkMap.get(49).add(new LinkInfo(48,95,false));
		linkMap.get(49).add(new LinkInfo(205,95,false));
		linkMap.get(49).add(new LinkInfo(50,95,false));
		
		linkMap.get(50).add(new LinkInfo(49,95,false));
		linkMap.get(50).add(new LinkInfo(51,95,false));
		
		linkMap.get(51).add(new LinkInfo(50,95,false));
		linkMap.get(51).add(new LinkInfo(52,95,false));
		
		linkMap.get(52).add(new LinkInfo(51,95,false));
		linkMap.get(52).add(new LinkInfo(53,95,false));
		
		linkMap.get(53).add(new LinkInfo(52,95,false));
		linkMap.get(53).add(new LinkInfo(54,95,false));
		
		linkMap.get(54).add(new LinkInfo(53,95,false));
		linkMap.get(54).add(new LinkInfo(55,95,false));
		
		linkMap.get(55).add(new LinkInfo(54,95,false));
		linkMap.get(55).add(new LinkInfo(56,95,false));
		
		linkMap.get(56).add(new LinkInfo(55,95,false));
		linkMap.get(56).add(new LinkInfo(57,95,false));
		
		linkMap.get(57).add(new LinkInfo(56,95,false));	
//		blue line node linkage <-- end -->
		
		
//		yellow line node linkage <-- start -->
		linkMap.get(58).add(new LinkInfo(59,95,false));
		
		linkMap.get(59).add(new LinkInfo(58,95,false));
		linkMap.get(59).add(new LinkInfo(60,95,false));
		
		linkMap.get(60).add(new LinkInfo(173,95,true));
		linkMap.get(60).add(new LinkInfo(174,95,false));
		linkMap.get(60).add(new LinkInfo(61,95,false));
		
		linkMap.get(61).add(new LinkInfo(60,95,false));
		linkMap.get(61).add(new LinkInfo(62,95,false));
		
		linkMap.get(62).add(new LinkInfo(61,95,false));
		linkMap.get(62).add(new LinkInfo(63,95,false));

		linkMap.get(63).add(new LinkInfo(62,95,false));
		linkMap.get(63).add(new LinkInfo(233,95,false));
		linkMap.get(63).add(new LinkInfo(172,95,true));
		linkMap.get(63).add(new LinkInfo(171,95,true));
		
		
		linkMap.get(64).add(new LinkInfo(63,95,false));
		linkMap.get(64).add(new LinkInfo(65,95,false));
		
		
		linkMap.get(65).add(new LinkInfo(64,95,false));
		linkMap.get(65).add(new LinkInfo(66,95,false));
		
		linkMap.get(66).add(new LinkInfo(65,95,false));
		linkMap.get(66).add(new LinkInfo(67,95,false));
		
		linkMap.get(67).add(new LinkInfo(66,95,false));
		linkMap.get(67).add(new LinkInfo(68,95,false));
		
		
		linkMap.get(68).add(new LinkInfo(67,95,false));
		linkMap.get(68).add(new LinkInfo(69,95,false));
		
		linkMap.get(69).add(new LinkInfo(68,95,false));
		linkMap.get(69).add(new LinkInfo(152,95,false));
		linkMap.get(69).add(new LinkInfo(153,95,false));
		linkMap.get(69).add(new LinkInfo(241,95,false));
		linkMap.get(69).add(new LinkInfo(70,95,false));
		
		linkMap.get(70).add(new LinkInfo(69,95,false));
		linkMap.get(70).add(new LinkInfo(71,95,false));
		
		linkMap.get(71).add(new LinkInfo(70,95,false));
		linkMap.get(71).add(new LinkInfo(72,95,false));
		
		linkMap.get(72).add(new LinkInfo(71,95,false));
		linkMap.get(72).add(new LinkInfo(118,95,true));
		linkMap.get(72).add(new LinkInfo(119,95,true));
		linkMap.get(72).add(new LinkInfo(277,95,false));
		linkMap.get(72).add(new LinkInfo(29,95,false));
		
		linkMap.get(73).add(new LinkInfo(29,95,false));
		linkMap.get(73).add(new LinkInfo(245,95,false));
		
//		central sec.
		linkMap.get(245).add(new LinkInfo(73,95,false));
		linkMap.get(245).add(new LinkInfo(244,95,false));
		linkMap.get(245).add(new LinkInfo(246,95,false));
		linkMap.get(245).add(new LinkInfo(74,95,false));
		
		linkMap.get(74).add(new LinkInfo(245,95,false));
		linkMap.get(74).add(new LinkInfo(75,95,false));
		
		linkMap.get(75).add(new LinkInfo(74,95,false));
		linkMap.get(75).add(new LinkInfo(76,95,false));
		
		linkMap.get(76).add(new LinkInfo(75,95,false));
		linkMap.get(76).add(new LinkInfo(77,95,false));
		
		linkMap.get(77).add(new LinkInfo(76,95,false));
		linkMap.get(77).add(new LinkInfo(224,95,false));
		linkMap.get(77).add(new LinkInfo(223,95,false));
		linkMap.get(77).add(new LinkInfo(78,95,false));
		
		linkMap.get(78).add(new LinkInfo(77,95,false));
		linkMap.get(78).add(new LinkInfo(79,95,false));
		
		linkMap.get(79).add(new LinkInfo(78,95,false));
		linkMap.get(79).add(new LinkInfo(80,95,false));
		
		linkMap.get(80).add(new LinkInfo(79,95,false));
		linkMap.get(80).add(new LinkInfo(193,95,false));
		linkMap.get(80).add(new LinkInfo(194,95,false));
		linkMap.get(80).add(new LinkInfo(81,95,false));
		
		
		linkMap.get(81).add(new LinkInfo(80,95,false));
		linkMap.get(81).add(new LinkInfo(82,95,false));
		
		
		linkMap.get(82).add(new LinkInfo(81,95,false));
		linkMap.get(82).add(new LinkInfo(83,95,false));
		
		linkMap.get(83).add(new LinkInfo(82,95,false));
		linkMap.get(83).add(new LinkInfo(84,95,false));
		
		linkMap.get(84).add(new LinkInfo(83,95,false));
		linkMap.get(84).add(new LinkInfo(85,95,false));
		
		linkMap.get(85).add(new LinkInfo(84,95,false));
		linkMap.get(85).add(new LinkInfo(86,95,false));
		
		linkMap.get(86).add(new LinkInfo(85,95,false));
		linkMap.get(86).add(new LinkInfo(87,95,false));
		
		linkMap.get(87).add(new LinkInfo(86,95,false));
		linkMap.get(87).add(new LinkInfo(88,95,false));
		
		linkMap.get(88).add(new LinkInfo(87,95,false));
		linkMap.get(88).add(new LinkInfo(89,95,false));
		
		linkMap.get(89).add(new LinkInfo(88,95,false));
		linkMap.get(89).add(new LinkInfo(304,95,false));
		linkMap.get(89).add(new LinkInfo(303,95,false));
		linkMap.get(89).add(new LinkInfo(90,95,false));
		
		linkMap.get(90).add(new LinkInfo(89,95,false));
		linkMap.get(90).add(new LinkInfo(91,95,false));
		
		linkMap.get(91).add(new LinkInfo(90,95,false));
		linkMap.get(91).add(new LinkInfo(92,95,false));
		
		linkMap.get(92).add(new LinkInfo(91,95,false));
//		yellow line node linkage <-- end -->
		
		
		
//		green line node linkage <-- start -->
		linkMap.get(93).add(new LinkInfo(94,95,false));
		
		linkMap.get(94).add(new LinkInfo(93,95,false));
		linkMap.get(94).add(new LinkInfo(95,95,false));
		
		linkMap.get(95).add(new LinkInfo(96,95,false));
		linkMap.get(95).add(new LinkInfo(97,95,false));
		
		linkMap.get(96).add(new LinkInfo(95,95,false));
		linkMap.get(96).add(new LinkInfo(97,95,false));
		
		linkMap.get(97).add(new LinkInfo(96,95,false));
		linkMap.get(97).add(new LinkInfo(98,95,false));
		
		linkMap.get(98).add(new LinkInfo(97,95,false));
		linkMap.get(98).add(new LinkInfo(99,95,false));
		
		linkMap.get(99).add(new LinkInfo(98,95,false));
		linkMap.get(99).add(new LinkInfo(100,95,false));
		
		linkMap.get(100).add(new LinkInfo(99,95,false));
		linkMap.get(100).add(new LinkInfo(101,95,false));
		
		linkMap.get(101).add(new LinkInfo(100,95,false));
		linkMap.get(101).add(new LinkInfo(102,95,false));
		
		linkMap.get(102).add(new LinkInfo(101,95,false));
		linkMap.get(102).add(new LinkInfo(103,95,false));
		
		linkMap.get(103).add(new LinkInfo(102,95,false));
		linkMap.get(103).add(new LinkInfo(104,95,false));
		
		linkMap.get(104).add(new LinkInfo(103,95,false));
		linkMap.get(104).add(new LinkInfo(105,95,false));
		
		linkMap.get(105).add(new LinkInfo(104,95,false));
		linkMap.get(105).add(new LinkInfo(106,95,false));
		
		linkMap.get(106).add(new LinkInfo(105,95,false));
		linkMap.get(106).add(new LinkInfo(107,95,false));
		linkMap.get(106).add(new LinkInfo(180,95,true));
		linkMap.get(106).add(new LinkInfo(181,95,true));
		
		linkMap.get(107).add(new LinkInfo(106,95,false));
		linkMap.get(107).add(new LinkInfo(108,95,false));
		
		linkMap.get(108).add(new LinkInfo(107,95,false));
		linkMap.get(108).add(new LinkInfo(109,95,false));
		
		linkMap.get(109).add(new LinkInfo(108,95,false));
		linkMap.get(109).add(new LinkInfo(110,95,false));
		
		linkMap.get(110).add(new LinkInfo(109,95,false));
		linkMap.get(110).add(new LinkInfo(111,95,false));
		
		linkMap.get(111).add(new LinkInfo(110,95,false));
		linkMap.get(111).add(new LinkInfo(112,95,false));
		
		linkMap.get(112).add(new LinkInfo(111,95,false));
		linkMap.get(112).add(new LinkInfo(114,95,false));
		linkMap.get(112).add(new LinkInfo(113,95,false));
		
		linkMap.get(113).add(new LinkInfo(112,95,false));
		linkMap.get(113).add(new LinkInfo(22,95,false));
		
		linkMap.get(114).add(new LinkInfo(112,95,false));
		linkMap.get(114).add(new LinkInfo(149,95,false));
		linkMap.get(114).add(new LinkInfo(115,95,true));
		
		linkMap.get(115).add(new LinkInfo(114,95,true));
		linkMap.get(115).add(new LinkInfo(116,95,true));
		
		linkMap.get(116).add(new LinkInfo(115,95,true));
		linkMap.get(116).add(new LinkInfo(117,95,true));
		
		linkMap.get(117).add(new LinkInfo(116,95,true));
		linkMap.get(117).add(new LinkInfo(118,95,true));
		
		linkMap.get(118).add(new LinkInfo(117,95,true));
		linkMap.get(118).add(new LinkInfo(168,95,true));
		linkMap.get(118).add(new LinkInfo(72,95,true));
		linkMap.get(118).add(new LinkInfo(28,95,true));
		
		linkMap.get(119).add(new LinkInfo(72,95,true));
		linkMap.get(119).add(new LinkInfo(120,95,true));
		
		linkMap.get(120).add(new LinkInfo(119,95,true));
		linkMap.get(120).add(new LinkInfo(243,95,false));
		linkMap.get(120).add(new LinkInfo(242,95,false));
		linkMap.get(120).add(new LinkInfo(121,95,true));
		
		linkMap.get(121).add(new LinkInfo(120,95,true));
		linkMap.get(121).add(new LinkInfo(33,95,true));
//		green line node linkage <-- end -->
		
		
		
		
//		red line node linkage <-- end -->
		
		
		linkMap.get(122).add(new LinkInfo(123,95,true));
		
		linkMap.get(123).add(new LinkInfo(122,95,true));
		linkMap.get(123).add(new LinkInfo(124,95,true));
		
		linkMap.get(124).add(new LinkInfo(123,95,true));
		linkMap.get(124).add(new LinkInfo(125,95,true));
		
		linkMap.get(125).add(new LinkInfo(124,95,true));
		linkMap.get(125).add(new LinkInfo(127,95,true));
		
		linkMap.get(127).add(new LinkInfo(125,95,true));
		linkMap.get(127).add(new LinkInfo(126,95,true));
		
		linkMap.get(126).add(new LinkInfo(127,95,true));
		linkMap.get(126).add(new LinkInfo(128,95,true));
		
		linkMap.get(128).add(new LinkInfo(126,95,true));
		linkMap.get(128).add(new LinkInfo(129,95,true));
		
		linkMap.get(129).add(new LinkInfo(128,95,true));
		linkMap.get(129).add(new LinkInfo(130,95,true));
		
		linkMap.get(130).add(new LinkInfo(129,95,true));
		linkMap.get(130).add(new LinkInfo(131,95,true));
		
		linkMap.get(131).add(new LinkInfo(130,95,true));
		linkMap.get(131).add(new LinkInfo(132,95,true));
		
		linkMap.get(131).add(new LinkInfo(130,95,true));
		linkMap.get(131).add(new LinkInfo(132,95,true));
		
		linkMap.get(132).add(new LinkInfo(131,95,true));
		linkMap.get(132).add(new LinkInfo(133,95,true));
		
		linkMap.get(133).add(new LinkInfo(132,95,true));
		linkMap.get(133).add(new LinkInfo(134,95,true));
		
		linkMap.get(134).add(new LinkInfo(133,95,true));
		linkMap.get(134).add(new LinkInfo(135,95,true));
		
		linkMap.get(135).add(new LinkInfo(134,95,true));
		linkMap.get(135).add(new LinkInfo(136,95,true));
		
		linkMap.get(136).add(new LinkInfo(135,95,true));
		linkMap.get(136).add(new LinkInfo(137,95,true));
		
		linkMap.get(137).add(new LinkInfo(136,95,true));
		linkMap.get(137).add(new LinkInfo(138,95,true));
		
		linkMap.get(138).add(new LinkInfo(137,95,true));
		linkMap.get(138).add(new LinkInfo(139,95,true));
		
		linkMap.get(139).add(new LinkInfo(138,95,true));
		linkMap.get(139).add(new LinkInfo(140,95,true));
		
		linkMap.get(140).add(new LinkInfo(139,95,true));
		linkMap.get(140).add(new LinkInfo(141,95,true));
		
		linkMap.get(141).add(new LinkInfo(140,95,true));
		linkMap.get(141).add(new LinkInfo(142,95,false));
		
		linkMap.get(142).add(new LinkInfo(141,95,false));
		linkMap.get(142).add(new LinkInfo(143,95,false));
		
		
		linkMap.get(143).add(new LinkInfo(142,95,false));
		linkMap.get(143).add(new LinkInfo(144,95,false));
		
		linkMap.get(144).add(new LinkInfo(143,95,false));
		linkMap.get(144).add(new LinkInfo(176,95,true));
		linkMap.get(144).add(new LinkInfo(175,95,true));
		linkMap.get(144).add(new LinkInfo(145,95,false));
		
		linkMap.get(145).add(new LinkInfo(144,95,false));
		linkMap.get(145).add(new LinkInfo(146,95,false));
		
		linkMap.get(146).add(new LinkInfo(145,95,false));
		linkMap.get(146).add(new LinkInfo(232,95,false));
		linkMap.get(146).add(new LinkInfo(233,95,false));
		linkMap.get(146).add(new LinkInfo(147,95,false));
		
		linkMap.get(147).add(new LinkInfo(146,95,false));
		linkMap.get(147).add(new LinkInfo(148,95,false));
		
		linkMap.get(148).add(new LinkInfo(147,95,false));
		linkMap.get(148).add(new LinkInfo(114,95,false));
		
		linkMap.get(149).add(new LinkInfo(114,95,false));
		linkMap.get(149).add(new LinkInfo(150,95,false));
		
		linkMap.get(150).add(new LinkInfo(149,95,false));
		linkMap.get(150).add(new LinkInfo(151,95,false));
		
		linkMap.get(151).add(new LinkInfo(150,95,false));
		linkMap.get(151).add(new LinkInfo(169,95,true));
		linkMap.get(151).add(new LinkInfo(168,95,true));
		linkMap.get(151).add(new LinkInfo(152,95,false));
		
		linkMap.get(152).add(new LinkInfo(151,95,false));
		linkMap.get(152).add(new LinkInfo(69,95,false));
		
		linkMap.get(153).add(new LinkInfo(69,95,false));
		linkMap.get(153).add(new LinkInfo(154,95,false));
		
		linkMap.get(154).add(new LinkInfo(153,95,false));
		linkMap.get(154).add(new LinkInfo(155,95,false));
		
		linkMap.get(155).add(new LinkInfo(154,95,false));
		linkMap.get(155).add(new LinkInfo(156,95,false));
		
		linkMap.get(156).add(new LinkInfo(155,95,false));
		linkMap.get(156).add(new LinkInfo(157,95,false));
		
		linkMap.get(157).add(new LinkInfo(156,95,false));
		linkMap.get(157).add(new LinkInfo(158,95,false));
		
		linkMap.get(158).add(new LinkInfo(157,95,false));
		linkMap.get(158).add(new LinkInfo(159,95,false));
		
		linkMap.get(159).add(new LinkInfo(158,95,false));
		linkMap.get(159).add(new LinkInfo(160,95,false));
		
		
		linkMap.get(160).add(new LinkInfo(159,95,false));
		linkMap.get(160).add(new LinkInfo(161,95,false));
		
		linkMap.get(161).add(new LinkInfo(160,95,false));
		linkMap.get(161).add(new LinkInfo(162,95,false));
		
		linkMap.get(162).add(new LinkInfo(161,95,false));
		linkMap.get(162).add(new LinkInfo(163,95,false));
		
		linkMap.get(163).add(new LinkInfo(162,95,false));
		linkMap.get(163).add(new LinkInfo(164,95,false));
		
		linkMap.get(164).add(new LinkInfo(163,95,false));
		linkMap.get(164).add(new LinkInfo(165,95,false));
		
		linkMap.get(165).add(new LinkInfo(164,95,false));
		linkMap.get(165).add(new LinkInfo(166,95,false));
		
		linkMap.get(166).add(new LinkInfo(165,95,false));
		linkMap.get(166).add(new LinkInfo(167,95,false));
		
		linkMap.get(167).add(new LinkInfo(166,95,false));
		
//		red line node linkage <-- end -->
		
//		magenta line node linkage <-- start -->
		
		linkMap.get(168).add(new LinkInfo(118,95,true));
		linkMap.get(168).add(new LinkInfo(151,95,true));
		
		linkMap.get(169).add(new LinkInfo(151,95,true));
		linkMap.get(169).add(new LinkInfo(170,95,true));
		
		linkMap.get(170).add(new LinkInfo(169,95,true));
		linkMap.get(170).add(new LinkInfo(171,95,true));
		
		linkMap.get(171).add(new LinkInfo(170,95,true));
		linkMap.get(171).add(new LinkInfo(63,95,true));
		
		linkMap.get(172).add(new LinkInfo(63,95,true));
		linkMap.get(172).add(new LinkInfo(234,95,true));
		linkMap.get(172).add(new LinkInfo(173,95,true));
		
		linkMap.get(173).add(new LinkInfo(172,95,true));
		linkMap.get(173).add(new LinkInfo(60,95,true));
		
		linkMap.get(174).add(new LinkInfo(60,95,true));
		linkMap.get(174).add(new LinkInfo(175,95,true));
		
		linkMap.get(175).add(new LinkInfo(174,95,true));
		linkMap.get(175).add(new LinkInfo(144,95,true));
		
		linkMap.get(176).add(new LinkInfo(144,95,true));
		linkMap.get(176).add(new LinkInfo(177,95,true));
		
		linkMap.get(177).add(new LinkInfo(176,95,true));
		linkMap.get(177).add(new LinkInfo(178,95,true));
		
		linkMap.get(178).add(new LinkInfo(177,95,true));
		linkMap.get(178).add(new LinkInfo(179,95,true));
		
		linkMap.get(179).add(new LinkInfo(178,95,true));
		linkMap.get(179).add(new LinkInfo(180,95,true));
		
		linkMap.get(180).add(new LinkInfo(179,95,true));
		linkMap.get(180).add(new LinkInfo(106,95,true));
		
		linkMap.get(181).add(new LinkInfo(106,95,true));
		linkMap.get(181).add(new LinkInfo(182,95,true));
		
		linkMap.get(182).add(new LinkInfo(181,95,true));
		linkMap.get(182).add(new LinkInfo(183,95,true));
		
		linkMap.get(183).add(new LinkInfo(182,95,true));
		linkMap.get(183).add(new LinkInfo(14,95,true));
		
		linkMap.get(184).add(new LinkInfo(14,95,false));
		linkMap.get(184).add(new LinkInfo(185,95,false));
		
		linkMap.get(185).add(new LinkInfo(184,95,false));
		linkMap.get(185).add(new LinkInfo(186,95,false));
		
		linkMap.get(186).add(new LinkInfo(185,95,false));
		linkMap.get(186).add(new LinkInfo(187,95,false));
		
		linkMap.get(187).add(new LinkInfo(186,95,false));
		linkMap.get(187).add(new LinkInfo(188,95,false));
		
		linkMap.get(188).add(new LinkInfo(187,95,false));
		linkMap.get(188).add(new LinkInfo(189,95,false));
		
		linkMap.get(189).add(new LinkInfo(188,95,false));
		linkMap.get(189).add(new LinkInfo(190,95,false));
		
		linkMap.get(190).add(new LinkInfo(189,95,false));
		linkMap.get(190).add(new LinkInfo(191,95,false));
		
		linkMap.get(191).add(new LinkInfo(190,95,false));
		linkMap.get(191).add(new LinkInfo(192,95,false));
		
		linkMap.get(192).add(new LinkInfo(191,95,false));
		linkMap.get(192).add(new LinkInfo(193,95,false));
		
		linkMap.get(193).add(new LinkInfo(192,95,false));
		linkMap.get(193).add(new LinkInfo(80,95,false));
		
		linkMap.get(194).add(new LinkInfo(80,95,false));
		linkMap.get(194).add(new LinkInfo(195,95,false));
		
		linkMap.get(195).add(new LinkInfo(194,95,false));
		linkMap.get(195).add(new LinkInfo(196,95,false));
		
		linkMap.get(196).add(new LinkInfo(195,95,false));
		linkMap.get(196).add(new LinkInfo(197,95,false));
		
		linkMap.get(197).add(new LinkInfo(196,95,false));
		linkMap.get(197).add(new LinkInfo(198,95,false));
		
		linkMap.get(198).add(new LinkInfo(197,95,false));
		linkMap.get(198).add(new LinkInfo(252,95,false));
		linkMap.get(198).add(new LinkInfo(251,95,false));
		linkMap.get(198).add(new LinkInfo(199,95,false));
		
		linkMap.get(199).add(new LinkInfo(198,95,false));
		linkMap.get(199).add(new LinkInfo(200,95,false));
		
		linkMap.get(200).add(new LinkInfo(199,95,false));
		linkMap.get(200).add(new LinkInfo(201,95,false));
		
		linkMap.get(201).add(new LinkInfo(200,95,false));
		linkMap.get(201).add(new LinkInfo(202,95,false));
		
		linkMap.get(202).add(new LinkInfo(201,95,false));
		linkMap.get(202).add(new LinkInfo(203,95,false));
		
		linkMap.get(203).add(new LinkInfo(202,95,false));
		linkMap.get(203).add(new LinkInfo(204,95,false));
		
		linkMap.get(204).add(new LinkInfo(203,95,false));
		linkMap.get(204).add(new LinkInfo(205,95,false));
		
		linkMap.get(205).add(new LinkInfo(204,95,false));
		linkMap.get(205).add(new LinkInfo(49,95,false));
//		magenta line node linkage <-- end -->
		
//		pink line node linkage <-- start -->
		
		linkMap.get(206).add(new LinkInfo(207,95,false));
		
		linkMap.get(207).add(new LinkInfo(206,95,false));
		linkMap.get(207).add(new LinkInfo(208,95,false));
		
		linkMap.get(208).add(new LinkInfo(207,95,false));
		linkMap.get(208).add(new LinkInfo(209,95,false));
		
		linkMap.get(209).add(new LinkInfo(208,95,false));
		linkMap.get(209).add(new LinkInfo(240,95,true));
		linkMap.get(209).add(new LinkInfo(210,95,false));
		
		linkMap.get(201).add(new LinkInfo(209,95,false));
		linkMap.get(210).add(new LinkInfo(155,95,false));
		
		linkMap.get(211).add(new LinkInfo(155,95,false));
		linkMap.get(211).add(new LinkInfo(212,95,false));
		
		linkMap.get(212).add(new LinkInfo(211,95,false));
		linkMap.get(212).add(new LinkInfo(213,95,false));
		
		linkMap.get(213).add(new LinkInfo(212,95,false));
		linkMap.get(213).add(new LinkInfo(38,95,false));
		
		linkMap.get(214).add(new LinkInfo(39,95,false));
		linkMap.get(214).add(new LinkInfo(215,95,false));
		
		linkMap.get(215).add(new LinkInfo(214,95,false));
		linkMap.get(215).add(new LinkInfo(216,95,false));
		
		linkMap.get(216).add(new LinkInfo(215,95,false));
		linkMap.get(216).add(new LinkInfo(217,95,false));
		
		linkMap.get(217).add(new LinkInfo(216,95,false));
		linkMap.get(217).add(new LinkInfo(218,95,false));
		
		linkMap.get(218).add(new LinkInfo(217,95,false));
		linkMap.get(218).add(new LinkInfo(43,95,false));
		
		linkMap.get(219).add(new LinkInfo(43,95,false));
		linkMap.get(219).add(new LinkInfo(220,95,false));
		
		linkMap.get(220).add(new LinkInfo(219,95,false));
		linkMap.get(220).add(new LinkInfo(221,95,false));
		
		linkMap.get(221).add(new LinkInfo(220,95,false));
		linkMap.get(221).add(new LinkInfo(222,95,false));
		
		linkMap.get(222).add(new LinkInfo(221,95,false));
		linkMap.get(222).add(new LinkInfo(248,95,false));
		linkMap.get(222).add(new LinkInfo(249,95,false));
		linkMap.get(222).add(new LinkInfo(223,95,false));
		
		linkMap.get(223).add(new LinkInfo(222,95,false));
		linkMap.get(223).add(new LinkInfo(77,95,false));
		
		linkMap.get(224).add(new LinkInfo(77,95,false));
		linkMap.get(224).add(new LinkInfo(225,95,false));
		
		linkMap.get(225).add(new LinkInfo(224,95,false));
		linkMap.get(225).add(new LinkInfo(226,95,false));
		
		linkMap.get(226).add(new LinkInfo(225,95,false));
		linkMap.get(226).add(new LinkInfo(276,95,false));
		
		linkMap.get(276).add(new LinkInfo(226,95,false));
		linkMap.get(276).add(new LinkInfo(227,95,false));
		
		linkMap.get(227).add(new LinkInfo(276,95,false));
		linkMap.get(227).add(new LinkInfo(228,95,false));
		
		linkMap.get(228).add(new LinkInfo(227,95,false));
		linkMap.get(228).add(new LinkInfo(229,95,false));
		
		linkMap.get(229).add(new LinkInfo(228,95,false));
		linkMap.get(229).add(new LinkInfo(19,95,false));
		
		linkMap.get(230).add(new LinkInfo(19,95,false));
		linkMap.get(230).add(new LinkInfo(231,95,false));
		
		linkMap.get(231).add(new LinkInfo(230,95,false));
		linkMap.get(231).add(new LinkInfo(232,95,false));
		
		linkMap.get(232).add(new LinkInfo(231,95,false));
		linkMap.get(232).add(new LinkInfo(146,95,false));
		
		linkMap.get(233).add(new LinkInfo(146,95,false));
		linkMap.get(233).add(new LinkInfo(63,95,false));
		
		linkMap.get(234).add(new LinkInfo(172,95,true));
		linkMap.get(234).add(new LinkInfo(235,95,true));
		
		linkMap.get(235).add(new LinkInfo(234,95,true));
		linkMap.get(235).add(new LinkInfo(236,95,true));
		
		linkMap.get(236).add(new LinkInfo(235,95,true));
		linkMap.get(236).add(new LinkInfo(309,95,true));
		
		linkMap.get(309).add(new LinkInfo(236,95,true));
		linkMap.get(309).add(new LinkInfo(237,95,true));
		
		linkMap.get(237).add(new LinkInfo(309,95,true));
		linkMap.get(237).add(new LinkInfo(238,95,true));
		
		linkMap.get(238).add(new LinkInfo(237,95,true));
		linkMap.get(238).add(new LinkInfo(239,95,true));
		
		linkMap.get(239).add(new LinkInfo(238,95,true));
		linkMap.get(239).add(new LinkInfo(240,95,true));
		
		linkMap.get(240).add(new LinkInfo(239,95,true));
		linkMap.get(240).add(new LinkInfo(209,95,true));

//		pink line node linkage <-- end -->
		

//		voilet line node linkage <-- start -->
		
		linkMap.get(241).add(new LinkInfo(69,95,false));
		linkMap.get(241).add(new LinkInfo(242,95,false));
		
		linkMap.get(242).add(new LinkInfo(241,95,false));
		linkMap.get(242).add(new LinkInfo(120,95,false));
		
		linkMap.get(243).add(new LinkInfo(120,95,false));
		linkMap.get(243).add(new LinkInfo(31,95,false));
		
		linkMap.get(244).add(new LinkInfo(31,95,false));
		linkMap.get(244).add(new LinkInfo(245,95,false));
		
		linkMap.get(246).add(new LinkInfo(245,95,false));
		linkMap.get(246).add(new LinkInfo(247,95,false));
		
		
		linkMap.get(247).add(new LinkInfo(246,95,false));
		linkMap.get(247).add(new LinkInfo(248,95,false));
		
		
		linkMap.get(248).add(new LinkInfo(247,95,false));
		linkMap.get(248).add(new LinkInfo(222,95,false));
		
		linkMap.get(249).add(new LinkInfo(222,95,false));
		linkMap.get(249).add(new LinkInfo(250,95,false));
		
		linkMap.get(250).add(new LinkInfo(249,95,false));
		linkMap.get(250).add(new LinkInfo(251,95,false));
		
		linkMap.get(251).add(new LinkInfo(250,95,false));
		linkMap.get(251).add(new LinkInfo(198,95,false));
		
		linkMap.get(252).add(new LinkInfo(198,95,false));
		linkMap.get(252).add(new LinkInfo(253,95,false));
		
		linkMap.get(253).add(new LinkInfo(252,95,false));
		linkMap.get(253).add(new LinkInfo(254,95,false));
		
		linkMap.get(254).add(new LinkInfo(253,95,false));
		linkMap.get(254).add(new LinkInfo(255,95,false));
		
		linkMap.get(255).add(new LinkInfo(254,95,false));
		linkMap.get(255).add(new LinkInfo(256,95,false));
		
		linkMap.get(256).add(new LinkInfo(255,95,false));
		linkMap.get(256).add(new LinkInfo(257,95,false));
		
		linkMap.get(257).add(new LinkInfo(256,95,false));
		linkMap.get(257).add(new LinkInfo(258,95,false));
		
		linkMap.get(258).add(new LinkInfo(257,95,false));
		linkMap.get(258).add(new LinkInfo(259,95,false));
		
		linkMap.get(259).add(new LinkInfo(258,95,false));
		linkMap.get(259).add(new LinkInfo(260,95,false));
		
		linkMap.get(260).add(new LinkInfo(259,95,false));
		linkMap.get(260).add(new LinkInfo(261,95,false));
		
		linkMap.get(261).add(new LinkInfo(260,95,false));
		linkMap.get(261).add(new LinkInfo(262,95,false));
		
		linkMap.get(262).add(new LinkInfo(261,95,false));
		linkMap.get(262).add(new LinkInfo(263,95,false));
		
		linkMap.get(263).add(new LinkInfo(262,95,false));
		linkMap.get(263).add(new LinkInfo(264,95,false));
		
		linkMap.get(264).add(new LinkInfo(263,95,false));
		linkMap.get(264).add(new LinkInfo(265,95,false));
		
		linkMap.get(265).add(new LinkInfo(264,95,false));
		linkMap.get(265).add(new LinkInfo(266,95,false));
		
		linkMap.get(266).add(new LinkInfo(265,95,false));
		linkMap.get(266).add(new LinkInfo(267,95,false));
		
		linkMap.get(267).add(new LinkInfo(266,95,false));
		linkMap.get(267).add(new LinkInfo(268,95,false));
		
		linkMap.get(268).add(new LinkInfo(267,95,false));
		linkMap.get(268).add(new LinkInfo(269,95,false));
		
		linkMap.get(269).add(new LinkInfo(268,95,false));
		
		
//		voilet line node linkage <-- end -->
		
//		grey line node linkage <-- start -->
		
		linkMap.get(270).add(new LinkInfo(9,95,false));
		linkMap.get(270).add(new LinkInfo(271,95,false));
		
		linkMap.get(271).add(new LinkInfo(270,95,false));
		linkMap.get(271).add(new LinkInfo(272,95,false));
		
		linkMap.get(272).add(new LinkInfo(271,95,false));
				
//		grey line node linkage <-- end -->
		
//		orange line node linkage <-- start -->
		
		linkMap.get(273).add(new LinkInfo(1,95,false));
		linkMap.get(273).add(new LinkInfo(274,95,false));
		
		
		linkMap.get(274).add(new LinkInfo(273,95,false));
		linkMap.get(274).add(new LinkInfo(275,95,false));
		
		linkMap.get(275).add(new LinkInfo(274,95,false));
		linkMap.get(275).add(new LinkInfo(277,95,false));
		
		linkMap.get(277).add(new LinkInfo(275,95,false));
		linkMap.get(277).add(new LinkInfo(72,95,false));
		
//		orange line node linkage <-- end -->
		
//		aqua line node linkage <-- start -->
		
		linkMap.get(278).add(new LinkInfo(279,95,false));
		
		linkMap.get(279).add(new LinkInfo(278,95,false));
		linkMap.get(279).add(new LinkInfo(280,95,false));
		
		linkMap.get(280).add(new LinkInfo(279,95,false));
		linkMap.get(280).add(new LinkInfo(281,95,false));
		
		linkMap.get(281).add(new LinkInfo(280,95,false));
		linkMap.get(281).add(new LinkInfo(281,95,false));
		
		linkMap.get(282).add(new LinkInfo(281,95,false));
		linkMap.get(282).add(new LinkInfo(283,95,false));
		
		linkMap.get(283).add(new LinkInfo(282,95,false));
		linkMap.get(283).add(new LinkInfo(284,95,false));
		
		linkMap.get(284).add(new LinkInfo(283,95,false));
		linkMap.get(284).add(new LinkInfo(285,95,false));
		
		linkMap.get(285).add(new LinkInfo(284,95,false));
		linkMap.get(285).add(new LinkInfo(286,95,false));
		
		linkMap.get(286).add(new LinkInfo(285,95,false));
		linkMap.get(286).add(new LinkInfo(287,95,false));
		
		linkMap.get(287).add(new LinkInfo(286,95,false));
		linkMap.get(287).add(new LinkInfo(288,95,false));
		
		linkMap.get(288).add(new LinkInfo(287,95,false));
		linkMap.get(288).add(new LinkInfo(289,95,false));
		
		linkMap.get(289).add(new LinkInfo(288,95,false));
		linkMap.get(289).add(new LinkInfo(290,95,false));
		
		linkMap.get(290).add(new LinkInfo(289,95,false));
		linkMap.get(290).add(new LinkInfo(291,95,false));
		
		linkMap.get(291).add(new LinkInfo(290,95,false));
		linkMap.get(291).add(new LinkInfo(292,95,false));
		
		linkMap.get(292).add(new LinkInfo(291,95,false));
		linkMap.get(292).add(new LinkInfo(293,95,false));
		
		linkMap.get(293).add(new LinkInfo(292,95,false));
		linkMap.get(293).add(new LinkInfo(294,95,false));
		
		linkMap.get(294).add(new LinkInfo(293,95,false));
		linkMap.get(294).add(new LinkInfo(295,95,false));
		
		linkMap.get(295).add(new LinkInfo(294,95,false));
		linkMap.get(295).add(new LinkInfo(296,95,false));
		
		linkMap.get(296).add(new LinkInfo(295,95,false));
		linkMap.get(296).add(new LinkInfo(297,95,false));
		
		linkMap.get(297).add(new LinkInfo(296,95,false));
		linkMap.get(297).add(new LinkInfo(298,95,false));
		
		linkMap.get(298).add(new LinkInfo(297,95,false));
		
//		aqua line node linkage <-- end -->
		
//		rapid line node linkage <-- end -->
		
		linkMap.get(299).add(new LinkInfo(300,95,false));
		
		linkMap.get(300).add(new LinkInfo(299,95,false));
		linkMap.get(300).add(new LinkInfo(301,95,false));
		
		linkMap.get(301).add(new LinkInfo(300,95,false));
		linkMap.get(301).add(new LinkInfo(302,95,false));
		
		linkMap.get(302).add(new LinkInfo(301,95,false));
		linkMap.get(302).add(new LinkInfo(303,95,false));
		
		linkMap.get(303).add(new LinkInfo(302,95,false));
		linkMap.get(303).add(new LinkInfo(89,95,false));
		
		linkMap.get(304).add(new LinkInfo(89,95,false));
		linkMap.get(304).add(new LinkInfo(308,95,false));
		linkMap.get(304).add(new LinkInfo(305,95,false));
		
		linkMap.get(305).add(new LinkInfo(304,95,false));
		linkMap.get(305).add(new LinkInfo(306,95,false));
		
		linkMap.get(306).add(new LinkInfo(305,95,false));
		linkMap.get(306).add(new LinkInfo(307,95,false));
		
		linkMap.get(307).add(new LinkInfo(306,95,false));
		linkMap.get(307).add(new LinkInfo(308,95,false));
		
		linkMap.get(308).add(new LinkInfo(307,95,false));
		linkMap.get(308).add(new LinkInfo(304,95,false));
		
		
		
//		rapid line node linkage <-- end -->
		
		return linkMap;
		
	}
	
	
	
	public HashMap<Integer, MapNode> buildMap(){
		HashMap<Integer, MapNode> map = new HashMap<>();
		
		return map;
	}

}
