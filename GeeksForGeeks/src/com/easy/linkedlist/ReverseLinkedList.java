package com.easy.linkedlist;

import com.practice.util.Node;

public class ReverseLinkedList {

	Node reverse(Node head) {
		Node pre = head, ptr = head;
		Node post = pre.next;
		pre.next = null;
		
		while(post != null ) {
			ptr = post;
			post = post.next;
			ptr.next = pre;
			pre = ptr;
		}
		
		return ptr;
	}
	
}
