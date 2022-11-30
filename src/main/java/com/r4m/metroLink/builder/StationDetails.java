package com.r4m.metroLink.builder;

import org.springframework.stereotype.Component;

@Component
public class StationDetails {
	
		private String stationName;
		private Integer stationCode;
		
//		can add-on more info regarding stations like evm.. etc
	
	public StationDetails() {
		// TODO Auto-generated constructor stub
	}

	public StationDetails(String stationName, Integer stationCode) {
		super();
		this.stationName = stationName;
		this.stationCode = stationCode;
	}
	
	public String getStationName() {
		return stationName;
	}
	
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	
	public Integer getStationCode() {
		return stationCode;
	}
	
	public void setStationCode(Integer stationCode) {
		this.stationCode = stationCode;
	}
	
}
