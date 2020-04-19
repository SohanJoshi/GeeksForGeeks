package com.easy;

import java.util.PriorityQueue;

public class KthLargestElementInStream_703 {
    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargestElementInStream_703(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>(k);
        for(int value : nums) {
            addToHeap(value);
        }
    }

    private void addToHeap(int value) {
        if (minHeap.size() < k)
            minHeap.add(value);
        else if (minHeap.peek() < value) {
            minHeap.poll();
            minHeap.add(value);
        }
    }

    public int add(int val) {
        addToHeap(val);
        return minHeap.peek();
    }
}
