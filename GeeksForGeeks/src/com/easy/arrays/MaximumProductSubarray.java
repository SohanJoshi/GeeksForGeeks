package com.easy.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaximumProductSubarray {

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
			
			int max = Integer.MIN_VALUE;
			int currMax = 1;
			int currMin = 1;
			
			for(int i = 0; i < n; i++) {
				if(arr[i] == 0) {
					currMax = 1;
					currMin = 1;
				}
				else if(arr[i] > 0) {
					currMax = currMax * arr[i];
					currMin = Math.min(currMin * arr[i], 1);
				}
				else if(arr[i] < 0) {
					int temp = currMax;
					currMax = Math.max(currMin * arr[i], 1);
					currMin = temp * arr[i];
				}
				if(currMax > max)
					max = currMax;
			}
						
			System.out.println(max);
		}
	}

}
