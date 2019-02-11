package com.hard.tree;

import com.practice.util.Node;

/**
 * <p>1) Fix Left Pointers: In this step, we change left pointers to point to previous nodes in DLL. 
 * 	The idea is simple, we do inorder traversal of tree. 
 * 	In inorder traversal, we keep track of previous visited node and change left pointer to the previous node. 
 * 	See fixPrevPtr() in below implementation. </p>
 * <p>2) Fix Right Pointers: The above is intuitive and simple. 
 * 	How to change right pointers to point to next node in DLL? 
 * 	The idea is to use left pointers fixed in step 1. 
 * 	We start from the rightmost node in Binary Tree (BT). 
 * 	The rightmost node is the last node in DLL. 
 * 	Since left pointers are changed to point to previous node in DLL, we can linearly traverse the complete DLL using these pointers. 
 * 	The traversal would be from last to first node.
 * 	While traversing the DLL, we keep track of the previously visited node and change the right pointer to the previous node.</p? 
 * @author sohan.joshi
 *
 */

public class BT2DLL2 {

    Node BToDLL(Node root)
    {
    	root = fixLeftPtr(root, null);
    	return fixRightPtr(root, null);
    }

	private Node fixRightPtr(Node root, Node prev) {
		if(root == null)
			return prev;
		root.right = prev;
		return fixRightPtr(root.left, root);
	}

	private Node fixLeftPtr(Node root, Node prev) {
		if(root != null) {
			Node left = fixLeftPtr(root.left, prev);
			root.left = left;
			return fixLeftPtr(root.right, root);
		}
		return prev;
	}
}
