package com.codechef.mar18;

import java.util.Scanner;

public class BigSale {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T -- > 0) {
			int n = in.nextInt();
			double totalLoss = 0.0;
			
			for(int i = 0; i < n; i++) {
				int price = in.nextInt();
				int quatity = in.nextInt();
				int discount = in.nextInt();
				
				double priceAfterIncrease = price + ((double)(discount * price) / 100);
				double priceAfterDiscount = priceAfterIncrease - ((double)(discount * priceAfterIncrease) / 100);
				
				totalLoss += (price - priceAfterDiscount) * quatity;
				
			}
			
			System.out.println(totalLoss);
		}
		in.close();
	}

}
