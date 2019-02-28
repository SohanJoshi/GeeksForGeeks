package com.gfg.arrays.easy;

import java.util.Scanner;

public class SubarrayWithGivenSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while( T -- > 0) {
			int n = in.nextInt();
			int s = in.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < n; i++)
				arr[i] = in.nextInt();
			int range[] = getRangeForSum(arr, s);
			if(range.length == 2)
				System.out.println(range[0] + " " + range[1]);
			else
				System.out.println(-1);
		}
		in.close();
	}

	private static int[] getRangeForSum(int[] arr, int sum) {
		int start = 0 , end = 0;
		int currentSum = 0;
		int n = arr.length;
		
		for(int i = 0 ; i < n ; i++) {
			currentSum = 0;
			int j = i ;
			while(j < n && currentSum < sum) {
				currentSum += arr[j];
				if(currentSum == sum)
				{
					start = i + 1;
					end = j + 1;
					break;
				}
				j++;
			}
			if(start + end > 0)
				break;
		}
		
		if(start + end == 0)
			return new int[] {-1};
		
		return new int[] {start, end};
	}
}
