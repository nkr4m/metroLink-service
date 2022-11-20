package com.r4m.metroLink.dto;

public class StationDto {
	private String stationName;
	private Integer stationCode;
	
	public StationDto() {
		// TODO Auto-generated constructor stub
	}
	
	public StationDto(String stationName, Integer stationCode) {
		// TODO Auto-generated constructor stub
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
