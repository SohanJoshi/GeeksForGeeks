package com.basic.linkedlist;

import com.practice.util.QueueNode;

public class Queue_using_LinkedList {
	QueueNode front;
	QueueNode rear;

	/* The method push to push element into the queue*/
	void push(int a,Queue_using_LinkedList ob)
	{
		QueueNode node = new QueueNode();
		node.data = a;
		node.next = null;
		
		if(ob.front == null && ob.rear == null) {
			front = node;
		} else {
			rear.next = node;
		}
		
		rear = node;
	}

	/*The method pop which return the element popped out of the queue*/
	int pop(Queue_using_LinkedList ob)
	{
		if(ob.front == null && ob.rear == null) {
			return -1;
		}
		
		QueueNode node = front;
		front = front.next;
		
		if(front == null)
			rear = null;

		return node.data;
	}

}
