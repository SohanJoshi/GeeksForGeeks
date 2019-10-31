package com.easy;

import com.util.TreeNode;

public class RangeSumOfBST_938 {
    private int sum = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        rangeSumBSTUtil(root, L, R);

        return sum;
    }

    private void rangeSumBSTUtil(TreeNode root, int L, int R) {
        if(root != null)
        {
            if(root.val >= L && root.val <= R)
                sum += root.val;
            if(root.val >= L)
                rangeSumBSTUtil(root.left, L, R);
            if(root.val <= R)
                rangeSumBSTUtil(root.right, L, R);
        }
    }
}
