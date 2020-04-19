package com.easy;

public class MyHashSet_705 {
    private int tableSize = 16;
    private int capacity = tableSize * 4;
    private int size = 0;
    private int[] bucketSize;

    private Node[] table;

    /** Initialize your data structure here. */
    public MyHashSet_705() {
        bucketSize = new int[tableSize];
        table = new Node[tableSize];
    }

    public void add(int key) {
        int bucket = hash(key);
        if(size == capacity) {
            rehashUp();
            bucket = hash(key);
        }
        Node node = table[bucket];
        if(node == null) {
            table[bucket] = new Node(key);
        }
        else
        {
            Node pre = node;
            while(node != null) {
                if (node.value == key)
                    return;
                else {
                    pre = node;
                    node = node.next;
                }
            }
            pre.next = new Node(key);
        }
        size ++;
        bucketSize[bucket] ++;
    }

    private void rehashUp() {
        tableSize = tableSize * 2;
        capacity = tableSize * 4;
        Node[] temp = table;

        table = new Node[tableSize];
        bucketSize = new int[tableSize];
        size = 0;

        for(Node node : temp)
            while(node != null) {
                add(node.value);
                node = node.next;
            }
    }

    private void rehashDown() {
        tableSize = tableSize / 2;
        capacity = tableSize / 4;
        Node[] temp = table;

        table = new Node[tableSize];
        bucketSize = new int[tableSize];
        size = 0;

        for(Node node : temp)
            while(node != null) {
                add(node.value);
                node = node.next;
            }
    }

    public void remove(int key) {
        int bucket = hash(key);
        if(size == capacity / 2) {
            rehashDown();
            bucket = hash(key);
        }
        Node node = table[bucket];
        if(node == null)
            return;
        if(node.value == key) {
            table[bucket] = node.next;
        }
        else
        {
            Node pre = node;
            while(node != null && node.value != key) {
                pre = node;
                node = node.next;
            }
            if (node == null)
                return;
            pre.next = node.next;
        }
        size --;
        bucketSize[bucket] --;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int bucket = hash(key);
        Node node = table[bucket];
        while(node != null) {
            if(node.value == key)
                return true;
            node = node.next;
        }
        return false;
    }

    private int hash(int value) {
        return (value * 819) % tableSize;
    }

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
