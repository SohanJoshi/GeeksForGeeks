package com.medium.tree;

import java.util.HashMap;
import java.util.Map;

import com.practice.util.Node;

public class ConnectNodesAtSameLevel {

	void connect(Node root) {
		connect(root, new HashMap<>(), 0);
	}

	private void connect(Node node, Map<Integer, Node> map, int depth) {
		if(node != null ) {
			connect(node.right, map, depth + 1);
			
			node.nextRight = map.get(depth);
			map.put(depth, node);
			
			connect(node.left, map, depth + 1);
		}
	}
	
}
