package com.easy.tree;

import java.util.LinkedList;
import java.util.List;

import com.practice.util.Node;

public class Root2Leaf {
	public void printPaths(Node root)
    {
		printPaths(root, new LinkedList<>());
    }

	private void printPaths(Node root, List<Node> list) {
		if(root != null) {
			list.add(root);
			if(root.left == null && root.right == null) {
				printPath(list);
			}
			else {
				printPaths(root.left, list);
				printPaths(root.right, list);
			}
			list.remove(root);
		}
	}

	private void printPath(List<Node> list) {
		for(Node node : list)
			System.out.print(node.data + " ");
		System.out.print("#");
	}
}
