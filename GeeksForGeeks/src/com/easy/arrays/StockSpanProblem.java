package com.easy.arrays;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class StockSpanProblem {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T -- > 0) {
			int n = in.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < n; i++)
				arr[i] = in.nextInt();
			
			Deque<Integer> stack = new LinkedList<>(); 
			
			for(int i = 0; i < n; i++) {
				while(!stack.isEmpty() && arr[stack.peek()] <= arr[i])
					stack.pop();
				int result = stack.isEmpty() ? i + 1: i - stack.peek();
				stack.push(i);
				System.out.print(result + " ");
			}
			System.out.println();
		}
		in.close();
	}
}
