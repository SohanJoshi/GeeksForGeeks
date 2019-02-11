package com.medium.linkedlist;

import com.practice.util.Node;

public class FlattenningLL {
	Node flatten(Node root) {
		if(root == null)
			return null;
		root.right = flatten(root.right);
		root = merge(root, root.right);
		return root;
	}
	
	Node merge(Node a, Node b) {
		if(a == null)
			return b;
		if(b == null)
			return a;
		else {
			if(a.data < b.data) {
				a.down = merge(a.down, b);
				return a;
			}
			else {
				b.down = merge(a, b.down);
				return b;
			}
		}
	}
}
