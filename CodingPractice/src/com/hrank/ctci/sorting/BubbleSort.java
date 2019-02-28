package com.hrank.ctci.sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int swaps = getSwapsForBubbleSort(a, n);
        
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);
        
        in.close();
    }

	private static int getSwapsForBubbleSort(int[] a, int n) {
		int swaps = 0;
		boolean swapped = false;
		
		for(int i = 0 ; i < n - 1; i++) {
			swapped = false;
			for(int j = 0 ; j < n - i - 1 ; j++)
				if(a[j] > a[j + 1]) {
					swap(a, j , j + 1);
					swaps ++;
					swapped = true;
				}
			if(swapped == false)
				break;
		}
		return swaps;
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i] ;
		a[i] = a[j];
		a[j] = temp;
	}

}
