package com.medium.tree;

import com.practice.util.Node;

public class VerticalOrder {
	int minDist = 0;
	int maxDist = 0;
	
	void verticalOrder(Node root)
    {
        findMinMax(root, 0);
        printVerticalOrder(root);
    }

	private void printVerticalOrder(Node root) {
		for(int i = minDist; i <= maxDist; i++)
			printUtil(root, 0, i);
	}

	private void printUtil(Node root, int hd, int line) {
		if(hd == line)
			System.out.print(root.data + " ");
		printUtil(root.left, hd - 1, line);
		printUtil(root.right, hd + 1, line);
	}

	private void findMinMax(Node root, int hd) {
		if(root == null)
			return;
		
		if(hd < minDist)
			minDist = hd;
		if(hd > maxDist)
			maxDist = hd;
		
		findMinMax(root.left, hd - 1);
		findMinMax(root.right, hd + 1);
	}
	
}
