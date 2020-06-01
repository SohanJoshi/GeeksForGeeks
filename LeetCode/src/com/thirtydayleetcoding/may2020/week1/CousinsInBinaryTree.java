package com.thirtydayleetcoding.may2020.week1;

import com.util.TreeNode;

public class CousinsInBinaryTree {
    private boolean isCousins = false;
    TreeNode x_parent = null , y_parent = null;
    int x, y, x_depth = -1, y_depth = -1;

    public boolean isCousins(TreeNode root, int x, int y) {
        this.x = x;
        this.y = y;
        checkForCousins(root.left, root, 1);
        checkForCousins(root.right, root, 1);
        return isCousins;
    }

    private void checkForCousins(TreeNode node, TreeNode parent, int depth) {
        if(node == null)
            return;

        if(x_parent != null && y_parent != null)
            return;

        if(node.val == x) {
            x_parent = parent;
            x_depth = depth;
            setIsCousins();
        }
        else if(node.val == y) {
            y_parent = parent;
            y_depth = depth;
            setIsCousins();
        }
        checkForCousins(node.left, node, depth + 1);
        checkForCousins(node.right, node, depth + 1);
    }

    private void setIsCousins() {
        if(x_parent != null && y_parent != null)
            isCousins = (x_parent != y_parent && x_depth == y_depth);
    }

}
