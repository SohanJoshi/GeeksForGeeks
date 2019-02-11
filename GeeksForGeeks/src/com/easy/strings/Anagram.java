package com.easy.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		while(T --> 0) {
			String strA = in.next();
			String strB = in.next();
			String result = checkAnagram(strA, strB) ? "YES":"NO";
			System.out.println(result);
		}
		in.close();
	}
	
	private static boolean checkAnagram(String strA, String strB) {
		if(strA.length() != strB.length())
			return false;
		
		char arrA[] = strA.toCharArray();
		char arrB[] = strB.toCharArray();
		
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		
		for(int i = 0; i < strA.length(); i++)
			if(arrA[i] != arrB[i])
				return false;
		
		return true;
	}
}
