package com.r4m.metroLink.service;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.r4m.metroLink.dto.StationDto;

public interface MetroLinkService {
	

	
	public JSONArray dijkstraPath(Integer from, Integer to);
	
	public List<List<StationDto>> dfsAllPaths(Integer from, Integer to);
	
	public JSONArray dijkstraLineSwitch(Integer from, Integer to);

	public JSONArray fetchFrom();

	public JSONArray fetchTo(Integer from);

}
