package com.hrank.ctci.tries;

import java.util.HashMap;
import java.util.Scanner;

public class Contacts {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Trie trie = new Trie();
        
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            switch(op)
            {
            	case "add" : trie.addContact(contact);
            				break;
            	case "find" : System.out.println(trie.findPartial(contact));
            				break;
            	default : System.out.println("Invalid Input");
            }
        }
        in.close();
    }
}

class Trie
{
	Node root;
	class Node{
		HashMap<Character, Node> children ;
		boolean isCompleteContact ;
		int prefixForContact = 0;
		Node()
		{
			children = new HashMap<>(); isCompleteContact = false;
		}
	}
	
	Trie ()
	{
		root = new Node();
	}
	
	public int findPartial(String contact) {
		Node node = root;

		for(Character c : contact.toCharArray())
		{
			node = node.children.get(c);
			if(node == null)
				return 0;
		}
		
		return node.prefixForContact;
	}

	public void addContact(String contact)
	{
		Node node = root;
		for(Character c : contact.toCharArray())
		{
			if(node.children.get(c) == null)
				node.children.put(c, new Node());
			node = node.children.get(c);
			node.prefixForContact ++;
		}
		node.isCompleteContact = true;
	}
	
}
