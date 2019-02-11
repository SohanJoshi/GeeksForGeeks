package com.easy.linkedlist;

import com.practice.util.Node;

public class IntersectionPointOfLL {
	
	int intersectPoint(Node headA, Node headB)
	{
		int count1 = 0, count2 = 0;
		
		count1 = getNodeCount(headA);
		count2 = getNodeCount(headB);
		
		int diff = (count1 - count2);
		
		Node currentA = headA, currentB = headB;
		
		while(currentA != null && 
				diff > 0) {
			currentA = currentA.next;
			diff--;
		}
		while(currentB != null &&
				diff < 0) {
			currentB = currentB.next;
			diff++;
		}
		
		while(currentA != null &&
				currentB != null &&
				currentA != currentB) {
			currentA = currentA.next;
			currentB = currentB.next;
		}
		
		if(currentA != null && currentB != null)
			return currentA.data;
		
		return -1;
	}

	private int getNodeCount(Node head) {
		int count = 0;
		while(head != null) {
			head = head.next;
			count++;
		}
		
		return count;
	}

}
