package com.medium.queue;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class FirstNonRepeatingCharacterInStream {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		while(T-- > 0 ) {
			int n = in.nextInt();
			Set<Character> set = new HashSet<>();
			Queue<Character> queue = new LinkedList<>();
			in.nextLine();
			String stream = in.nextLine();
			stream = stream.replaceAll("\\s+", "");
			
			for(char c : stream.toCharArray()) {
				if (!set.add(c)) {
					queue.remove(c);
				} 
				else {
					queue.add(c);
				}
				if(queue.isEmpty())
					System.out.print("-1 ");
				else
					System.out.print(queue.peek() + " ");
			}
			
		}
		in.close();
	}
}
