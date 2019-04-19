package com.collections.map.examples;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(-1, "Negative One");
		map.put(0, "Zero");
		map.put(-2, "Negative Two");
		
		System.out.println(map);
		
		map.entrySet().forEach(e -> System.out.print(e.getValue() + " "));
    	System.out.println();
	}

}
