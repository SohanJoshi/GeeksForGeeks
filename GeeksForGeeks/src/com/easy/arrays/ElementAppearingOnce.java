package com.easy.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ElementAppearingOnce {
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
			
			for(int i = 0; i < n; i += 2)
				if(arr[i] != arr[i + 1]) {
					System.out.println(arr[i]);
					break;
				}
		}
	}
}
