package com.java.questions;

import java.util.LinkedList;

public class StringPattern1 {
	public static void main(String[] args) {
		String str = "string";
		System.out.println(reverseString(str));
		System.out.println();
		printPyramid("string");
		System.out.println();
		printPascal(6);
	}

	/*
	 *             1
		         1   1
		       1   2   1
		     1   3   3    1
		   1   4   6   4   1
		 1   5   10   10  5   1

	 */
	
	private static void printPascal(int n) {
		LinkedList<Integer> newList = new LinkedList<>();
		LinkedList<Integer> oldList = new LinkedList<>();
		int numOfSpaces = n - 1;
		oldList.add(1);
		if(n >= 1)
			for(Integer i : oldList) {
				for(int j = 0 ; j < numOfSpaces ; j++)
					System.out.print(" ");
				numOfSpaces --;
				System.out.println(i);
			}
		for(int i = 2; i <= n; i++) {
			
			for(int j = 0 ; j < numOfSpaces ; j++)
				System.out.print(" ");
			numOfSpaces --;
			newList.add(1);
			for(int j = 2; j <= i - 1; j++)
				newList.add(oldList.get(j-2) + oldList.get(j - 1));
			newList.add(1);
			
			for(Integer j: newList)
				System.out.print(j + " ");
			
			System.out.println();
			
			oldList.clear();
			oldList.addAll(newList);
			newList.clear();
		}
		
	}

	private static void printPyramid(String str) {
		int numOfSpaces = str.length() - 1;
		for(int i = 0; i < str.length() ; i++) {
			for(int j = 0 ; j < numOfSpaces ; j++)
				System.out.print(" ");
			numOfSpaces --;
			for(int j = 0; j <= i; j++)
				System.out.print(str.charAt(j) + " ");
			System.out.println();
		}
	}

	private static String reverseString(String str) {
		char arr[] = str.toCharArray();
		int len = arr.length - 1;
		for(int i = 0 ; i < len/2 ; i++)
			swap(arr,i,len - i);
		return new String(arr);
	}

	private static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
