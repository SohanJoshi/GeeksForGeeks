package com.easy.tree;

import com.practice.util.TreeNode;

public class RightView {
	
	int maxDepth = -1;
	
	void rightView(TreeNode node) {
		rightView(node, 0);
	}
	
	private void rightView(TreeNode node, int depth) {
		if(node != null) {
			if(depth > maxDepth) {
				System.out.println(node.key + " ");
				maxDepth = depth;
			}
			rightView(node.right, depth + 1);
			rightView(node.left, depth + 1);
		}
	}
}
