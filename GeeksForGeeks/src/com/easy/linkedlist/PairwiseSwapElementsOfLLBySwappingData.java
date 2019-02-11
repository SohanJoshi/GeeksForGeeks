package com.easy.linkedlist;

import com.practice.util.Node;

public class PairwiseSwapElementsOfLLBySwappingData {
	public static void pairwiseSwap(Node node)
    {
       Node temp = node;
       while(temp != null && temp.next != null)
       {
           int k = temp.data;
           temp.data = temp.next.data;
           temp.next.data = k;
           temp = temp.next.next;
       }
       
    }
}
