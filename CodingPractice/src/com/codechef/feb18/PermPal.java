package com.codechef.feb18;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PermPal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T -- > 0 ) {
			String str = sc.next();
			if( ! createPalindrom(str))
				System.out.println(-1);
		}
		sc.close();
	}

	private static boolean createPalindrom(String str) {
		
		Set<Character> charFound = new HashSet<>();
		Map<Character, Deque<Integer>> charFreq = new HashMap<>();
		
		
		StringBuffer buffer = new StringBuffer();
		
		char arr[] = str.toCharArray();
				
		for(int i = 0 ; i < arr.length; i++) {
			char c = arr[i];
			if(charFound.contains(c)) {
				charFreq.get(c).offer(i);
				charFound.remove(c);
			}
			else {
				charFound.add(c);
				if(charFreq.get(c) == null) {
					Deque<Integer> queue = new LinkedList<>();
					queue.offer(i);
					charFreq.put(c, queue);
				}
					
			}
		}
		
		System.out.println(charFreq);
		
		if(charFound.size() > 1)
			return false;
		
		
		if(charFound.size() == 1)
			for(char c : charFound)
				buffer.append(c);
		
		return true;
	}

	

}
