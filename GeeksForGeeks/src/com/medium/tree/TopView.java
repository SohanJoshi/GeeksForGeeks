package com.medium.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.practice.util.TreeNode;

public class TopView {
	
	int leftMin = 1;
	int rightMax = 0;
	
	class NodeHDPair {
		TreeNode node;
		int hd;
		NodeHDPair(TreeNode node, int hd) {
			this.node = node;
			this.hd = hd;
		}
	}
	
    public void printTopView(TreeNode root)
    {
    	Queue<NodeHDPair> q = new LinkedList<>();
    	
    	if(root == null)
    		return;
    	
    	q.add(new NodeHDPair(root, 0));
    	
    	while(!q.isEmpty()) {
    		NodeHDPair nodepair = q.poll();
    		
    		if(leftMin > nodepair.hd) {
    			System.out.print(nodepair.node.key + " ");
    			leftMin = nodepair.hd;
    		}
    		if(rightMax < nodepair.hd) {
    			System.out.print(nodepair.node.key + " ");
    			rightMax = nodepair.hd;
    		}
    		
    		if(nodepair.node.left != null)
    			q.add(new NodeHDPair(nodepair.node.left, nodepair.hd - 1));
    		
    		if(nodepair.node.right != null)
    			q.add(new NodeHDPair(nodepair.node.right, nodepair.hd + 1));

    	}
    }
}