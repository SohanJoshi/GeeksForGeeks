package com.easy.linkedlist;

import com.practice.util.Node;

public class DetectLoopInLinkedList {
	
	public int detectLoop(Node head) {
		if(head == null || head.next == null)
			return 0;
		
		Node slow = head, fast = head;
		
		while( slow!= null && fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow)
				return 1;
		}
		
		return 0;
	}
}
