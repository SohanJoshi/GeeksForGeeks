package com.collections.examples;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		List<Integer> lists[] = new ArrayList[5];
		for(List<Integer> list : lists)
			list = new ArrayList<>();
		for(List<Integer> list : lists)
			System.out.println(list);
	}

}
