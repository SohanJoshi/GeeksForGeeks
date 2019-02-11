package com.medium.string;

import java.util.Scanner;

public class LongestPalindromInString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		while(T --> 0) {
			String str = in.next();
			
			char arr[] = str.toCharArray();
			int n = arr.length;
			
			int start = 0;
			int maxLength = 1;
			
			// Matrix to store the palindromic nature of each substring
			boolean isPalindrome[][] = new boolean[n][n];
			
			// Handling case for string of length 1
			for(int i = 0; i < n; i++)
				isPalindrome[i][i] = true;
			
			// Handling case for string of length 2 - characters should be same to be palindrome
			for(int i = 0; i < n - 1; i++)
				if(arr[i] == arr[i + 1]) {
					isPalindrome[i][i + 1] = true;
					if(maxLength == 1) {
						maxLength = 2;
						start = i;
					}
				}
			
			// Handling the rest cases for string length 3 or more
			for(int k = 2; k < n; k++) { 					// k is the length - 1 for each substring to test
				for(int i = 0; i < n - k; i++) { 				// i is the start index for the substring
					if(arr[i] == arr[i + k] &&
							isPalindrome[i + 1][i + k - 1]) {
						isPalindrome[i][i + k] = true;
						if(k + 1 > maxLength) {
							maxLength = k + 1;
							start = i;
						}
					}
				}
			}
			
			System.out.println(str.substring(start, start + maxLength));
			
		}
		in.close();
	}

}
