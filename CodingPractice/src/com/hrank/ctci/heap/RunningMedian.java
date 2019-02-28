package com.hrank.ctci.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RunningMedian {
    private static int[] a;
	private static int size = 0;
	private static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
	private static double lastMedian = 0.0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            addToHeap(a[a_i]);
            size ++;
            updateMedian();
            System.out.println(lastMedian);
        }
        in.close();
	}

	private static void addToHeap(int i) {
		if(i > (int)lastMedian)
			minHeap.add(i);
		else
			maxHeap.add(i);
		if(minHeap.size() - maxHeap.size() == 2)
			maxHeap.add(minHeap.poll());
		if(maxHeap.size() - minHeap.size() == 2)
			minHeap.add(maxHeap.poll());
	}

	private static void updateMedian() {
		if(size % 2 ==0) {
			double lower = ( minHeap.peek() == null)? 0 :  minHeap.peek();
			double higher = ( maxHeap.peek() == null)? 0 :  maxHeap.peek();
			lastMedian = (lower + higher ) / 2;
		} else {
			lastMedian = (minHeap.size() > maxHeap.size()) ? minHeap.peek() : maxHeap.peek();
		}
	}
}
