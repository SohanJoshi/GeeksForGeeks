package com.hrank.ctci.hashtables;

import java.util.Arrays;

public class UsingBinarySearch {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,70095698 };
		printArray(arr);
		Arrays.sort(arr);
		printArray(arr);
		System.out.println(Arrays.binarySearch(arr, 2, arr.length, 3));
		System.out.println(Integer.MAX_VALUE);
	}

	private static void printArray(int[] arr) {
		for(int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}

}
