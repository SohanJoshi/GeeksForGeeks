package com.easy.linkedlist;

import com.practice.util.Node;

public class DeleteWOHeadRef {
	void deleteNode(Node node)
	{
		Node current = node;
		Node next = node.next;
		
		while(next.next != null) {
			current.data = next.data;
			current = next;
			next = next.next;
		}
		current.data = next.data;
		current.next = null;
	}
}
