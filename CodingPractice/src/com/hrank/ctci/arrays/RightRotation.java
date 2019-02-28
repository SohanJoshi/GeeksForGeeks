package com.hrank.ctci.arrays;

import java.util.Scanner;

public class RightRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++)
			arr[i] = sc.nextInt();
		
		rightRotateArray(arr, n, d);
		printArray(arr, n);
		sc.close();
	}

	private static void printArray(int[] arr, int n) {
		for(int i = 0; i < n ; i++)
			System.out.print(arr[i] + " ");
	}

	private static void rightRotateArray(int[] arr, int n, int d) {
		int gcd = gcd(n, d);
		int count = 0;
		for(int i = 0 ; i < gcd; i ++)
		{
			int j, k, temp;
			j = i;
			k = j - d;
			k = (k < 0)? k + n : k;
			temp = arr[i];
			while(k != i)
			{
				arr[j] = arr[k];
				j = k;
				k -= d;
				k = (k < 0)? k + n : k;
				count ++;
			}
			arr[j] = temp;
		}
		System.out.println(count);
	}

	private static int gcd(int a, int b) {
		if(b == 0)
			return a;
		else 
			return gcd(b, a % b);
	}

}
