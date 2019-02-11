package com.easy.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxOfSubarraysOfSizeK {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T -- > 0) {
			String inputs = br.readLine();
			int n = Integer.parseInt(inputs.substring(0,inputs.indexOf(" ")));
			int k = Integer.parseInt(inputs.substring(inputs.indexOf(" ") + 1));
			
			String line = br.readLine();
			String elements[] = line.split(" ");
			
			int arr[] = new int[n];
			
			int curr_max = -1;
			
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(elements[i]);
				if(i < k) { 
					if(curr_max < arr[i]) 
						curr_max = arr[i];
				}
				else {
					if(curr_max < arr[i]) 
						curr_max = arr[i];
					if(curr_max == arr[i - k]) {
						curr_max = -1;
						for(int j = i - k + 1; j <= i; j++)
							if(curr_max < arr[j])
								curr_max = arr[j];
					}
					System.out.print(curr_max + " ");
				}
				if(i == k - 1)
					System.out.print(curr_max + " ");
			}
			System.out.println();
		}
		br.close();
	}
}
