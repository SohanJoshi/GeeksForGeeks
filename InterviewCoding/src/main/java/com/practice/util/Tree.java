package com.practice.util;

public class Tree {
	public int key;
    public Tree left, right;
	public int data;
    public Tree(int key)
    {
        this.key = key;
        this.data = key;
        left = right = null;
    }
}
