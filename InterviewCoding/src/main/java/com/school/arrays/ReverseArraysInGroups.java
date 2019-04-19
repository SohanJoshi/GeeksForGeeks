package com.school.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseArraysInGroups {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T -- > 0) {
			int n = Integer.parseInt(br.readLine());
			String line = br.readLine();
			String elements[] = line.split(" ");
			int arr[] = new int[n];
			for(int i = 0; i < n; i++) 
				arr[i] = Integer.parseInt(elements[i]);
			
			int k = Integer.parseInt(br.readLine());
			
			int i = 0;
			while(i < n) {
				int j = (i + k - 1) < n ? i + k - 1 : n - 1;
				reverseArray(arr, i , j);
				i = j + 1;
			}
			for(int num : arr)	System.out.print(num + " ");
		}
	}

	private static void reverseArray(int[] arr, int i, int j) {
		for(int k = i; k <= (j + i)/2; k++) {
			if(k != j  + i - k) {
				arr[k] = arr[k] + arr[j  + i - k];
				arr[j  + i - k] = arr[k] - arr[j  + i - k];
				arr[k] = arr[k] - arr[j  + i - k];
			}
		}
			
	}

}
