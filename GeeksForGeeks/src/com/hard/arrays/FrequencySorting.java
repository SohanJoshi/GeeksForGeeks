package com.hard.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FrequencySorting {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T -- > 0) {
			int n = Integer.parseInt(br.readLine());
			String elements[] = br.readLine().split(" ");
			int arr[] = new int[n];
			for(int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(elements[i]);
			
			Arrays.sort(arr);
			
			int freq[][] = new int[n][2];
			int size = 0;
			
			int curr = 1;
			
			for(int i = 1; i < n; i++) {
				if(arr[i] == arr[i - 1])
					curr ++;
				else {
					freq[size][0] = curr;
					freq[size++][1] = arr[i - 1];
					curr = 1;
				}
				if(i == n - 1) {
					freq[size][0] = curr;
					freq[size++][1] = arr[i];
				}	
			}
		
			mergesort(freq, 0, size - 1);
			
			for(int i = 0, j = 0; i < size && j < n; i++)
				while(freq[i][0] -- > 0)
					arr[j++] = freq[i][1];
		
			for(int i = 0; i < n ; i++)
				System.out.print(arr[i] + " ");
			System.out.println();
		}
	}

	private static void mergesort(int[][] freq, int begin, int end) {
		if(begin < end) {
			int mid = (begin + end ) / 2;
			mergesort(freq, begin, mid);
			mergesort(freq, mid + 1, end);
			merge(freq, begin, mid, end);
		}
	}

	private static void merge(int[][] arr, int begin, int mid, int end) {
		int temp[][] = new int[end - begin + 1][2];
		int i = begin, j = mid + 1, k = 0;
		while(i <= mid && j <= end) {
			if(arr[i][0] >= arr[j][0]) {
				temp[k][0] = arr[i][0];
				temp[k][1] = arr[i][1];
				i ++;
			} else {
				temp[k][0] = arr[j][0];
				temp[k][1] = arr[j][1];
				j ++;
			}
			k ++;
		}
		
		while(i <= mid) {
			temp[k][0] = arr[i][0];
			temp[k][1] = arr[i][1];
			i ++;
			k ++;
		}
		while(j <= end) {
			temp[k][0] = arr[j][0];
			temp[k][1] = arr[j][1];
			j ++;
			k ++;
		}
		
		for(i = begin; i <= end; i++) {
			arr[i][0] = temp[i - begin][0];
			arr[i][1] = temp[i - begin][1];
		}
		
	}
	
}
