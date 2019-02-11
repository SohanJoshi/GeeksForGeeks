package com.basic.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ChocolateDistributionProblem {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T -- > 0) {
			int n = Integer.parseInt(br.readLine());
			String elements[] = br.readLine().split(" ");
			int arr[] = new int[n];
			for(int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(elements[i]);
			
			int k = Integer.parseInt(br.readLine());
			
			int minDiff = Integer.MAX_VALUE;
			
			Arrays.sort(arr);
			
			for(int i = 0; i < n - k + 1; i++)
				if(minDiff > arr[i + k - 1] - arr[i] )
					minDiff = arr[i + k - 1] - arr[i];
			
			System.out.println(minDiff);
			
		}
	}

}
