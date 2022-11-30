package com.r4m.metroLink.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.r4m.metroLink.builder.DijkstraAdvNode;
import com.r4m.metroLink.builder.DijkstraNode;
import com.r4m.metroLink.builder.LinkInfo;
import com.r4m.metroLink.builder.MapBuilder;
import com.r4m.metroLink.builder.MapNode;
import com.r4m.metroLink.builder.StationDetails;
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
	
	public JSONArray dijkstraPath(Integer from, Integer to){
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
		
			JSONArray ans = new JSONArray();
		
		String res = "";
		int i = to;
		while(i != from) {
			
			if(parent[i] == from) {
				JSONObject obj1 = new JSONObject();
				obj1.put("stCode", i);
				ans.put(obj1);
				res = res + i + "->" + parent[i];
				JSONObject obj2 = new JSONObject();
				obj2.put("stCode", parent[i]);
				ans.put(obj2);
				break;
			}else{
				JSONObject obj1 = new JSONObject();
				obj1.put("stCode", i);
				ans.put(obj1);
				res = res + i + "->";
				i = parent[i];
			}
		}
		System.out.println(res+ ": DIJPATH");
		return ans;

	}

	@Override
	public JSONArray fetchFrom() {
		// TODO Auto-generated method stub
		HashMap<Integer, StationDetails> map = mapBuilder.fetchStationInfo();
		JSONArray res = new JSONArray();
		for(int i : map.keySet()) {
			JSONObject obj = new JSONObject();
			obj.put("stationCode", i);
			obj.put("stationName", map.get(i).getStationName());
			res.put(obj);
		}
		
		return res;
	}

	@Override
	public JSONArray fetchTo(Integer from) {
		HashMap<Integer, StationDetails> map = mapBuilder.fetchStationInfo();
		JSONArray res = new JSONArray();
		for(int i : map.keySet()) {
			
			if(i == from) {
				continue;
			}
			
			JSONObject obj = new JSONObject();
			obj.put("stationCode", i);
			obj.put("stationName", map.get(i).getStationName());
			res.put(obj);
		}
		
		return res;

	}

	@Override
	public JSONArray dijkstraLineSwitch(Integer from, Integer to) {
		// TODO Auto-generated method stub
		List<List<LinkInfo>> adjL = mapBuilder.linkMap();
		PriorityQueue<DijkstraAdvNode> pending = new PriorityQueue<>((x,y)->x.getTotalSwitch() - y.getTotalSwitch());

		int parent[] = new int[320];
		
		for(int i=0; i<parent.length; i++) {
			parent[i] = i;
		}
		
		pending.add(new DijkstraAdvNode(-1, "invisible", 1, from));
		while(!pending.isEmpty()) {
			DijkstraAdvNode front = pending.poll();
			
			if(front.getCurrNode() == to) {
				System.out.println("Total Line Switch: " + (front.getTotalSwitch() - 1));
				break;
			}
			
			for(LinkInfo i : adjL.get(front.getCurrNode())) {
				if( (int)i.getStationCode() != (int)front.getParentNode()) {
					if(!i.getUnderConstruct()) {
						
//						case when reaching node is blue, pink (38-39)
						String[] lineArray = i.getLine().split(",");
						boolean flag = false;
						if(lineArray.length > 1) {
							for(String line : lineArray) {
								if(line.equals(front.getIncomingLine())) {
									flag = true;
//									no switch
									parent[i.getStationCode()] = front.getCurrNode();
									pending.add(new DijkstraAdvNode(front.getCurrNode(), line, front.getTotalSwitch(), i.getStationCode()));
								}
							}
							if(flag == false) {
								for(String line : lineArray) {
									flag = true;
//									//switch +1
									parent[i.getStationCode()] = front.getCurrNode();
									pending.add(new DijkstraAdvNode(front.getCurrNode(), line, front.getTotalSwitch() + 1 , i.getStationCode()));
								}
							}
						}else if(front.getIncomingLine().equals("invisible")) {
							parent[i.getStationCode()] = front.getCurrNode();
							pending.add(new DijkstraAdvNode(front.getCurrNode(), i.getLine(), front.getTotalSwitch(), i.getStationCode()));
						}else {
							if(front.getIncomingLine().equals(i.getLine())) {
//								no switch
								parent[i.getStationCode()] = front.getCurrNode();
								pending.add(new DijkstraAdvNode(front.getCurrNode(), i.getLine(), front.getTotalSwitch(), i.getStationCode()));
							}else {
//								switch +1
								parent[i.getStationCode()] = front.getCurrNode();
								pending.add(new DijkstraAdvNode(front.getCurrNode(), i.getLine(), front.getTotalSwitch() + 1 , i.getStationCode()));
							}
						}
					}
				}
			}
		}
			
		
	JSONArray ans = new JSONArray();
		
//		String res = "";
//		int i = to;
//		while(i != from) {
//			
//			if(parent[i] == from) {
//				JSONObject obj1 = new JSONObject();
//				obj1.put("stCode", i);
//				ans.put(obj1);
//				res = res + i + "->" + parent[i];
//				JSONObject obj2 = new JSONObject();
//				obj2.put("stCode", parent[i]);
//				ans.put(obj2);
//				break;
//			}else{
//				JSONObject obj1 = new JSONObject();
//				obj1.put("stCode", i);
//				ans.put(obj1);
//				res = res + i + "->";
//				i = parent[i];
//			}
//		}
//		System.out.println(res+ ": DIJPATH");
		
		
		return ans;
	}

	@Override
	public List<List<StationDto>> dfsAllPaths(Integer from, Integer to) {
		
		HashMap<Integer, StationDetails> st = mapBuilder.fetchStationInfo();
		List<List<LinkInfo>> adjL = mapBuilder.linkMap();
		
		boolean sameLine = false;
		String line = "";
		HashMap<String, Integer> map = new HashMap<>();
		for(LinkInfo l : adjL.get(from)) {
			map.put(l.getLine(), 1);
		}
		
		for(LinkInfo l : adjL.get(to)) {
			if(map.containsKey(l.getLine())) {
				line = l.getLine();
				sameLine = true;
				break;
			}
		}
		
		if(sameLine) {
			String targetLine[] = new String[1];
			targetLine[0] = line;
			boolean[] vis = new boolean[320];
			List<List<Integer>> res = new ArrayList<>();
			List<Integer> ds = new ArrayList<>();
			int minSizePath[] = new int[1];
			minSizePath[0] = Integer.MAX_VALUE;
			helper2(adjL, vis, from, to, ds, res, minSizePath, targetLine);
			System.out.println(res);
//			Collections.sort(res.get(0));
//			JSONArray arr = new JSONArray();
			List<List<StationDto>> arr = new ArrayList<>(); 
			for(List<Integer> li : res) {
				List<StationDto> temp = new ArrayList<>();
				for(Integer i : li) {
					StationDto obj = new StationDto();
					
					obj.setStationCode(i);
					obj.setStationName(st.get(i).getStationName());
					temp.add(obj);
				}
				arr.add(temp);
			}
//			Collections.reverse(arr);
			return arr;
		}
		
		
		boolean[] vis = new boolean[320];
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		int minSizePath[] = new int[1];
		minSizePath[0] = Integer.MAX_VALUE;
		helper(adjL, vis, from, to, ds, res, minSizePath);
		
//		for(List<Integer> l : res) {
//			System.out.println(l);
//		}
		
		Collections.sort(res, new Comparator<List>() {
            public int compare(List list1, List list2) {
                return Integer.valueOf(list1.size()).compareTo(Integer.valueOf(list2.size()));
            }
        });
		

		
//		JSONArray arr = new JSONArray();
		List<List<StationDto>> arr = new ArrayList<>();
		int count = 0;
		for(List<Integer> li : res) {
			if(count == 3) {
				break;
			}
			List<StationDto> temp = new ArrayList();
			for(Integer i : li) {
				StationDto obj = new StationDto();
				obj.setStationCode(i);
				obj.setStationName(st.get(i).getStationName());
				temp.add(obj);
			}
			arr.add(temp);
			count++;
		}
		
		return arr;
	}
	
	public void helper2(List<List<LinkInfo>> adjL, boolean[] vis, int currNode, int to, List<Integer> ds, List<List<Integer>> res, int[] minSize, String[] targetLine) {
		if(currNode == to) {
			 ds.add(currNode);
			 minSize[0] = Math.min(minSize[0], ds.size());
			 res.add(new ArrayList<>(ds));
			 ds.remove(ds.size()-1);
		 }
		 
		 if(res.size() > 0) {
			 return;
		 }

		 
		 for(LinkInfo l : adjL.get(currNode)) {
			 if(vis[l.getStationCode()] == false && l.getUnderConstruct() == false && l.getLine().equals(targetLine[0])) {
				 vis[currNode] = true;
				 ds.add(currNode);
				 helper2(adjL, vis, l.getStationCode(), to, ds, res, minSize, targetLine);
				 ds.remove(ds.size()-1);
				 vis[currNode] = false;
			 }
		 }
	}
	
	
