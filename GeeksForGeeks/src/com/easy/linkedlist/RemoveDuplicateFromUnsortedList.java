package com.easy.linkedlist;

import java.util.HashSet;
import java.util.Set;

import com.practice.util.Node;

public class RemoveDuplicateFromUnsortedList {
    Node removeDuplicates(Node head)
    {
    	if(head == null)
    		return head;
    	
    	Node current = head.next, previous = head;
    	Set<Integer> set = new HashSet<>();
    	set.add(previous.data);
    	
    	while(current != null) {
    		if(!set.add(current.data)) {
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
