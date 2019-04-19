package com.code.apr18;

import java.util.Scanner;

public class ChefWorker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cost[] = new int[n];
		for(int i = 0; i < n; i++) {
			cost[i] = sc.nextInt();
		}
		
		int min_auth = Integer.MAX_VALUE;
		int min_tran = Integer.MAX_VALUE;
		int min_tran_auth = Integer.MAX_VALUE;
		
		for(int i = 0; i < n; i++) {
			int type = sc.nextInt();
			if(type == 2 && cost[i] < min_auth)
				min_auth = cost[i];
			else if(type == 1 && cost[i] < min_tran)
				min_tran = cost[i];
			else if( type == 3 && cost[i] < min_tran_auth)
				min_tran_auth = cost[i];
		}
		
		System.out.println(Math.min(min_tran_auth, min_auth + min_tran));
		
		sc.close();
	}

}
