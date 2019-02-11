package com.easy.maths;

import java.util.Scanner;

public class FindingPosition {

	public static void main(String[] args) {
		Scanner	in = new Scanner(System.in);
		int T = in.nextInt();
		while(T -- >0) {
			int n = in.nextInt();
			int x = 1;
			int res = 0;
			while(x <= n) {
				if((x & n) != 0)
					res = x;
				x = x << 1;
			}
			System.out.println(res);
		}
		in.close();
	}

}
