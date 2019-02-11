package com.easy.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquillibriumPoint {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		while(T -- > 0) {
			int n = Integer.parseInt(br.readLine());
			String elements[] = br.readLine().split(" ");
			int arr[] = new int[n];
			long sum = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(elements[i]);
				sum += arr[i];
			}
			
			int left = 0, right = (int) (sum - arr[0]), i = 0;
			while(left != right && i < n - 1 ) {
				left += arr[i];
				right -= arr[i + 1];
				i++;
			}
			if(i != 0 && i == n - 1)
				System.out.println(-1);
			else
				System.out.println(i + 1);
		}
		br.close();
	}

}
