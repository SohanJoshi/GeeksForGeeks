package com.medium.bst.tree;

import com.practice.util.Node;

public class CheckBST {
    int isBST(Node root)  
    {
    	return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE)? 1 : 0;
    }

	private boolean isBSTUtil(Node root, int min, int max) {
    	if(root == null)
    		return true;
    	if(root.data > max || root.data < min)
    		return false;
    	return isBSTUtil(root.left,	min, root.data) && isBSTUtil(root.right, root.data, max);
	}
}
