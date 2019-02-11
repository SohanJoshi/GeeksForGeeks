package com.hard.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberFromArrayElements {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T -- > 0) {
			int n = Integer.parseInt(br.readLine());
			String elements[] = br.readLine().split(" ");
			
			Arrays.sort(elements, new MyStringComparator2());
			
			StringBuffer result = new StringBuffer("");
			for (String element : elements) 
				result.append(element);
			System.out.println(result);
		}
	}
	
	private static class MyStringComparator implements Comparator<String> {
		@Override
		public int compare(String s1, String s2) {
			// -1 : Keeps s1 earlier
			//  1 : Keeps s2 earlier 
			
			if(s1.equals(s2))
				return 0;
			if(s1.isEmpty())
				return 1;
			
			if(s2.isEmpty())
				return -1;
			
			if(s1.charAt(0) > s2.charAt(0))
				return -1;
			
			else if(s1.charAt(0) < s2.charAt(0))
				return 1;
			
			else {
				int i = 0;
				while(i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i))
					i++;
				
				if(i == s1.length())
					return (s2.charAt(i) < s1.charAt(0)) ? -1 : 1;
				else if( i == s2.length())
					return (s1.charAt(i) < s1.charAt(0)) ? 1 : -1;
				else
					return (s1.charAt(i) < s2.charAt(i)) ? 1 : -1;
			}
		}
	}
	
	private static class MyStringComparator2 implements Comparator<String> {
		@Override
		public int compare(String s1, String s2) {
			// -1 : Keeps s1 earlier
			//  1 : Keeps s2 earlier 
			
			Integer i1 = Integer.parseInt(s1 + s2);
			Integer i2 = Integer.parseInt(s2 + s1);
			
			return i2 - i1;
			
		}
		
	}
	
}
