package com.hard.tree;

import com.practice.util.Node;

public class BTToDLL {
    Node head;
    Node BToDLL(Node root)
    {
    	BT2DLL(root, null, null);
    	return head;
    }
	private Node BT2DLL(Node root, Node prev, Node next) {
		if(root == null)
			return null;
		if(root.left != null)
			prev = BT2DLL(root.left, prev, root);
		
		root.left = prev;
		
		if(root.right != null)
			next = BT2DLL(root.right, root, next);

		root.right = next;
		
		if(next != null)
			return next;
		return root;
	}
}
