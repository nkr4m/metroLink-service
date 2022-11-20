package com.r4m.metroLink.builder;

public class LinkInfo {
	private Integer stationCode;
	private Integer eta; // seconds
	private Boolean underConstruct;
	
	public LinkInfo(Integer stationCode, Integer eta, Boolean underConstruct) {
		this.stationCode = stationCode;
		this.eta = eta;
		this.underConstruct = underConstruct;
	}

	public Integer getStationCode() {
		return stationCode;
	}

	public void setStationCode(Integer stationCode) {
		this.stationCode = stationCode;
	}

	public Integer getEta() {
		return eta;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}

	public Boolean getUnderConstruct() {
		return underConstruct;
	}

	public void setUnderConstruct(Boolean underConstruct) {
		this.underConstruct = underConstruct;
	}

	
	
	
	
	
	
}
