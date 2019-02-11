package com.easy.stacks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class NextLargerElement {
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		while(T -- > 0) {
			int n = Integer.parseInt(br.readLine());
			String elements[] = br.readLine().split(" ");
			long arr[] = new long[n];
			for(int i = 0; i < n; i++) 
				arr[i] = Long.parseLong(elements[i]);
			
			Stack<Long> stack = new Stack<>();

			for(int i = n - 1; i >= 0; i--) {
				while(!stack.isEmpty() && stack.peek() < arr[i])
					stack.pop();
				long temp = arr[i];
				if(stack.isEmpty())
					arr[i] = -1;
				else
					arr[i] = stack.peek();
				stack.push(temp);
			}
			for (int i = 0; i < n; i++) 
				System.out.print(arr[i] + " ");
			System.out.println();
		}
	}
}
