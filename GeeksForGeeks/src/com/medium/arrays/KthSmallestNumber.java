package com.medium.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KthSmallestNumber {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T -- > 0) {
			int n = Integer.parseInt(br.readLine());
			String elements = br.readLine();
			int k = Integer.parseInt(br.readLine());
			
			int[] arr = new int[n];
			String element[] = elements.split(" ");
			for(int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(element[i]);
			
			buildMinHeap(arr, n);
			
			int min = 0;
			
			for(int i = 0; i < k; i++) 
				min = extractMin(arr,n - i);
			
			System.out.println(min);
		}
	}

	private static int extractMin(int[] arr, int n) {
		int min = arr[0];
		arr[0] = arr[n - 1];
		minHeapify(arr, 0, n -1);
		return min;
	}

	private static void buildMinHeap(int[] arr, int n) {
		for(int i = n/2 - 1; i >= 0 ; i--)
			minHeapify(arr, i, n);
	}

	private static void minHeapify(int[] arr, int i, int n) {
		int smallest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		if(n > left && arr[left] < arr[smallest]) 
			smallest = left;
		if (n > right && arr[right] < arr[smallest]) 
			smallest = right;
		if(i != smallest) {
			swap(arr, i , smallest);
			minHeapify(arr, smallest, n);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
