package com.easy.strings;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class ParanthesisChecker {

	private static Map<Character, Character> paranthesisMap = new HashMap<>();

	static {
		paranthesisMap.put('(', ')');
		paranthesisMap.put('[', ']');
		paranthesisMap.put('{', '}');
		paranthesisMap.put(')', '(');
		paranthesisMap.put(']', '[');
		paranthesisMap.put('}', '{');
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		while (T-- > 0) {
			String str = in.next();
			char arr[] = str.toCharArray();
			String result = "balanced";
			
			Deque<Character> stack = new LinkedList<>();
			
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == '(' || arr[i] == '[' || arr[i] == '{') 
					stack.push(arr[i]);
				else if(stack.isEmpty() || stack.pop() != paranthesisMap.get(arr[i])) {
					result = "not " + result;
					break;
				}
			}
			
			if(result.equals("balanced") && !stack.isEmpty())
				result = "not " + result;
			
			System.out.println(result);
		}
		in.close();
	}

}
