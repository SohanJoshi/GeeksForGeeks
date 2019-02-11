package com.medium.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RelativeSortingOptimized {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T -- > 0) {
			String constraints[] = br.readLine().split(" ");
			int n = Integer.parseInt(constraints[0]);
			int m = Integer.parseInt(constraints[1]);
			String elements1[] = br.readLine().split(" ");
			String elements2[] = br.readLine().split(" ");
			int arr1[] = new int[n];
			int arr2[] = new int[m];
			for(int i = 0, j = 0; i < n || j < m; i++, j++) {
				if(i < n)
					arr1[i] = Integer.parseInt(elements1[i]);
				if(j < m)
					arr2[j] = Integer.parseInt(elements2[j]);
			}
			
			Arrays.sort(arr1);
			int nextPos = 0;
			
			for(int key : arr2) {
				int range[] = findRange(arr1, key, nextPos, n - 1);
				shiftRange(arr1, range[0], range[1], nextPos);
				nextPos += range[1] - range[0] + 1;
			}
			
			
			for(int i: arr1)
				System.out.print(i + " ");
			System.out.println();
		}
	}

	private static void shiftRange(int[] arr, int low, int high, int nextPos) {
		int key = arr[low];
		int range = high - low + 1;
		for(int i = high; i >= nextPos; i--)
			if(i >= nextPos + range)
				arr[i] = arr[i - range];
			else 
				arr[i] = key;
	}

	private static int[] findRange(int[] arr1, int key, int begin, int end) {
		return new int[] {findLow(arr1, key, begin, end), findHigh(arr1, key, begin, end)};
	}

	private static int findLow(int[] arr1, int key, int begin, int end) {
		int mid;
		while(begin <= end) {
			mid = (begin + end ) / 2;
			if(arr1[mid] < key)
				begin = mid + 1;
			else if(arr1[mid] >= key)
				end = mid - 1;
		}
		return end + 1;
	}

	private static int findHigh(int[] arr1, int key, int begin, int end) {
		int mid;
		while(begin <= end) {
			mid = (begin + end ) / 2;
			if(arr1[mid] <= key)
				begin = mid + 1;
			else if(arr1[mid] > key)
				end = mid - 1;
		}
		return begin - 1;
	}
	
}
