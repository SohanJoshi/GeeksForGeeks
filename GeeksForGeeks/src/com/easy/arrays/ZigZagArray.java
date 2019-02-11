package com.easy.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ZigZagArray {
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
			
			boolean checkUp = true;
			
			for(int i = 0; i < n - 1; i++) {
				if(checkUp && arr[i] > arr[i + 1])
					swap(arr, i , i + 1);
				if(!checkUp && arr[i] < arr[i + 1])
					swap(arr, i , i + 1);
				checkUp = !checkUp;
			}
			
			for(int i : arr)
				System.out.print(i + " ");
			System.out.println();
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
