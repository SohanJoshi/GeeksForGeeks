package com.hard.tree;

import com.practice.util.Node;

/**
 * 	<strong>Algorithm followed : </strong><br>
 * 	1. If left subtree exists, process the left subtree<br>
		…..1.a) Recursively convert the left subtree to DLL.<br>
		…..1.b) Then find inorder predecessor of root in left subtree (inorder predecessor is rightmost node in left subtree).<br>
		…..1.c) Make inorder predecessor as previous of root and root as next of inorder predecessor.<br>
	2. If right subtree exists, process the right subtree (Below 3 steps are similar to left subtree).<br>
		…..2.a) Recursively convert the right subtree to DLL.<br>
		…..2.b) Then find inorder successor of root in right subtree (inorder successor is leftmost node in right subtree).<br>
		…..2.c) Make inorder successor as next of root and root as previous of inorder successor.<br>
	3. Find the leftmost node and return it (the leftmost node is always head of converted DLL).<br>
 * @author 	sohan.joshi <br>
 * 			copied from {@link https://www.geeksforgeeks.org/in-place-convert-a-given-binary-tree-to-doubly-linked-list/ } 
 *
 */

public class BT2DLL1 {
    Node BToDLL(Node root)
    {
    	BToDLLUtil(root);
       	Node head = root;
    	while(head.left != null)
    		head = head.left;
    	return head;
    }

	private void BToDLLUtil(Node node) {
		if(node == null)
			return;
		if(node.left != null ) {
			BToDLLUtil(node.left);
			
			Node left = node.left;
			
			while(left.right != null)
				left = left.right;
			
			node.left = left;
			left.right = node;
		}
		
		if(node.right != null ) {
			BToDLLUtil(node.right);
			
			Node right = node.right;
			
			while(right.left != null)
				right= right.left;
			
			node.right = right;
			right.left = node;
		}
	}
}
