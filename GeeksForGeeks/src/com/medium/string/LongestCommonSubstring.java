package com.medium.string;

import java.util.Scanner;

public class LongestCommonSubstring {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		while(T --> 0) {
			int n1 = in.nextInt();
			int n2 = in.nextInt();
			String strA = in.next();
			String strB = in.next();
			System.out.println(findLongestCommonSubstring(strA, strB));
		}
		in.close();
	}

	private static int findLongestCommonSubstring(String strA, String strB) {
		int maxCommonLength = 0;
		
		char arrA[] = strA.toCharArray();
		char arrB[] = strB.toCharArray();
		
		for(int i = 0; i < strA.length(); i++)
			for(int j = 0; j < strB.length(); j++) {
				int currentLength = 0;
				int k = i, l = j;
				while(k < arrA.length && l < arrB.length &&
						arrA[k++] == arrB[l++])
					currentLength ++;
				if(currentLength > maxCommonLength)
					maxCommonLength = currentLength;
			}
		
		return maxCommonLength;
	}
}
