package com.basic.algo.search;

import java.util.Arrays;
import java.util.Scanner;

import com.practice.util.DataOperations;
import com.practice.util.RandomDataGenerator;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int arr[] = RandomDataGenerator.generateIntArray(n);
		
		Arrays.sort(arr);
		
		System.out.println("Please choose the key to search");
		DataOperations.printArray(arr);
		
		int key = in.nextInt();
		
		System.out.println("Serch result index : " + new BinarySearch().binarySearch(arr, 0, arr.length - 1, key));
		
		in.close();
		
	}

	private int binarySearch(int[] arr, int l, int h, int key) {
		assert l >= h : "fromIndex > toIndex";
		
		int mid = (l + h) / 2;
		
		if(arr[mid] == key)
			return mid;
		else if(arr[mid] > key && l < mid)
			return binarySearch(arr, l, mid - 1, key);
		else if(arr[mid] < key && mid < h)
			return binarySearch(arr, mid + 1, h, key);
		return -(mid + 1);
	}

}
