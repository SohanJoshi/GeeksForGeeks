package com.hard.tree;

import com.practice.util.Node;

/**
 * The idea is to do inorder traversal of the binary tree. 
 * While doing inorder traversal, keep track of the previously visited node in a variable say prev. 
 * For every visited node, make it next of prev and previous of this node as prev.
 * @author sohan.joshi
 *
 */
public class BT2DLL3 {
    Node BToDLL(Node root)
    {
    	Node head = BTToDLLUtil(root, null);
    	while(head.left != null)
    		head = head.left;
    	return head;
    }

	private Node BTToDLLUtil(Node root, Node prev) {
		if(root == null)
			return prev;
		prev = BTToDLLUtil(root.left, prev);
		
		if(prev != null)
			prev.right = root;
		root.left = prev;
		
		prev = BTToDLLUtil(root.right, root);
		
		return prev;
	}
}
