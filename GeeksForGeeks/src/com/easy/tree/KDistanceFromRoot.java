package com.easy.tree;

import com.practice.util.Node;

public class KDistanceFromRoot {
    void printKdistance(Node root, int k)
    {
    	printKdistance(root, k, 0);
    }
    
    private void printKdistance(Node root, int k, int i) 
    {
    	if(k < i)
    		return;
    	if(root != null) 
    	{
   			printKdistance(root.left, k, i + 1);
    		if(k == i)
    			System.out.println(root.data + " ");
    		printKdistance(root.right, k, i + 1);
    	}
    }
}
