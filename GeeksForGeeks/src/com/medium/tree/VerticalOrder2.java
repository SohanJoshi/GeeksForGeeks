package com.medium.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.practice.util.Node;

public class VerticalOrder2 {
	
	private Map<Integer, List<Node>> verticalOrder = new TreeMap<>();
	
	void verticalOrder(Node root)
    {
		verticalOrder(root, 0);
		printTree();
    }

	private void printTree() {
		for(Entry<Integer, List<Node>> entry : verticalOrder.entrySet())
			for(Node node : entry.getValue())
				System.out.print(node.data + " ");
	}

	private void verticalOrder(Node node, int hd) {
		if(node != null ) {
			List<Node> list = verticalOrder.get(hd);
			if(list == null) {
				list = new LinkedList<>();
				verticalOrder.put(hd, list);
			}
			list.add(node);
			
			verticalOrder(node.left, hd - 1);
			verticalOrder(node.right, hd + 1);
		}
	}
}
