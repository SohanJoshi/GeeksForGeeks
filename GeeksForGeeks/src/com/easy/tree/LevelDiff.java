package com.easy.tree;

import com.practice.util.Node;

public class LevelDiff {
	
	private int odd = 0, even = 0;

	int getLevelDiff(Node root)
    {
		addLevelElement(root, true);
		return odd - even;
    }

	private void addLevelElement(Node node, boolean isOdd) {
		if(node != null) {
			addLevelElement(node.left, !isOdd);
			if(isOdd)
				odd += node.data;
			else
				even += node.data;
			addLevelElement(node.right, !isOdd);
		}
	}
}
