package com.easy.tree;

import com.practice.util.Node;

public class LevelOfANode {

	public int getLevel(Node root, int key)
    {
		if(root == null)
			return 0;
		
		if(root.data == key)
			return 1;
		
		int level = getLevel(root.left, key);
		if(level > 0)
			return level + 1;
		level = getLevel(root.right, key);
		if(level > 0)
			return level + 1;
		
		return 0;
    }
}
