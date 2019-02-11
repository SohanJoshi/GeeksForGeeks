package com.easy.linkedlist;

import java.util.Scanner;

public class SegregateEvenOddNodes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();
		while(T -- > 0) {
			int n = in.nextInt();
			LinkedList llist = new LinkedList();
			for(int i = 0; i < n ; i++) {
				int value = in.nextInt();
				llist.addToTheLast(new Node(value));
			}
			//llist.printList();
			compute(llist);
			llist.printList();

		}

		in.close();
	}

	private static void compute(LinkedList llist) {

		Node tailHead = null,tailTail = null;

		Node current = llist.head, previous = llist.head;

		while(current != null) {
			if(current.data % 2 != 0) {
				if(current == llist.head) {
					llist.head = current.next;
					previous = llist.head;
				}
				else {
					previous.next = current.next;
				}
				if(tailHead == null) {
					tailHead = current;
					tailTail = current;
				}
				else {
					tailTail.next = current;
					tailTail = tailTail.next;
				}
				current = current.next;
			}
			else {
				previous = current;
				current = current.next;
			}
		}
		if(previous == null)
			llist.head = tailHead;
		else {
			previous.next = tailHead;
			tailTail.next = null;
		}
	}

	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	static class LinkedList {
		public Node head;
		public Node tail;
		/* Linked list Node*/
		/* Utility functions */
		/* Inserts a new Node at front of the list. */
		public void addToTheLast(Node node)
		{
			if (head == null)
			{
				head = node;
				tail = node;
			}
			else
			{
				tail.next = node;
				tail = tail.next;
			}
		}
		/* Function to print linked list */
		public void printList()
		{
			Node temp = head;
			while (temp != null)
			{
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}

	}

}
