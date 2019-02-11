package com.easy.tree;

import com.practice.util.Node;

public class ReverserAlternateLevel {

    void reverseAlternate(Node node)
    {
    	reverseAlternateUtil(node, true);
    }

	private void reverseAlternateUtil(Node node, boolean reverse) {
		if(node != null) {
			if(reverse) {
				swapLeftRight(node);
				swapLeftLeft(node.left, node.right);
				swapRightRight(node.left, node.right);
			}
			reverseAlternateUtil(node.left, !reverse);
			reverseAlternateUtil(node.right, !reverse);
		}
	}

	private void swapRightRight(Node left, Node right) {
		if(left != null && right != null ) {
			Node temp = left.right;
			left.right = right.right;
			right.right = temp;
		}
	}

	private void swapLeftLeft(Node left, Node right) {
		if(left != null && right != null) {
			Node temp = left.left;
			left.left = right.left;
			right.left = temp;
		}
		
	}

	private void swapLeftRight(Node node) {
		Node temp = node.left;
		node.left = node.right;
		node.right = temp;
	}
	
}
