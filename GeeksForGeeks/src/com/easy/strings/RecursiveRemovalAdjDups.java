package com.easy.strings;

import java.util.Scanner;

public class RecursiveRemovalAdjDups {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		while(T --> 0) {
			String str = in.next();
			System.out.println(removeDups(str.toCharArray(), 1, str.charAt(0), 1, ""));
		}
		in.close();

	}

	private static String removeDups(char[] arr, int index, char last, int occOfLast, String result) {
		if(arr.length == index){
			if(occOfLast == 1)
				return result + last;
			else
				return result;
		}
		if(arr[index] == last)
			return removeDups(arr, index + 1, last, occOfLast + 1, result);
		else {
			if(occOfLast == 1)
				return removeDups(arr, index + 1, arr[index], 1, result + last);
			else
				if(arr[index] == result.charAt(result.length() - 1 ))
					return removeDups(arr, index + 1, arr[index], 2, result.substring(0, result.length() - 1));
				else
					return removeDups(arr, index + 1, arr[index], 1, result);
		}
			
	}
	
}
