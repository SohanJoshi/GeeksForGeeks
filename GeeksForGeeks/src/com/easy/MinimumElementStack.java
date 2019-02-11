package com.easy;

import java.util.Stack;

public class MinimumElementStack {
	int minEle = -1;
    Stack<Integer> s;
    Stack<Integer> minStack;
    /*returns min element from stack*/
    int getMin()
    {
		return minEle;
    }
    
    /*returns popped element from stack*/
    int pop()
    {
        if(s == null || s.isEmpty())
            return -1;
    	minStack.pop();
    	minEle = minStack.isEmpty() ? -1 : minStack.peek();
    	return s.pop();

    }
    /*push element x into the stack*/
    void push(int x)
    {
    	if(s == null) {
    		s = new Stack<>();
    		minStack = new Stack<>();
    	}
    	s.push(x);
    	minStack.push(minStack.isEmpty() ? 
    			x : Math.min(minStack.peek(), x));
    	minEle = minStack.peek();
    }	
}
