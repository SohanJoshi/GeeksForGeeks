package com.medium.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TrappingRainWater {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T -- > 0) {
			int n = Integer.parseInt(br.readLine());
			String elements[] = br.readLine().split(" ");
			int arr[] = new int[n];
			for(int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(elements[i]);
			
			int curr_sum = 0;
			int total = 0;
			int max_index = 0;
			
			for(int i = 0; i < n; i++) {
				if(arr[i] < arr[max_index])
					curr_sum += arr[max_index] - arr[i];
				else if(arr[i] > arr[max_index]) {
					total += curr_sum;
					curr_sum = 0;
					max_index = i;
				}
				else if(arr[i] == arr[max_index]) {
					max_index = i;
					total += curr_sum;
					curr_sum = 0;
				}
			}
			
			curr_sum = 0;
			
			if(max_index != n -1) {
				int temp_max_index = n - 1;
				for(int i = n - 1; i > max_index; i--) {
					if(arr[i] < arr[temp_max_index])
						curr_sum += arr[temp_max_index] - arr[i];
					else if(arr[i] > arr[temp_max_index]) {
						temp_max_index = i;
					}
					else if(arr[i] == arr[temp_max_index])
						temp_max_index = i;
				}
				total += curr_sum;
			}
			
			System.out.println(total);
		}

	}

}
