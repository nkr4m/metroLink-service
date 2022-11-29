package com.r4m.metroLink.builder;

public class DijkstraAdvNode {
	private Integer parentNode;
	private String incomingLine;
	private Integer totalSwitch;
	private Integer currNode;
	
	public DijkstraAdvNode() {
		// TODO Auto-generated constructor stub
	}

	public DijkstraAdvNode(Integer parentNode, String incomingLine, Integer totalSwitch, Integer currNode) {
		super();
		this.parentNode = parentNode;
		this.incomingLine = incomingLine;
		this.totalSwitch = totalSwitch;
		this.currNode = currNode;
	}

	public Integer getParentNode() {
		return parentNode;
	}

	public void setParentNode(Integer parentNode) {
		this.parentNode = parentNode;
	}

	public String getIncomingLine() {
		return incomingLine;
	}

	public void setIncomingLine(String incomingLine) {
		this.incomingLine = incomingLine;
	}

	public Integer getTotalSwitch() {
		return totalSwitch;
	}

	public void setTotalSwitch(Integer totalSwitch) {
		this.totalSwitch = totalSwitch;
	}

	public Integer getCurrNode() {
		return currNode;
	}

	public void setCurrNode(Integer currNode) {
		this.currNode = currNode;
	}
	
	
}
