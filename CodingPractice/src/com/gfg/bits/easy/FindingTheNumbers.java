package com.gfg.bits.easy;

import java.util.Scanner;

public class FindingTheNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while( T-- > 0) {
			int n = in.nextInt();
			int size = 2 * n + 2;
			int arr[] = new int[size];
			for(int i = 0; i < size; i++) 
				arr[i] = in.nextInt();
			int xor = arr[0];
			for(int i = 1; i < size; i++) 
				xor ^= arr[i];
			
			int rightBitSet = (xor) & ~(xor - 1);
			int x = 0, y = 0;
			for(int i = 0; i < size ; i++) {
				if((rightBitSet & arr[i]) == 0)
					x ^= arr[i];
				else
					y ^= arr[i];
			}
			if(x < y)
				System.out.println(x + " " + y);
			else
				System.out.println(y + " " + x);
		}
		in.close();

	}

}
