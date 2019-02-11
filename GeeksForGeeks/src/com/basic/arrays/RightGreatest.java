package com.basic.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RightGreatest {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T -- > 0) {
			int n = Integer.parseInt(br.readLine());
			String elements[] = br.readLine().split(" ");
			int arr[] = new int[n];
			for(int i = 0, j = 0; i < n; i++,j++) {
				while(elements[j].trim().isEmpty())
					j++;
				arr[i] = Integer.parseInt(elements[j]);
			}
			
			int rightMax[] = new int[n];
			rightMax[n-1] = -1;
			
			for(int i = n-2; i >= 0; i--) 
				rightMax[i] = Math.max(arr[i + 1], rightMax[i + 1]);
			
			for(int i = 0; i < n; i++)
				System.out.print(rightMax[i] + " ");
			System.out.println();
		}
	}
}
