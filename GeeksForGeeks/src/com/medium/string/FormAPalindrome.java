package com.medium.string;

import java.util.Scanner;

public class FormAPalindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T-- > 0) {
			String str = in.next();
			str = str.trim();
			int n = str.length();
			int dpMat[][] = new int[n][n];
			for (int i = 0; i < n; i++) 
				for(int j = 0; j < n; j++)
					dpMat[i][j] = -1;
			
			charactersForPalindrome(str, dpMat, 0, n - 1);
			System.out.println(dpMat[0][n - 1]);
		}
		in.close();
	}

	private static int charactersForPalindrome(String str, int dpMat[][], int begin, int end) {
		if(dpMat[begin][end] >= 0 )
			return dpMat[begin][end];
		
		if(str == null || begin == end)
			dpMat[begin][end] = 0;
		
		else if(end - begin == 1) 
			dpMat[begin][end] = str.charAt(0) == str.charAt(1)?0:1;
		
		else {
			int n = str.length();
			
			if(str.charAt(0) == str.charAt(n - 1))
				dpMat[begin][end] = charactersForPalindrome(str.substring(1, n - 1), dpMat, begin + 1, end - 1);
			
			else
				dpMat[begin][end] = Math.min(charactersForPalindrome(str.substring(1), dpMat, begin + 1, end)
						,charactersForPalindrome(str.substring(0, n - 1), dpMat, begin, end - 1 )) + 1;
		}
		return dpMat[begin][end];
	}

}
