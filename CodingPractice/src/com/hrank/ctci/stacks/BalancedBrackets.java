package com.hrank.ctci.stacks;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class BalancedBrackets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i = 0; i < T; i++)
		{
			String expression = in.next();
			System.out.println(isBalanced(expression)?"YES"	:"NO");
		}
		in.close();
	}

	private static boolean isBalanced(String expression) {
		char arr[] = expression.toCharArray();
		Deque<Character> stack = new LinkedList<>();
		Map<Character,Character> map = new HashMap<>();
		map.put(')','(');
		map.put('}','{');
		map.put(']','[');
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == '(' 
					|| arr[i] == '{'
					|| arr[i] == '[')
				stack.push(arr[i]);
			else if(arr[i] == ')' 
					|| arr[i] == '}'
					|| arr[i] == ']')
				if(stack.isEmpty() || map.get(arr[i]) != stack.pop())
					return false;
		}
		if(!stack.isEmpty())
			return false;
		return true;
	}

}
