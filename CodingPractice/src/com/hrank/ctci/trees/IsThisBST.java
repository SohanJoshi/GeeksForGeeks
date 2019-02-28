package com.hrank.ctci.trees;

public class IsThisBST {

	private Node prev = null;

	boolean checkBST(Node root) {
		if(root != null)
		{
			if( !checkBST(root.left))
				return false;
			if(prev != null && root.data <= prev.data)
				return false;
			prev = root;
			return checkBST(root.right);
		}
		return true;
	}


	// 1 2 4 3 5 6 7 
	public static void main(String args[])
	{
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(6);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.right.left = new Node(5);
		root.right.right = new Node(7);

		if (new IsThisBST().checkBST(root))
			System.out.println("IS BST");
		else
			System.out.println("Not a BST");
	}

}
class Node {
	int data;
	Node left;
	Node right;
	Node(int n)
	{
		this.data = n;
	}

}