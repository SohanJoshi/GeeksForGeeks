package com.medium;

import java.util.ArrayList;

import com.practice.util.Tree;

public class SerializeNDeserialize {

	public String serialize(Tree root,ArrayList<Integer> aa) {
		int size = (int)Math.pow(2, height(root)) - 1;
		for(int i = 0; i < size; i++)
			aa.add(-1);
		preorderArrayFill(root, aa, 0);
		
		StringBuffer serializedData = new StringBuffer();
		
		for(Integer a : aa)
			if(a == -1)
				serializedData.append("_ ");
			else
				serializedData.append(a + " ");
		return serializedData.toString();
	}
	private void preorderArrayFill(Tree root, ArrayList<Integer> aa, int index) {
		if(root != null) {
			aa.set(index, root.data);
			preorderArrayFill(root.left, aa, left(index));
			preorderArrayFill(root.right, aa, right(index));
		}
		
	}
	public Tree deSerialize(String data) {
		String elements[] = data.split("\\s+");
		Tree root = null;
		root = preorderTreeFill(elements, 0);
		return root;
	}

	private Tree preorderTreeFill(String[] elements, int index) {
		if(index >= elements.length || elements[index].equals("_"))
			return null;
		Tree root = new Tree(Integer.valueOf(elements[index]));
		root.left = preorderTreeFill(elements, left(index));
		root.right = preorderTreeFill(elements, right(index));
		return root;
	}
	private int left(int i) {
		return i * 2 + 1;
	}
	
	private int right(int i) {
		return i * 2 + 2;
	}
	
	private int height(Tree root) {
		if(root == null)
			return 0;
		return Math.max(height(root.left), height(root.right)) + 1;
	}
}
