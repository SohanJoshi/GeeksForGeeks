package com.easy;

import com.util.Node;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NAryPreorderTraversal_589 {
    public List<Integer> preorder(Node root) {
        if(root == null)
            return Collections.emptyList();

        List<Integer> traversal = new LinkedList<>();

        traversal.add(root.val);
        for(Node child : root.children)
            traversal.addAll(preorder(child));

        return traversal;
    }
}
