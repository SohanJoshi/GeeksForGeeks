package com.hrank.ctci.sorting;

import java.util.Scanner;

public class CountingInversions {

	static long countInversions(int arr[]) {
		return mergeSortandCountInversions(arr, new int[arr.length], 0, arr.length - 1);
    }

    private static long mergeSortandCountInversions(int[] arr, int[] temp, int begin, int end) {
    	if(begin < end) {
    		int mid = ( end + begin ) / 2;
    		return mergeSortandCountInversions(arr, temp, begin, mid) + 
    				mergeSortandCountInversions(arr, temp, mid + 1, end) + 
    				mergeAndCountInversion(arr, temp, begin, end);
    	}
		return 0;
	}

	private static long mergeAndCountInversion(int[] arr, int[] temp, int leftStart,  int rightEnd) {
		int leftEnd = ( rightEnd + leftStart ) / 2;
		int rightStart = leftEnd + 1;
		
		int left = leftStart , right = rightStart;
		int index = leftStart;
		
		long inversions = 0;
		
		while(left <= leftEnd && right <= rightEnd) {
			if(arr[left] <= arr[right]) {
				temp[index] = arr[left];
				left ++;
			}else {
				temp[index] = arr[right];
				inversions += (leftEnd - left + 1);
				right ++;
			}
			index ++;
		}
		
		System.arraycopy(arr, left, temp, index, leftEnd - left + 1);
		System.arraycopy(arr, right, temp, index, rightEnd - right + 1);
		System.arraycopy(temp, leftStart, arr, leftStart, rightEnd - leftStart + 1);
		
		return inversions;
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            long result = countInversions(arr);
            System.out.println(result);
        }
        in.close();
    }

}
