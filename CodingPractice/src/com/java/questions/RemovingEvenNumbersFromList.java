package com.java.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovingEvenNumbersFromList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
		System.out.println(list);
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			int number = itr.next();
			if(number % 2 == 0)
				itr.remove();
		}
		list.forEach(System.out::print);
		System.out.println();
		list.stream().forEach(System.out::print);
	}

}
