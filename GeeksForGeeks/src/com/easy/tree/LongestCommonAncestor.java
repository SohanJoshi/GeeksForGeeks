package com.easy.tree;

import com.practice.util.Node;

public class LongestCommonAncestor {
	Node lca(Node node, int n1, int n2) 
    {
		if(node == null)
			return null;
		
		if(node.data > n1 && node.data > n2)
			return lca(node.left, n1, n2);
		
		if(node.data < n1 && node.data < n2)
			return lca(node.right, n1, n2);
		
        return node;
    }
}
