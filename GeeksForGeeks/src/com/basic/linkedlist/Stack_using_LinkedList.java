package com.basic.linkedlist;

import com.practice.util.StackNode;

public class Stack_using_LinkedList {
	StackNode top;
	/* The method push to push element into the stack */
	void push(int a,Stack_using_LinkedList ob)
	{
		StackNode node = new StackNode();
		node.data = a;
		node.next = null;
		
		if(ob.top == null) {
			ob.top = node;
		} 
		else {
			node.next = ob.top;
			ob.top = node;
		}
	}
	/*The method pop which return the element poped out of the stack*/
	int pop(Stack_using_LinkedList ob)
	{
		if(ob.top == null)
			return -1;
		
		StackNode node = ob.top;
		ob.top = ob.top.next;
		
		return node.data;
	}
}
