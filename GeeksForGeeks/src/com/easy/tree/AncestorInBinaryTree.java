package com.easy.tree;

import com.practice.util.Node;

public class AncestorInBinaryTree {
    public boolean printAncestors(Node node, int key)
    {
    	if(node == null)
    		return false;
    	if(node.data == key)
    		return true;
    	if(printAncestors(node.left, key) || printAncestors(node.right, key)) {
    		System.out.print(node.data + " ");
    		return true;
    	}
    	return false;
    }
}
