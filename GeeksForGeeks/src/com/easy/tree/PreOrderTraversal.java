package com.easy.tree;

import com.practice.util.Node;

public class PreOrderTraversal {

	public void preorder(Node root) {
		if(root != null) {
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}

}
