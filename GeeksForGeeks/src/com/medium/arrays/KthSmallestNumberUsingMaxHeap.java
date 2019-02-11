package com.medium.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KthSmallestNumberUsingMaxHeap {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T -- > 0) {
			int n = Integer.parseInt(br.readLine());
			String elements[] = br.readLine().split(" ");
			int k = Integer.parseInt(br.readLine());

			int arr[] = new int[n];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(elements[i]);
			}

			int heap[] = Arrays.copyOf(arr, k);

			buildMaxHeap(heap, k);

			for(int i = k ; i < n ;i++) 
				if(arr[i] < heap[0]) {
					heap[0] = arr[i];
					maxHeapify(heap, 0, k);
				}

			System.out.println(heap[0]);

		}
	}

	private static void buildMaxHeap(int[] arr, int n) {
		for (int i = n / 2 - 1; i >= 0; i--)
			maxHeapify(arr, i, n);
	}

	private static void maxHeapify(int[] arr, int i, int n) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if(left < n && arr[left] > arr[largest])
			largest = left;
		if(right < n && arr[right] > arr[largest])
			largest = right;
		if(largest != i) {
			swap(arr, i, largest);
			maxHeapify(arr, largest, n);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
