package com.hard.hash.queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LRUCache {
	int n ;
	Queue<Integer> queue = new LinkedList<>();
	Map<Integer, Integer> map = new HashMap<>();
	
    /*Initialize an LRU cache with size N */
    public LRUCache(int N) {
       this.n = N;
    }
    
    /*Returns the value of the key x if 
     present else returns -1 */
    public int get(int x) {
    	Integer value= map.get(x);
    	if(value == null)
    		return -1;
    	else {
    		queue.remove(x);
    		queue.add(x);
    		return value;
    	}
    }
    
    /*Sets the key x with value y in the LRU cache */
    public void set(int x, int y) {
       if( null != map.put(x, y)) 
    	   queue.remove(x);
       else if(map.size() > n) 
    		   map.remove(queue.poll());
       queue.add(x);
    }
}
