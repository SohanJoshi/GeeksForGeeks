package com.medium.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RelativeSorting {

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
			
			int nextPositionInA2 = 0;
			
			for(int i = 0; i < m; i++)
				for(int j = nextPositionInA2; j < n; j++)
					if(arr2[i] == arr1[j])
						swap(arr1, nextPositionInA2++, j);
			for(int i: arr1)
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
