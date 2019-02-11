package com.medium.arrays.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSumContigousSubArray {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String elements[] = br.readLine().split(" ");
			int arr[] = new int[n];
			arr[0] = Integer.parseInt(elements[0]);
			int curr = arr[0], max = arr[0];

			for (int i = 1; i < arr.length; i++) {
				arr[i] = Integer.parseInt(elements[i]);
				curr = Math.max(arr[i], curr + arr[i]);
				max = Math.max(max, curr);
			}
			System.out.println(max);
		}
		br.close();
	}
}
