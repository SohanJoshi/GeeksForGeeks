package com.easy.dp;

import java.util.Scanner;

public class PathFromTopLeftToBottomRight {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T-- > 0) {
			int n = in.nextInt();
			int m = in.nextInt();
			
			int arr[][] = new int[n][m];
			
			for(int i = 0; i < n; i++)
				for(int j = 0; j < m; j++) {
					if(i == 0 || j == 0)
						arr[i][j] = 1;
					else
						arr[i][j] = (arr[i - 1][j] + arr[i][j - 1]) % 1000000007;
				}
			
			System.out.println(arr[n - 1][m - 1]);
		}
		in.close();
	}

}
