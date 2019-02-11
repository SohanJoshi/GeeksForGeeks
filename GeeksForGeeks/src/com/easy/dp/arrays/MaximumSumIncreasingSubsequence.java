package com.easy.dp.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaximumSumIncreasingSubsequence {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T -- > 0) {
			int n = Integer.parseInt(br.readLine());
			String line = br.readLine();
			String elements[] = line.split(" ");
			int arr[] = new int[n];
			int sum[] = new int[n];
			int max = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(elements[i]);
				sum[i] = arr[i];
				for(int j = 0; j <i ; j++) {
					if(arr[j] < arr[i] 
							&& sum[i] < sum[j] + arr[i])
						sum[i] = sum[j] + arr[i];
				}
				if(sum[i] > max)
					max = sum[i];
			}
			System.out.println(max);
		}
	}

}
