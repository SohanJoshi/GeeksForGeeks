package com.codechef.mar18;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MixColor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T -- > 0) {
			int n = in.nextInt();
			Set<Integer> set = new HashSet<>();
			
			for(int i = 0; i < n; i++) {
				int value = in.nextInt();
				set.add(value);
			}
			
			System.out.println(n - set.size());
			
		}
		in.close();
	}

}
