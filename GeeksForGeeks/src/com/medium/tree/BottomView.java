package com.medium.tree;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.practice.util.Node;

public class BottomView {

	Map<Integer, Node> map = new TreeMap<>();
	
    // Should print bottom view of tree with given root
    public void bottomView(Node root)
    {
    	bottomViewUtil(root, 0);
    	printMap();
    }
    
    private void printMap() {
		for(Entry<Integer, Node> entry : map.entrySet())
			System.out.print(entry.getValue().data);
	}

	private void bottomViewUtil(Node root, int currentIndex) {
    	if(root != null) {
    		bottomViewUtil(root.left, currentIndex - 1);
    		
    		Node nodeAtIndex = map.get(currentIndex);
    		
    		if(null != nodeAtIndex && nodeAtIndex.hd > root.hd)
    			map.put(currentIndex, root);
    		
    		bottomViewUtil(root.right, currentIndex + 1);
    	}
    }
}
