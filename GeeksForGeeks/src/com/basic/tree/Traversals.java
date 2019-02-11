package com.basic.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.practice.util.Node;

public class Traversals {
    void inOrder(Node root)
    {
    	if(root != null) {
    		inOrder(root.left);
    		System.out.print(root.data + " ");
    		inOrder(root.right);
    	}
    }
    
    void levelorder(Node root) 
    {
    	Queue<Node> queue = new LinkedList<>();
    	if(root == null)
    		return;
    	queue.add(root);
    	while(!queue.isEmpty()) {
    		Node node = queue.poll();
    		if(node.left != null)
    			queue.add(node.left);
    		if(node.right != null)
    			queue.add(node.right);
    		System.out.print(node.data + " ");
    	}
    }
    
    void levelOrder(Node root) 
    {
    	Queue<Node> queue = new LinkedList<>();
    	if(root == null)
    		return;
    	queue.add(root);
    	queue.add(null);
    	while(!queue.isEmpty()) {
    		Node node = queue.poll();
    		if(node == null && !queue.isEmpty()) {
    			System.out.print("$ ");
    			queue.add(null);
    		}
    		else if (node != null){
	    		if(node.left != null)
	    			queue.add(node.left);
	    		if(node.right != null)
	    			queue.add(node.right);
	    		System.out.print(node.data + " ");
    		}
    	}
    	System.out.print("$ ");
    }
    
    void reversePrint(Node root) 
    {
    	Queue<Node> queue = new LinkedList<>();
    	reversePrintUtil(queue);
    }

	private void reversePrintUtil(Queue<Node> queue) {
		if(queue.isEmpty())
			return;
		Queue<Node> nextLevel = new LinkedList<>();
		
		for(Node node : queue) {
			if(node.left != null)
				nextLevel.add(node.left);
			if(node.right != null)
				nextLevel.add(node.right);
		}
		
		reversePrintUtil(nextLevel);
		for(Node node : queue)
			System.out.print(node.data + " ");
	}
}
