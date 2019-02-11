package com.easy.linkedlist;

import com.practice.util.Node;

public class Merge2SortedLL {

	Node merge(Node headA, Node headB) {
		
		if(headA == null)
			return headB;
		if(headB == null)
			return headA;
		
		else {
			if(headA.data < headB.data) {
				headA.next = merge(headA.next, headB);
				return headA;
			}
			else {
				headB.next = merge(headA, headB.next);
				return headB;
			}
		}
	}
	
}
