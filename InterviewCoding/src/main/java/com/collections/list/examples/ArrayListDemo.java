package com.collections.list.examples;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(5);
		System.out.println(list);
		list.set(0, 4);
		list.set(3, 5);
		System.out.println(list);
	}
}
