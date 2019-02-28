package com.codechef.mar18;

import java.util.Scanner;

public class ChefGlove {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		while(T -- > 0) {
			int n = in.nextInt();
			int fingers[] = new int[n];
			int sheath[] = new int[n];
			
			String front = "front";
			String back = "back";
			String both = "both";
			String none = "none";
			
			for (int i = 0; i < n ; i++)
				fingers[i] = in.nextInt();
			
			for (int i = 0; i < n ; i++) 
				sheath[i] = in.nextInt();
			
			for (int i = 0 ; i < n; i++) {
				if(fingers[i] > sheath[i])
					front = "";
				if(fingers[n - i - 1] > sheath[i])
					back = "";
			}
			
			if(front.isEmpty() && back.isEmpty())
				System.out.println(none);
			else if(front.isEmpty())
				System.out.println(back);
			else if(back.isEmpty())
				System.out.println(front);
			else //both are not empty
				System.out.println(both);
		}
		
		in.close();
	}

}
