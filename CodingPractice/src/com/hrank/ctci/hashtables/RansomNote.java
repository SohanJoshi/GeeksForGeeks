package com.hrank.ctci.hashtables;

import java.util.Scanner;

public class RansomNote {

	static class Node {
		String data;
		Node next;
		Node(String data){
			this.data = data; next = null;
		}
		@Override
		public String toString() {
			return data + " " + next;
		}
	}

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		String magazine[] = new String[m];
		for(int magazine_i=0; magazine_i < m; magazine_i++){
			magazine[magazine_i] = in.next();
		}
		String ransom[] = new String[n];
		for(int ransom_i=0; ransom_i < n; ransom_i++){
			ransom[ransom_i] = in.next();
		}
		in.close();

		Node nodes[] = new Node[m];
		String result = "Yes";

		for(int i = 0 ; i < m ; i++)
			addToHashTable(nodes, magazine[i]);
		for(int i = 0 ; i < n ; i++)
			if( !hashTableContainsThenRemove(nodes, ransom[i])) {
				result = "No";
				break;
			}
		System.out.println(result);
	}

	private static boolean hashTableContainsThenRemove(Node[] nodes, String string) {
		int index = hash(string.hashCode(), nodes.length);
		Node temp = nodes[index];
		while(temp != null)
			if(temp.data.equals(string)) {
				removeFromHashTable(nodes, index, temp);
				return true;
			}else {
				temp = temp.next;
			}
		return false;
	}

	private static void removeFromHashTable(Node[] nodes, int index, Node temp) {
		if(nodes[index] == temp)
			nodes[index] = temp.next;
		else {
			Node pre = nodes[index];
			while(pre.next != temp)
				pre = pre.next;
			pre.next = temp.next;
		}
	}

	private static void addToHashTable(Node[] nodes, String string) {
		Node node = new Node(string);
		int index = hash(string.hashCode() , nodes.length);
		if(nodes[index] == null)
			nodes[index] = node;
		else
		{
			node.next = nodes[index];
			nodes[index] = node;
		}
	}

	private static int hash(int code, int n) {
		return Math.abs(code % n);
	}

}
