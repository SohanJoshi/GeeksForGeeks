package com.hrank.ctci.hashtables;

import java.util.Arrays;
import java.util.Scanner;

public class IceCreamParlor {

	private static void solve(int[] arr, int money) {
		int temp [] = Arrays.copyOf(arr, arr.length);
		Arrays.sort(temp);
		int first = 0 , second = 0;
		int n = temp.length;

		for(int i = 0; i < n - 1; i++) {
			int complementary = money - temp[i];
			if(complementary > 0) {
				int index = Arrays.binarySearch(temp, i + 1, n , complementary );
				if(index > 0 && index < n) {
					first = temp[i];
					second = temp[index];
					break;
				}
			}
		}
		int i;
		for(i = 0; i < n; i++)
			if(arr[i] == first || arr[i] == second) {
				System.out.print((i + 1) + " ");
				break;
			}
		for(++i ; i < n; i ++)
			if(arr[i] == first || arr[i] == second) {
				System.out.println(i + 1);
				break;
			}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int a0 = 0; a0 < t; a0++){
			int money = in.nextInt();
			int n = in.nextInt();
			int[] arr = new int[n];
			for(int arr_i = 0; arr_i < n; arr_i++){
				arr[arr_i] = in.nextInt();
			}
			solve(arr, money);
		}
		in.close();
	}

}
