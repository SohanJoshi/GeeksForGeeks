package com.medium.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KthLargestlElementInStream {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		while(T-- > 0) {
			String constraints[] = br.readLine().split(" ");
			int k = Integer.parseInt(constraints[0]);
			int n = Integer.parseInt(constraints[1]);
			String elements[] = br.readLine().split(" ");
			int arr[] = new int[n];
			MinHeap heap = new MinHeap(k + 1);

			for(int i = 0, j = 0; i < n; i++, j++) {
				while(elements[j].trim().isEmpty())
					j++;
				arr[i] = Integer.parseInt(elements[j]);

				if(i < k - 1) {
					heap.add(arr[i]);
					System.out.print("-1 ");
				} else if(i == k -1) {
					heap.add(arr[i]);
					System.out.print(heap.peek() + " ");
				}
				else {
					if(arr[i] > heap.peek()) {
						heap.add(arr[i]);
						heap.get();
					}
					System.out.print(heap.peek() + " ");
				}
			}
			System.out.println();
		}
	}

	private static class MinHeap{
		int data[];
		int size = 0;

		MinHeap(int n) {
			data = new int[n];
		}

		void add(int key) {
			if(size == data.length) {
				System.out.println("Over flowing");
				return;
			}
			data[size++] = key;
			int index = size - 1;
			while(index > 0) {
				int parent = (index - 1) / 2;
				if(data[index] < data[parent]) {
					swap(index,parent);
					index = parent;
				}
				else
					break;
			}
		}

		private void swap(int i, int j) {
			int temp = data[i];
			data[i] = data[j];
			data[j] = temp;
		}

		private void heapify(int i) {
			int left = 2 * i + 1;
			int right = 2 * i + 2;
			int smallest = i;
			if(left < size && data[left] < data[smallest])
				smallest = left;
			if(right < size && data[right] < data[smallest])
				smallest = right;
			if(smallest != i) {
				swap(i, smallest);
				heapify(smallest);
			}
		}

		int peek() {
			return data[0];
		}

		int get() {
			if(size == 0)
				return -1;
			int temp = data[0];
			data[0] = data[--size];
			heapify(0);
			return temp;
		}
	}
}
