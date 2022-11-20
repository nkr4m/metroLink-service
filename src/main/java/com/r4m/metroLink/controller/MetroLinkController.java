package com.r4m.metroLink.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.r4m.metroLink.dto.StationDto;
import com.r4m.metroLink.service.MetroLinkService;

@RestController
public class MetroLinkController {
	
	@Autowired
	MetroLinkService metroLinkService; 
	
	@GetMapping("/{from}/{to}")
	public ResponseEntity<String> shortestDis(@PathVariable Integer from, @PathVariable Integer to) {
		final long startTime = System.currentTimeMillis();
//		metroLinkService.shotestDistance(from, to);
		String res =  metroLinkService.dijkstraPath(from, to);
		final long endTime = System.currentTimeMillis();

		System.out.println("Total execution time: " + (endTime - startTime));
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
	

}
