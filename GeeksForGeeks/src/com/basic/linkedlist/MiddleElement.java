package com.basic.linkedlist;

import com.practice.util.Node;

public class MiddleElement {

	int findMiddle(Node head) {
		Node fast = head, slow = head;
		while(fast != null && fast.next != null ) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow.data;
	}
	
}
