package com.codechef.feb18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChefChr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-- > 0)
		{
			String str = sc.next();
			Set<Character> completeSet = new HashSet<>(Arrays.asList('c','h','e','f'));
			Set<Character> remainingSet = new HashSet<>();
			char[] string = str.toCharArray();
			int count = 0;
			
			for(int i = 0; i < string.length; i++)
			{
				remainingSet.addAll(completeSet);
				int k = i;
				while( k < string.length && 
						!remainingSet.isEmpty() && 
						remainingSet.remove(string[k]))
				{
					k++;
					if(remainingSet.isEmpty())
						count ++;
				}
			}
			String result = (count == 0) ? "normal":"lovely " + count;
			System.out.println(result);
		}
		sc.close();
	}
}
