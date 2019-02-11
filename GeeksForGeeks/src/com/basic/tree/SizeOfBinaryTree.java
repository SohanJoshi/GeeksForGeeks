package com.basic.tree;

public class SizeOfBinaryTree {
	
	class TreeNode
	{
	    int data;
	    TreeNode left, right;
	    public TreeNode(int data)
	    {
	        this.data = data;
	         left = right = null;
	    }
	}
	
	public int size(TreeNode root){
		if(root == null)
			return 0;
		else return size(root.left) 
				+ size(root.right) + 1;
	}
}
