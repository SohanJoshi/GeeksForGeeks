package com.easy.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SpiralTraversalOfAMatrix {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T -- > 0) {
			int n = 4, m = 4;
			int arr[][] = new int[n][m];
			for(int i = 0; i < n; i++) {
				String elements[] = br.readLine().split(" ");
				for(int j = 0; j < m; j++)
					arr[i][j] = Integer.parseInt(elements[j]);
			}
			
			printSpiral(arr, n, m);
			
		}
		
	}

	private static void printSpiral(int[][] arr, int n, int m) {
		int top = -1, left = -1, right = m, bottom = n;
		int i = 0, j = 0;
		
		while(i < bottom && j < right) {
			while(j < right) 
				System.out.print(arr[i][j++] + " ");
			top ++;
			j--;
			i++;
			while(i < bottom) 
				System.out.print(arr[i++][j] + " ");
			right --;
			i--;
			j--;
			while(j > left) 
				System.out.print(arr[i][j--] + " ");
			bottom --;
			j++;
			i--;
			while(i > top) 
				System.out.print(arr[i--][j] + " ");
			left ++;
			i++;
			j++;
			i = top + 1;
			j = left + 1;
		}
		System.out.println();
	}
}
