package com.medium.linkedlist;

import com.practice.util.Node;

public class ReverseLLinGroups {

	public Node reverse(Node node, int k) {
		if(node == null || node.next == null || k == 0)
			return node;
		
		Node current = node, previous = node, next = node.next;
		
		int count = 1;
		
		while(next != null && count < k) {
			previous = current;
			current = next;
			next = next.next;
			current.next = previous;
			count ++;
		}
		
		node.next = reverse(next, k);
		
		return current;
	}
}
