package com.medium.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TrappingRainWaterOptimized {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T -- > 0) {
			int n = Integer.parseInt(br.readLine());
			String elements[] = br.readLine().split(" ");
			int arr[] = new int[n];
			for(int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(elements[i]);
			
			int totalWater = 0;
			int low = 0, high = n - 1;
			int leftMax = 0, rightMax = 0;
			
			while(low < high) {
				if(arr[low] < arr[high]) 
					if(arr[low] > leftMax)
						leftMax = arr[low++];
					else 
						totalWater += leftMax - arr[low++];
				 else 
					if(arr[high] > rightMax)
						rightMax = arr[high--];
					else
						totalWater += rightMax - arr[high--];
			}
			System.out.println(totalWater);
		}
	}
}
