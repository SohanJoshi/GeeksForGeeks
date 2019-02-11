package com.basic.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PermutationOfString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		while (T-- > 0) {
			String str = in.next();
			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			
			Set<String> results = new HashSet<>();
			permuteString(arr, 0, "", results);
			results.stream().sorted().forEach((s)->System.out.print(s + " "));
			System.out.println();
		}
		in.close();
	}

	private static void permuteString(char[] arr, int start, String string, Set<String> results) {
		if(start >= arr.length ) 
			results.add(string);
		else
			for (int i = start; i < arr.length; i++) {
				swap(arr, start, i);
				permuteString(arr, start + 1, string + arr[start], results);
				swap(arr, start, i);
			}
	}
	
	private static void swap(char[] arr, int i, int j) {
		if(i != j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
