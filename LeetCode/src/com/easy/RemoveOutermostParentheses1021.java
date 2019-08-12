package com.easy;

import static org.junit.Assert.assertEquals;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class RemoveOutermostParentheses1021 {

	public String removeOuterParentheses(String S) {
		char str[] = S.toCharArray();
		Deque<Integer> stack = new LinkedList<>();
		Set<Integer> outermostIndexes = new HashSet<>();

		int n = str.length;

		StringBuffer result = new StringBuffer("");

		for(int i = 0; i < n; i++) {
			if(str[i] == ')') {
				if(stack.size() == 1) {
					outermostIndexes.add(stack.pop());
					outermostIndexes.add(i);
				}
				else
					stack.pop();
			}
			else if (str[i] == '(')
				stack.push(i);
		}

		for(int i = 0; i < n; i++)
			if(!outermostIndexes.contains(i))
				result.append(str[i]);

		return result.toString();
	}

	public static void main(String[] args) {
		assertEquals("()()()()(())", new RemoveOutermostParentheses1021().removeOuterParentheses("(()())(())(()(()))"));
	}

}