//	doesn't care about number of switches, brings all the available paths
	public void helper(List<List<LinkInfo>> adjL, boolean[] vis, int currNode, int to, List<Integer> ds, List<List<Integer>> res, int[] minSize) {
		 if(currNode == to) {
			 ds.add(currNode);
			 minSize[0] = Math.min(minSize[0], ds.size());
			 res.add(new ArrayList<>(ds));
			 ds.remove(ds.size()-1);
		 }
		 
		 if(res.size() > 0 && ds.size() > 1.3 * minSize[0]) {
			 return;
		 }

		 
		 for(LinkInfo l : adjL.get(currNode)) {
			 if(vis[l.getStationCode()] == false && l.getUnderConstruct() == false) {
				 vis[currNode] = true;
				 ds.add(currNode);
				 helper(adjL, vis, l.getStationCode(), to, ds, res, minSize);
				 ds.remove(ds.size()-1);
				 vis[currNode] = false;
			 }
		 }
	}

	@Override
	public JSONObject fetchSt(Integer from, Integer to) {
		// TODO Auto-generated method stub
		HashMap<Integer, StationDetails> map = mapBuilder.fetchStationInfo();
		JSONObject res = new JSONObject();
		res.put("from", map.get(from) == null ? "N.A" : map.get(from).getStationName());
		res.put("to", map.get(to) == null ? "N.A" : map.get(to).getStationName());
		
		return res;
	}
	
	
} 
