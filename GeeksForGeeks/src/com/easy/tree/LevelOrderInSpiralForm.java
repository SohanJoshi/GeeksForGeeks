package com.easy.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.practice.util.Node;

public class LevelOrderInSpiralForm {
	void printSpiral(Node root) 
	{
		if(root == null)
			return;
		Queue<Node> queue = new LinkedList<>();
		boolean printFromRight = true;

		queue.add(root);

		while(!queue.isEmpty()) {
			printLevel(queue, printFromRight);
			printFromRight = !printFromRight;
		}
	}

	private void printLevel(Queue<Node> queue, boolean addFromLeft) {
		if(!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.print(node.data + " ");
			printLevel(queue, addFromLeft);
			if(addFromLeft) {
				if(node.left != null)
					queue.add(node.left);
				if(node.right != null)
					queue.add(node.right);
			}
			else {
				if(node.right != null)
					queue.add(node.right);
				if(node.left != null)
					queue.add(node.left);
			}
		}
	}
}
