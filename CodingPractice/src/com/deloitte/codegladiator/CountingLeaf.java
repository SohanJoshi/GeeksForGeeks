package com.deloitte.codegladiator;

import java.util.Scanner;

public class CountingLeaf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n ; i++)
			arr[i] = sc.nextInt();
		int delNode = sc.nextInt();
		
		System.out.println(countLeafNode(arr, n, 0, delNode));
		
		sc.close();
	}

	private static int countLeafNode(int[] arr, int n, int index, int exception) {
		if(index < 0 || index >= n)
			return 0;
		if(index == exception)
			return 0;
		
		if(left(index) >= n && right(index) >= n)
			return 1;
		
		return countLeafNode(arr, n, left(index), exception) + 
				countLeafNode(arr, n, right(index), exception);
	}

	private static int right(int index) {	return 2 * index + 2;	}
	private static int left(int index) {	return 2 * index + 1;	}

}
