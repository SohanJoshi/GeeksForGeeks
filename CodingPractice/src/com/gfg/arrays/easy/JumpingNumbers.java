package com.gfg.arrays.easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JumpingNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T-- > 0) {
			int n = in.nextInt();
			List<Integer> list = new LinkedList<>();
			list.add(0);
			for(int i = 1; i <= n && i < 10 ; i++) {
				list.add(i);
				int count = list.size() - 1;
				int x = i;
				while(x <= n){
					x = list.get(count);
					int lastDigit = x % 10;
					int adjDecr = x * 10  + (lastDigit - 1);
					int adjInc = x * 10  + (lastDigit + 1);
					
					if(adjDecr > n && adjInc > n)
						break;
					
					if(lastDigit > 0  && adjDecr <= n)
						list.add(adjDecr);
					if(lastDigit < 9 && adjInc <= n)
						list.add(adjInc);
					count++;
				}
			}

			for(int i : list)
				System.out.print(i + " ");
			
			System.out.println();
		}
		in.close();
	}
}
