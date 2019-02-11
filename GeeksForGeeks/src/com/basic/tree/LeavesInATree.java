package com.basic.tree;

import com.practice.util.Node;

public class LeavesInATree {
	int countLeaves(Node node) 
    {
		if(node.left == null && node.right == null)
			return 1;
		return countLeaves(node.left) + countLeaves(node.right);
    }
}
