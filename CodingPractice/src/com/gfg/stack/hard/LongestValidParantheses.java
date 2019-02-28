package com.gfg.stack.hard;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class LongestValidParantheses {
	
	private static int position = 0;
	private static int maxLen = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T-- > 0) {
			String str = in.next();
			char arr[] = str.toCharArray();
			Deque<Character> stack = new LinkedList<Character>();
			while(position < arr.length)
				maxLen = countPairs(arr, stack, maxLen);
			System.out.println(maxLen);
		}
		in.close();
	}

	//	())())))))))()(()(()(()()(((((()((()

	private static int countPairs(char[] arr, Deque<Character> stack, int len) {
		if(position == arr.length)
			return 0;

		int level = stack.size();

		if(arr[position] == '(' )
			stack.push(arr[position++]);

		else if(arr[position] == ')') {
			position ++;
			if(!stack.isEmpty()) {
				stack.pop();
				return 2 + len;
			}
		}

		int result = countPairs(arr, stack, len);
		if(stack.size() == level)
			len += result; 
		
		return len;
	}

}
