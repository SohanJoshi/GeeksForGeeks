package com.easy.stacks;

import java.util.Stack;

public class MinStack {
	Stack<Integer> minStack = new Stack<>();
	
	public void push(int a,Stack<Integer> s)
	{
		if(s.isEmpty())
			minStack.push(a);
		else
			minStack.push(Math.min(a, minStack.peek()));
		s.push(a);
	}
	public int pop(Stack<Integer> s)
    {
		if(s.isEmpty())
			return -1;
		minStack.pop();
		return s.pop();
	}
	public int min(Stack<Integer> s)
    {
		return minStack.peek();
	}
	public boolean isFull(Stack<Integer>s, int n)
    {
        return s.size() == n;
	}
	public boolean isEmpty(Stack<Integer>s)
    {
		return s.isEmpty();
	}
}
