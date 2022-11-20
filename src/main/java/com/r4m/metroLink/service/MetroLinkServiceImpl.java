package com.r4m.metroLink.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.r4m.metroLink.builder.DijkstraNode;
import com.r4m.metroLink.builder.LinkInfo;
import com.r4m.metroLink.builder.MapBuilder;
import com.r4m.metroLink.builder.MapNode;
import com.r4m.metroLink.dto.StationDto;

@Service
public class MetroLinkServiceImpl implements MetroLinkService{
	
	public static Integer minStation;
	
	@Autowired
	MapBuilder mapBuilder;
	


 
	public List<List<Integer>> adjL(){
		List<List<Integer>> adjL = new ArrayList<>();
		for(int i=0; i<=5; i++) {
			adjL.add(new ArrayList<>());
		}
		
		adjL.get(1).add(2);
		adjL.get(1).add(3);
		adjL.get(1).add(4);
		
		adjL.get(2).add(1);
		adjL.get(2).add(4);
		
		adjL.get(3).add(1);
		adjL.get(3).add(4);
		
		adjL.get(4).add(3);
		adjL.get(4).add(1);
		adjL.get(4).add(2);
		adjL.get(4).add(5);
		
		adjL.get(5).add(4);
		
		return adjL;
	}
	
	public String dijkstraPath(Integer from, Integer to){
		List<List<LinkInfo>> adjL = mapBuilder.linkMap();
//		List<List<Integer>> adjL = adjL();
		
		PriorityQueue<DijkstraNode> pending = new PriorityQueue<DijkstraNode>((x,y)-> x.stationCount - y.stationCount);
		pending.add(new DijkstraNode(0, from));
		
		int st[] = new int[320];
		int parent[] = new int[320];
		
		for(int i=0; i<st.length; i++) {
			st[i] = Integer.MAX_VALUE;
			parent[i] = i;
		}
		
		while(!pending.isEmpty()) {
			DijkstraNode front = pending.poll();
			
			if(front.nodeVal == to) {
				break;
			}
			
			for(LinkInfo i : adjL.get(front.nodeVal)) {
				
				
				
				if(i.getUnderConstruct()) {
					continue;
				}
				
				if(st[i.getStationCode()] > (front.stationCount + 1)) {
					st[i.getStationCode()] = front.stationCount + 1;
					parent[i.getStationCode()] = front.nodeVal;
					pending.add(new DijkstraNode(st[i.getStationCode()], i.getStationCode()));
				}
			}
		}
		
		
		
		String res = "";
		int i = to;
		while(i != from) {
			if(parent[i] == from) {
				res = res + i + "->" + parent[i];
				break;
			}else{
				res = res + i + "->";
				i = parent[i];
			}
		}
		
		return res;

	}
} 
