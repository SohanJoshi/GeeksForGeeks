package com.hrank.ctci.graphs.bfs;

import java.util.*;

public class ShortestReachInAGraph {
    public static class Graph {
        int size ;
    	List<List<Integer>> adjList = new ArrayList<>();
        
        public Graph(int size) {
        	this.size = size;
            for(int i = 0 ; i < size; i++)
            	adjList.add(new LinkedList<>());
        }

        public void addEdge(int first, int second) {
            adjList.get(first).add(second);
            adjList.get(second).add(first);
        }
        
        public int[] shortestReach(int startId) { // 0 indexed
            boolean visited[] = new boolean[size];
            int distanceFromS[] = new int[size];
            
            Queue<Integer> queue = new LinkedList<>();
            
            queue.add(startId);
            visited[startId] = true;
            distanceFromS [startId] = 0;
        	
            while(!queue.isEmpty()) {
            	int current = queue.poll();
            	List<Integer> adjacents = adjList.get(current);
            	for(int i : adjacents) {
            		if(!visited[i]) {
            			visited[i] = true;
                    	distanceFromS[i] = distanceFromS [current] + 6;
            			queue.offer(i);
            		}
            	}
            }
            
            for(int i = 0 ; i < size; i++)
            	if(!visited[i])
            		distanceFromS[i] = -1;
            
            return distanceFromS;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int queries = scanner.nextInt();
        
        for (int t = 0; t < queries; t++) {
            
            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();
            
            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;
                
                // add each edge to the graph
                graph.addEdge(u, v);
            }
            
            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);
 
            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();            
        }
        
        scanner.close();
    }
}
