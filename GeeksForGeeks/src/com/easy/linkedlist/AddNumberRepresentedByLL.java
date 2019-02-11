package com.easy.linkedlist;

import com.practice.util.Node;

public class AddNumberRepresentedByLL {

	int carry = 0;
	
	Node addTwoLists(Node first, Node second) {
		Node head = null;
		
		if(first == null && second == null) {
			if(carry == 0)
				return null;
			else
				return new Node(carry);
		}
		
		if(first == null) {
			head = new Node(second.data);
			head.data += carry;
			carry = (int) head.data / 10;
			head.data %= 10;
			head.next = addTwoLists(first, second.next);
		}
				
		else if(second == null) {
			head = new Node(first.data);
			head.data += carry;
			carry = (int) head.data / 10;
			head.data %= 10;
			head.next = addTwoLists(first.next, second);
		}
		
		else {
			head = new Node(first.data + second.data);
			head.data += carry;
			carry = (int) head.data / 10;
			head.data %= 10;
			head.next = addTwoLists(first.next, second.next);
		}
				
		return head;
	}
}
