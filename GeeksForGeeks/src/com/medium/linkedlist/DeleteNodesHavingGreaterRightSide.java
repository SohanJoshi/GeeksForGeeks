package com.medium.linkedlist;

import java.util.Scanner;

import com.practice.util.LinkedList;
import com.practice.util.Node;

public class DeleteNodesHavingGreaterRightSide {

	public static void main(String args[])
	{
		/* Constructed Linked List is 1.2.3.4.5.6.
	         7.8.8.9.null */
		int value;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0 && sc.hasNextInt() )
		{
			int n = sc.nextInt();
			LinkedList llist = new LinkedList();
			//int n=Integer.parseInt(br.readLine());
			int a1 = sc.nextInt();
			Node head = new Node(a1);
			llist.addToTheLast(head);
			for (int i = 1; i < n && sc.hasNextInt() ; i++)
			{
				int a = sc.nextInt();
				llist.addToTheLast(new Node(a));
			}
			new DeleteNodesHavingGreaterRightSide().compute(llist);
			llist.printList();
			t--;
		}
	}


	void compute(LinkedList l)
	{
		l.head = deleteNodesOnRight(l.head);    	
	}

	private Node deleteNodesOnRight(Node node) {
		if(node == null)
			return node;
		node.next = deleteNodesOnRight(node.next);
		if(node.next == null)
			return node;
		else {
			if(node.data >= node.next.data)
				return node;
			else
				return node.next;
		}
	}
}
