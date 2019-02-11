package com.easy.tree;

import java.util.Map;
import java.util.TreeMap;

import com.practice.util.Node;

public class MaxWidthOfTree {
	
	private Map<Integer, Integer> map = new TreeMap<>();
	private int maxWidth;
	
	int getMaxWidth(Node root)
    {
		updateMaxWidth(root, 0);
		return maxWidth;
    }

	private void updateMaxWidth(Node root, int depth) {
		if(root != null ) {
			Integer width = map.get(depth);
			if(width == null ) {
				width = 0;
			}
			map.put(depth, width + 1);
			if(width + 1 > maxWidth)
				maxWidth = width + 1;
			
			updateMaxWidth(root.left, depth + 1);
			updateMaxWidth(root.right, depth + 1);
		}
	}
}
