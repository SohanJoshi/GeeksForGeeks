package com.easy;

import static org.junit.Assert.assertEquals;

public class RemoveOutermostParentheses1022_2 {

	public String removeOuterParentheses(String S) {
		char str[] = S.toCharArray();
		int counter = 0;

		StringBuffer result = new StringBuffer("");

		for(char c : str) {
			counter += (c == '(')? 1: -1;
			
			if(!(counter == 1 && c == '(') && !(counter == 0 && c == ')'))
				result.append(c);
		}
		
		return result.toString();
	}

	public static void main(String[] args) {
		assertEquals("()()()()(())", new RemoveOutermostParentheses1022_2().removeOuterParentheses("(()())(())(()(()))"));
	}

}
