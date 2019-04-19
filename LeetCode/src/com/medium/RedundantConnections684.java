package com.medium;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RedundantConnections684 {
    public int[] findRedundantConnection(int[][] edges) {
    	int n = edges.length;
    	boolean[] visited = new boolean[n];
    	Set<Integer[]> extraNodeSet = new HashSet<>();
    	int[] extraNode = null;
    	
    	List<List<Integer>> adjList = new LinkedList<>();
    	
    	for(int i = 0; i < n; i++)
    		adjList.add(new LinkedList<>());
    	
    	for(int[] edge : edges) {
    		adjList.get(edge[0] - 1).add(edge[1]);
    		// adjList.get(edge[1] - 1).add(edge[0]);
    	}
    	
    	Deque<Integer> stack = new LinkedList<>();
    	stack.push(1);
    	
    	while(!stack.isEmpty()) {
    		int node = stack.pop();
    		for(int adjNode : adjList.get(node - 1)) {
    			if(visited[node - 1])
    				extraNodeSet.add(new Integer[] {node, adjNode});
    			else
    				visited[node - 1] = true;
    		}
    	}
    	
    	for(Integer edge[] : extraNodeSet)
    		extraNode = new int[] {edge[0], edge[1]};
    	
    	return extraNode;
    }
        
}
