package com.hard.tree;

import com.practice.util.Node;

/**
 * In the following implementation, we traverse the tree in inorder fashion. 
 * We add nodes at the beginning of current linked list and update head of the list using pointer to head pointer. 
 * Since we insert at the beginning, we need to process leaves in reverse order. 
 * For reverse order, we first traverse the right subtree before the left subtree. i.e. do a reverse inorder traversal.
 * @author sohan.joshi
 *
 */

public class BTToDLL4 {

    Node BToDLL(Node root)
    {
    	Node head = BToDLLUtil(root, null);
    	
    	return head;
    }

	private Node BToDLLUtil(Node root, Node head) {
		if(root == null)
			return head;
		
		head = BToDLLUtil(root.right, head);
		
		root.right = head;
		
		if(head != null)
			head.left = root;
		
		head = root;
		
		head = BToDLLUtil(root.left, head);
		
		return head;
	}
	
}
