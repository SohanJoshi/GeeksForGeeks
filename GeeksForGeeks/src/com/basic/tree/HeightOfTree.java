package com.basic.tree;

import com.practice.util.Node;

public class HeightOfTree {
    int height(Node node) 
    {
         if(node == null)
        	 return 0;
         
         return Math.max(height(node.left), height(node.right)) + 1;
    }
}
