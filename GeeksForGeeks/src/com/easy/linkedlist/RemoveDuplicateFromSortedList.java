package com.easy.linkedlist;

import com.practice.util.Node;

public class RemoveDuplicateFromSortedList {
    Node removeDuplicates(Node head)
    {
    	if(head == null)
    		return head;
    	
    	Node current = head.next, previous = head;
    	
    	while(current != null) {
    		if(previous.data == current.data) {
    			current = current.next;
    			previous.next = current;
    		}
    		else {
    			previous = current;
    			current = current.next;
    		}
    	}
    	
    	return head;
    }
}
