package com.easy.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PythagoreanTriplets {

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
			
			boolean tripletFound = false;
			
			for(int i = 0; i < n - 2 && !tripletFound; i++) {
				for(int j = 0; j < n - 1 && !tripletFound; j++) {
					if(i != j && doesHypotenusExists(arr, i, j)) {
						tripletFound = true;
					}
				}
			}
			
			System.out.println(tripletFound? "Yes": "No");
			
		}
		
	}

	private static boolean doesHypotenusExists(int[] arr, int i, int j) {
		int base = arr[i], perpendicular = arr[j];
		
		double hypotenus = Math.sqrt(base * base + perpendicular * perpendicular);
		double diff = hypotenus - Math.floor(hypotenus);
				
		if(diff > 0.0)
			return false;
		
		if(Arrays.binarySearch(arr, (int)hypotenus) > 0)
			return true;
		
		return false;
	}

}
