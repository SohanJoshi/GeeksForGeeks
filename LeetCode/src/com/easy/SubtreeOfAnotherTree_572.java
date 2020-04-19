package com.easy;

import com.util.TreeNode;

public class SubtreeOfAnotherTree_572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null && t == null)
            return true;
        if(s == null)
            return false;
        if(t == null)
            return true;

        return isSubtreeUtil(s, t);
    }

    private boolean isSubtreeUtil(TreeNode s, TreeNode t) {
        if(s == null)
            return false;

        if(s.val == t.val && compareSubTree(s, t))
            return true;
        return isSubtreeUtil(s.left, t) || isSubtreeUtil(s.right, t);
    }

    private boolean compareSubTree(TreeNode sNode, TreeNode tNode) {
        if(sNode == tNode)
            return true;
        else if(sNode == null || tNode == null)
            return false;
        else
            return sNode.val == tNode.val
                    && compareSubTree(sNode.left, tNode.left)
                    && compareSubTree(sNode.right, tNode.right);
    }

}
