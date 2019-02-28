package com.gfg.arrays.hard;

import java.util.Scanner;

public class MaximumIndex {

	private static int maxIndex ;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while( T -- > 0) {
			int n = in.nextInt();
			int arr[] = new int[n];
			maxIndex = 0;
			for(int i = 0; i < n; i++)
				arr[i] = in.nextInt();
			updateMaxIndex(arr, 0, n - 1);
			System.out.println(maxIndex);
		}
		in.close();
	}

	private static void updateMaxIndex(int[] arr, int begin, int end) {
		if(end - begin < maxIndex)
			return;
		if(arr[begin] <= arr[end])
			if(end - begin > maxIndex)
				maxIndex = end - begin;
		if (begin < arr.length - 1)
			updateMaxIndex(arr, begin + 1, end);
		if(end >= 1)
			updateMaxIndex(arr, begin, end - 1);
	}

}
