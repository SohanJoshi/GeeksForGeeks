package com.medium;

public class CircularTour {
	int tour(int petrol[], int distance[]) {
		int n = petrol.length;

		int currentSum = 0;
		int currentLen = 0;
		
		for(int i = 0; i < 2 * n; i++ ) {
			currentSum += (petrol[i % n] - distance[i % n]);
			currentLen ++;
			if(currentSum < 0 ) {
				currentSum = 0;
				currentLen = 0;
			}
			else if(currentLen == n) {
				return i - n + 1;
			}
				
		}
		return -1;
	}
}
