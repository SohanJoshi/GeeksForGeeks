package com.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses_20 {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>(s.length());

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push(s.charAt(i));
            else if(stack.isEmpty() || (s.charAt(i) == ')' && stack.poll() != '(') ||
                    (s.charAt(i) == '}' && stack.poll() != '{') ||
                    (s.charAt(i) == ']' && stack.poll() != '['))
                return false;
        }

        return stack.isEmpty();
    }
}
