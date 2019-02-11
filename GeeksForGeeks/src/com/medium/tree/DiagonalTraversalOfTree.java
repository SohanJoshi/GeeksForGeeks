package com.medium.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.practice.util.TreeNode;

public class DiagonalTraversalOfTree {
    public void diagonalPrint(TreeNode root)
    {
    	Queue<TreeNode> nextLeft = new LinkedList<>();
    	
    	while(root != null) {
    		System.out.print(root.data + " ");
    		if(root.left != null)
    			nextLeft.add(root.left);
    		if(root.right != null)
    			root = root.right;
    		else
    			root = nextLeft.poll();
    	}
    }
}
