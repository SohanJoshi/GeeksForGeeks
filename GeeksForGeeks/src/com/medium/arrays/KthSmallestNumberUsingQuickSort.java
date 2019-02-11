package com.medium.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class KthSmallestNumberUsingQuickSort {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T -- > 0) {
			int n = Integer.parseInt(br.readLine());
			String elements[] = br.readLine().split(" ");
			int k = Integer.parseInt(br.readLine());
			
			int arr[] = new int[n];
			
			for(int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(elements[i]);
			
			findKthSmallestByQuickSort(arr, n, k - 1);
			
		}
	}

	private static void findKthSmallestByQuickSort(int[] arr, int n, int k) {
		int begin = 0, end = n - 1;
		int partition = n;
		
		while(begin < end) {
			int pivot = new Random().nextInt(end - begin + 1) + begin ;
			swap(arr, pivot, end);
			int j = begin - 1;
			for(int i = begin; i < end; i++) {
				if(arr[i] < arr[end])
					swap(arr, ++j, i);
			}
			swap(arr, ++j, end);
			partition = j;
			
			if(partition == k)
				break;
			
			if(partition > k)
				end = partition - 1;
			else if(partition < k)
				begin = partition + 1;
		}
		
		if(begin == end)
			partition = begin;
		
		System.out.println(arr[partition]);
		
		for(int i : arr) System.out.print(i + " ");
		System.out.println();
		
	}

	private static void swap(int[] arr, int i, int j) {
		if(i != j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

}
