package com.easy.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeftSmallerRightGreater {

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
			
			int leftMax = arr[0];
			int lo = 1, hi = n - 1;
			
			if(arr[0] > arr[n - 1]) {
				System.out.println(-1);
				continue;
			}
			while(lo < n - 1) {
				if(leftMax > arr[lo]) {
					lo ++;
				} else {
					hi = n - 1;
					
					while( hi > lo && arr[hi] >= arr[lo])
							hi --;
					
					if(hi == lo)
						break;
					else {
						leftMax = arr[lo];
						lo++;
					}
					
				}
			}
			if (lo == n - 1) {
				System.out.println(-1);
			}	
			else
				System.out.println(arr[lo]);
		}
		
	}

}
