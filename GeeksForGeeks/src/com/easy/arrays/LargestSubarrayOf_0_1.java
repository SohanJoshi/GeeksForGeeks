package com.easy.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class LargestSubarrayOf_0_1 {

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
			
			System.out.println(maxLen1_0SubArray(arr));
		}
	}

	private static int maxLen1_0SubArray(int[] arr) {
		int n = arr.length;
		int sumLeft[] = new int[n];
		sumLeft[0] = arr[0] == 0?-1:1;
		
		for(int i = 1; i < n ; i++) {
			sumLeft[i] = arr[i] == 0?
							sumLeft[i - 1] - 1:
								sumLeft[i - 1] + 1;
		}
		
		int maxLen = 0;
		
		// Case if array start at 0 index
		
		for(int i = n - 1; i >= 0; i --)
			if(sumLeft[i] == 0) {
				maxLen = i + 1;
				break;
			}
		
		// Case if array starts at index other than 0
		
		int maxTemp = 0;
		HashMap<Integer, Integer> table = new HashMap<>();
		
		for(int i = 0;i < n; i++ ) {
			if(!table.containsKey(sumLeft[i]))
				table.put(sumLeft[i], i);
			else {
				int len = i - table.get(sumLeft[i]);
				if(maxTemp < len)
					maxTemp = len;
			}
		}
		
		if(maxTemp > maxLen)
			maxLen = maxTemp;
		
		return maxLen;
	}

}
