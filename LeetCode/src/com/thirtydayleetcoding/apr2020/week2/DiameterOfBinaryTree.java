package com.thirtydayleetcoding.apr2020.week2;

import com.util.TreeNode;

public class DiameterOfBinaryTree {
    private int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {

        diameterOfBinaryTreeUtil(root);

        return diameter;
    }

    private int diameterOfBinaryTreeUtil(TreeNode root) {
        if(root == null)
            return 0;

        int left = diameterOfBinaryTreeUtil(root.left);
        int right = diameterOfBinaryTreeUtil(root.right);

        diameter = Math.max(left + right, diameter);

        return Math.max(left, right) + 1;
    }
}
