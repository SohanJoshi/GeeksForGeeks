package com.medium.tree;

import com.practice.util.Node;

public class CountNodeInGivenRange {
    int getCountOfNode(Node root, int low, int high) 
    {
    	if(root == null)
    		return 0;
    	if(root.data > low && root.data > high)
    		return getCountOfNode(root.left, low, high);
    	if(root.data < low && root.data < high)
    		return getCountOfNode(root.right, low, high);
    	return getCountOfNode(root.left, low, high) + getCountOfNode(root.right, low, high) + 1;
    }
}
