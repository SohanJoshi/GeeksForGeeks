package com.easy.linkedlist;

import com.practice.util.Node;

public class RotateLL {

	static Node head;
	
	public void rotate(Node head, int k) {
		if(head == null || k == 0)
			return;
		
		Node ptr = head;
		
		for(int i = 0; i < k - 1 && ptr != null ; i++)
			ptr = ptr.next;
		
		Node temp = ptr;
		ptr = ptr.next;
		temp.next = null;
		temp = ptr;
			
		while(ptr.next != null)
			ptr = ptr.next;
		
		ptr.next = head;
		head = temp;
	}
	
}
