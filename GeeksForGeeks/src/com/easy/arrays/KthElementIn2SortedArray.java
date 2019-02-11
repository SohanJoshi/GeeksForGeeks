package com.easy.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KthElementIn2SortedArray {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T -- > 0) {
			String constraints[] = br.readLine().split(" ");
			
			int n = Integer.parseInt(constraints[0]);
			int m = Integer.parseInt(constraints[1]);
			int k = Integer.parseInt(constraints[2]);
			
			String elements[] = br.readLine().split(" ");
			int arr1[] = new int[n];
			for(int i = 0, j = 0; i < n; i++,j++) {
				while(elements[j].trim().isEmpty())
					j++;
				arr1[i] = Integer.parseInt(elements[j]);
			}
			
			elements = br.readLine().split(" ");
			int arr2[] = new int[m];
			for(int i = 0, j = 0; i < m; i++,j++) {
				while(elements[j].trim().isEmpty())
					j++;
				arr2[i] = Integer.parseInt(elements[j]);
			}
			
			int i = 0, i_1 = 0, i_2 = 0;
			
			while(i < k - 1 && i_1 < n && i_2 < m) {
				if(arr1[i_1] < arr2[i_2])
					i_1++;
				else
					i_2++;
				i++;
			}
			if(i_1 == n)
				System.out.println(arr2[i_2 + k - i - 1]);
			else if(i_2 == m)
				System.out.println(arr1[i_1 + k - i - 1]);
			else
				System.out.println(arr1[i_1] < arr2[i_2] ? arr1[i_1] : arr2[i_2]);
		}
	}
}