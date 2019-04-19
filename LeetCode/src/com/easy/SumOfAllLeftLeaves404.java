package com.easy;

import com.util.TreeNode;

public class SumOfAllLeftLeaves404 {
    private int sum;

	public int sumOfLeftLeaves(TreeNode root) {
        if(root != null)
        	sumOfLeftLeavesUtil(root, false);
    	return sum;
    }

	private void sumOfLeftLeavesUtil(TreeNode node, boolean isLeftChild) {
		if(isLeftChild && node.left == null && node.right == null) {
			sum += node.val;
			return;
		}
		if(node.left != null)
			sumOfLeftLeavesUtil(node.left, true);
		if(node.right != null)
			sumOfLeftLeavesUtil(node.right, false);
	}
}
