package com.practice.util;

import java.util.Random;

public class RandomDataGenerator {

	
	
	public static int[] generateIntArray(int n) {
		int arr[] = new int[n];
		
		Random random = new Random();
				
		for(int i = 0; i < n; i++)
			arr[i] = random.nextInt() % 1000;	
		return arr;
	}

}
