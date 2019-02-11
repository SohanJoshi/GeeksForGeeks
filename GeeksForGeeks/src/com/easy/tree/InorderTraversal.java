package com.easy.tree;

import com.practice.util.Node;

public class InorderTraversal {

	public void inorder(Node root) {
		if(root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
		
	}

}
