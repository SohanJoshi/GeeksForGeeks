package com.easy.tree;

import com.practice.util.Node;

public class MaximumPathSum {
	
	public int maxPathSum(Node root)
    {
    	return maxPathSumUtil(root);
    }

	private int maxPathSumUtil(Node root) {
		if(root == null)
			return 0;
		if(root.left == null && root.right == null) {
			return root.data;
		}
		return Math.max(Math.max(maxPathSumUtil(root.left), maxPathSumUtil(root.right))
				, maxPathSumRTL(root.left, 0) + maxPathSumRTL(root.right, 0) + root.data);
	}
	
	private int maxPathSumRTL(Node root, int sum) {
		if(root == null)
			return 0;
		return Math.max(maxPathSumRTL(root.left, sum),
			maxPathSumRTL(root.right, sum)) + root.data;
	}
}
