package com.ds.impl;

import java.util.Iterator;

/**
 * This class is used to implement a Min Heap using array
 * @author sohan.joshi
 * 
 */
public abstract class Heap implements Iterable<Integer>{

	protected int heap[] ;
	protected int capacity = 16;
	protected int size;
	
	Heap()	{	this.heap = new int[capacity];	this.size = 0;	}
	Heap(int initialCapacity) {	
		this.capacity = initialCapacity;
		this.heap = new int[capacity];
		this.size = 0;
	}
	
	protected int getLeftIndex(int index) {	return 2 * index + 1;	}
	protected int getRightIndex(int index) {	return 2 * index + 2;	}
	protected int getParentIndex(int index) {	return (index - 1 ) / 2;	}

	protected void ensureCapacity() {
		if(size == capacity - 1)
		{
			int temp[] = new int[2 * capacity];
			for(int i = 0; i < heap.length; i++)
				temp[i] = heap[i];
			heap = temp;
			capacity *= 2;
		}
		
	}
	
	protected void swap(int i , int j) {
		int temp = heap [i];
		heap[i] = heap[j];
		heap[j] = temp;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}

	public abstract void add(int key);
	protected abstract void heapifyUp();
	
	public abstract int poll();
	protected abstract void heapifyDown(); 
	
	private class HeapIterator implements Iterator<Integer>
	{
		private int counter = 0;
		
		@Override
		public boolean hasNext()	{	return counter < size;	}
		@Override
		public Integer next() {		return heap[counter ++];	}
	}
	
	
	@Override
	public Iterator<Integer> iterator() {
		return new HeapIterator();
	}
}
