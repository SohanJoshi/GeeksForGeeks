package com.ds.impl;

public class MaxHeap extends Heap {

	@Override
	public void add(int key) {
		ensureCapacity();
		heap[size] = key;
		size ++;
		heapifyUp();
	}

	@Override
	protected void heapifyUp() {
		int index = size - 1;
		int parentIndex = getParentIndex(index);
		while( parentIndex >= 0 && heap[parentIndex] < heap[index]) {
			swap(index , parentIndex);
			index = parentIndex;
			parentIndex = getParentIndex(index);
		}
	}

	@Override
	public int poll() {
		if(size == 0)
			throw new IllegalArgumentException("Heap Underflow");
		int temp = heap[0];
		heap[0] = heap[size - 1];
		size--;
		heapifyDown();
		return temp;
	}

	@Override
	protected void heapifyDown() {
		int index = 0;
		int left = getLeftIndex(index);
		int right = getRightIndex(index);
		int smallChild ;
		while(left < size ) {
			smallChild = left;
			if(right < size && heap[right] > heap[left])
				smallChild = right;
			if(heap[index] < heap[smallChild])
				swap(index, smallChild);
			else
				break;
			index = smallChild;
			left = getLeftIndex(index);
			right = getRightIndex(index);
		}
	}

}
