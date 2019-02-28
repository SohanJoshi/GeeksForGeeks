package com.ds.impl;

public class MinHeapDemo {
	public static void main(String[] args) {
		Heap heap = new MinHeap();
		for(int i = 11; i <=20 ; i++)
			heap.add(i);
		for(int i = 10; i >= 1 ; i--)
			heap.add(i);
		for(int i : heap)
			System.out.print(i + " ");
		System.out.println();
		for(int i = 0 ; i < 20 ; i++)
			System.out.print(heap.poll() + " ");
	}
}
