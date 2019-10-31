package com.easy;

import com.util.TreeNode;

public class UnivaluedBinaryTree_965 {
    private int uniqueValue ;
    public boolean isUnivalTree(TreeNode root) {
        uniqueValue = root.val;

        return isUnivalTreeUtil(root);
    }

    private boolean isUnivalTreeUtil(TreeNode root) {
        if(root == null)
            return true;
        if(root.val != uniqueValue)
            return false;
        return isUnivalTreeUtil(root.left) && isUnivalTreeUtil(root.right);
    }
}
