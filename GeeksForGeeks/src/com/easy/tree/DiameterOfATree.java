package com.easy.tree;

import com.practice.util.Node;

public class DiameterOfATree {
    int diameter(Node node)
    {
    	if(node == null)
    		return 0;
    	
    	return Math.max(Math.max(diameter(node.left), diameter(node.right)), height(node.left) + height(node.right) + 1);
    }
    
    private int height(Node node) {
    	if(node == null)
    		return 0;
    	return Math.max(height(node.left), height(node.right)) + 1;
    }
}
