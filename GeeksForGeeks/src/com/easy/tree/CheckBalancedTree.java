package com.easy.tree;

import com.practice.util.Node;

public class CheckBalancedTree {
	private boolean isBalanced = true;
	
    boolean isBalanced(Node root)
    {
    	if(root == null)
    		return true;
    	
    	isBalancedUtil(root);
    	
    	return isBalanced;
    }
    
    private int isBalancedUtil(Node root) {
		
    	if(root == null)
    		return 0;
    	
    	int leftHeight = isBalancedUtil(root.left);
    	int rightHeight = isBalancedUtil(root.right);
    	
    	if(Math.abs(leftHeight - rightHeight) > 1)
    		isBalanced = false;
    	
    	return Math.max(leftHeight, rightHeight) + 1;
	}
}
