package com.easy.tree;

import com.practice.util.Node;

public class SymmetricTree {
    public boolean isSymmetric(Node root)
    {
    	if(root == null)
    		return true;
    	return isSymmetricUtil(root.left, root.right);
    }

	private boolean isSymmetricUtil(Node nodeA, Node nodeB) {
		if(nodeA == null && nodeB == null)
			return true;
		if(nodeA == null || nodeB == null)
			return false;
		if(nodeA.data != nodeB.data)
			return false;
		return isSymmetricUtil(nodeA.left, nodeB.right) 
					&& isSymmetricUtil(nodeA.right, nodeB.left);
	}
}
