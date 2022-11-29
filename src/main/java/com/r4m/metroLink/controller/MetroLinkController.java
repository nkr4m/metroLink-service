package com.r4m.metroLink.controller;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.r4m.metroLink.dto.StationDto;
import com.r4m.metroLink.service.MetroLinkService;

@RestController
@CrossOrigin
public class MetroLinkController {
	
	@Autowired
	MetroLinkService metroLinkService; 
	
	@GetMapping("/{from}/{to}")
	public ResponseEntity<Object> shortestDis(@PathVariable Integer from, @PathVariable Integer to) {
		final long startTime = System.currentTimeMillis();
//		metroLinkService.shotestDistance(from, to);
		JSONArray res =  metroLinkService.dijkstraPath(from, to);
		final long endTime = System.currentTimeMillis();

		System.out.println("Total execution time: " + (endTime - startTime));
		return new ResponseEntity<>(res.toList(), HttpStatus.OK);
	}
	
//	@GetMapping("/opt/{from}/{to}")
//	public ResponseEntity<Object> shortestDisOpt(@PathVariable Integer from, @PathVariable Integer to) {
//		final long startTime = System.currentTimeMillis();
////		metroLinkService.shotestDistance(from, to);
//		JSONArray res =  metroLinkService.dijkstraLineSwitch(from, to);
//		final long endTime = System.currentTimeMillis();
//
//		System.out.println("Total execution time: " + (endTime - startTime));
//		return new ResponseEntity<>(res.toList(), HttpStatus.OK);
//	}
	
	@GetMapping("/all-path/{from}/{to}")
	public ResponseEntity<List<List<StationDto>>> dfsAllPath(@PathVariable Integer from, @PathVariable Integer to) {
		final long startTime = System.currentTimeMillis();
//		metroLinkService.shotestDistance(from, to);
		List<List<StationDto>> res =  metroLinkService.dfsAllPaths(from, to);
		final long endTime = System.currentTimeMillis();

		System.out.println("Total execution time: " + (endTime - startTime));
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
	
	@GetMapping("fetch-from")
	public ResponseEntity<Object> fetchFromSt(){
		JSONArray data = metroLinkService.fetchFrom();	
		return new ResponseEntity<Object>(data.toList(), HttpStatus.OK);

	}
	
	@GetMapping("{from}/fetch-to")
	public ResponseEntity<Object> fetchToSt(@PathVariable Integer from){
		
		JSONArray data = metroLinkService.fetchTo(from);
		return new ResponseEntity<Object>(data.toList(), HttpStatus.OK);	
	}
	
	

}
