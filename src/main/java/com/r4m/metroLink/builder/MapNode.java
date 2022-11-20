package com.r4m.metroLink.builder;

import java.util.List;


public class MapNode {
	
	private Integer stCode;
	private String StName;
	private List<Integer> connLines;
	private Boolean UnderConstruction;
	
//	conn Lines - code
//	1 - blue
//	2 - yellow
//	3 - red
//	4 - green
//	5 - magenta
	
	public MapNode(Integer stCode, String stName, List<Integer> connLines, Boolean UnderConstruction) {
		// TODO Auto-generated constructor stub
		this.stCode = stCode;
		this.StName = stName;
		this.connLines = connLines;
		this.UnderConstruction = UnderConstruction;
	}

	public Integer getStCode() {
		return stCode;
	}

	public void setStCode(Integer stCode) {
		this.stCode = stCode;
	}

	public String getStName() {
		return StName;
	}

	public void setStName(String stName) {
		StName = stName;
	}

	public List<Integer> getConnLines() {
		return connLines;
	}

	public void setConnLines(List<Integer> connLines) {
		this.connLines = connLines;
	}

	public Boolean getUnderConstruction() {
		return UnderConstruction;
	}

	public void setUnderConstruction(Boolean underConstruction) {
		UnderConstruction = underConstruction;
	}
	
	
}
