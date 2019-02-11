package com.easy.tree;

import com.practice.util.Node;

public class PostOrderTraversal {

	public void postorder(Node root) {
		if(root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");
		}
		
	}

}
