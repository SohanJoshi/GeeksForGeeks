package com.medium.linkedlist;

import com.practice.util.Node;

public class RemoveALoop {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(3);
		head.next.next = new Node(4);
		
		head.next.next.next = head.next;
		
		new RemoveALoop().removeTheLoop(head);
		
		System.out.println(head.data);
		System.out.println(head.next.data);
		System.out.println(head.next.next.data);
//		System.out.println(head.next.next.next.data);		// Causes NPE
//		System.out.println(head.next.next.next.next.data);	// Causes NPE
	}
	
	void removeTheLoop(Node head) {
		Node intersectionPoint = detectLoop(head);
		if(intersectionPoint != null ) {
			Node ptr1 = intersectionPoint, ptr2 = head;
			while(ptr1.next != ptr2.next) {
				ptr1 = ptr1.next;
				ptr2 = ptr2.next;
			}
			ptr1.next = null;
		}
	}

	public Node detectLoop(Node head) {
		if(head == null || head.next == null)
			return null;
		
		Node slow = head, fast = head;
		
		while( slow!= null && fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow)
				return fast;
		}
		
		return null;
	}	
}
