package com.easy.tree;

import com.practice.util.Node;

public class LeftView {
	int maxDepth = 0;
	
    void leftView(Node root)
    {
    	leftViewUtil(root, 1);
    }

	private void leftViewUtil(Node root, int currentDepth) {
		if(root == null)
			return;
		if(maxDepth < currentDepth) {
			System.out.print(root.data + " ");
			maxDepth = currentDepth;
		}
		leftViewUtil(root.left, currentDepth + 1);
		leftViewUtil(root.right, currentDepth + 1);
	}
}
