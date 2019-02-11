package com.easy.linkedlist;

import com.practice.util.Node;

public class SortLLOf_0_1_2 {
	void linksort(Node head)
    {
		if(head == null || head.next == null)
			return;
		
		Node node = head;
		int count0 = 0, count1 = 0;
		
		while(node != null) {
			switch(node.data) {
				case 0 : count0 ++; break;
				case 1 : count1 ++; break;
			}
			node = node.next;
		}
		
		node = head;
		
		while(node != null) {
			if(count0 > 0) {
				node.data = 0;
				count0 --;
			}
			else if(count1 > 0) {
				node.data = 1;
				count1--;
			} else 
				node.data = 2;
			node = node.next;
		}
    }
}
