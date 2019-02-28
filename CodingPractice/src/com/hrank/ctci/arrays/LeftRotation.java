package com.hrank.ctci.arrays;

import java.util.Scanner;

public class LeftRotation {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i= 0; a_i < n ; a_i++){
        	a[a_i] = in.nextInt();
        }
        rotateArray(a, n,k);
        printArray(a);
		in.close();
    }

	private static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) 
			System.out.print(a[i] + " ");
	}

	private static void rotateArray(int[] a, int n, int d) 
	{
		int i,j,k,temp,gcd = gcd(n,d);
		for(i = 0 ; i < gcd; i++)
		{
			temp = a[i];
			j = i;
			while(1 > 0)
			{
				k = (j + d) >= n? (j + d - n): j + d ;
				if(k == i )
					break;
				a[j] = a[k];
				j = k;
			}
			a[j] = temp;
		}
	}

	private static int gcd(int a, int b) {
		if(b == 0)
			return a;
		return gcd(b, a % b);
	}
}
