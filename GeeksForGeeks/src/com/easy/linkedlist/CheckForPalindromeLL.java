package com.easy.linkedlist;

import com.practice.util.Node;

public class CheckForPalindromeLL {

    boolean isPalindrome(Node head) 
    {
    	if(head == null || head.next == null)
    		return true;
    	
    	Node mid = getMid(head);
    	mid.next = reverse(mid.next);    	
        return compareLists(head, mid.next);
    }

	private boolean compareLists(Node headA, Node headB) {
		while(headA != null && headB != null)
			if(headA.data != headB.data)
				return false;
			else {
				headA = headA.next;
				headB = headB.next;
			}
		return true;
	}

	private Node reverse(Node head) {
		Node previous = null, current = head, next;
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	private Node getMid(Node head) {
		Node slow = head, fast = head.next;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
}
