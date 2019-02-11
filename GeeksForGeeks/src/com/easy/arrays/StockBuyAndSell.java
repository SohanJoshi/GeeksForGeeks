package com.easy.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StockBuyAndSell {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T -- > 0) {
			int n = Integer.parseInt(br.readLine());
			String elements[] = br.readLine().split(" ");
			int arr[] = new int[n];
			for(int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(elements[i]);
			
			int buyDay = 0, sellDay = 0;
			
			boolean profitAchieved = false;

			while(sellDay < n) {
				if(sellDay == n - 1) {
					if(arr[buyDay] < arr[sellDay]) {
						profitAchieved = true;
						printProfitDays(buyDay, sellDay);
					}
					break;
				}
				else if(arr[sellDay] < arr[sellDay + 1])
					sellDay ++;
				else if(arr[sellDay] >= arr[sellDay + 1]) {
					if(buyDay != sellDay) {
						profitAchieved = true;
						printProfitDays(buyDay, sellDay);
					}
					buyDay = sellDay + 1;
					sellDay = buyDay;
				}
			}
			if(!profitAchieved)
				System.out.println("No Profit");
			else
				System.out.println();
		}
	}

	private static void printProfitDays(int buyDay, int sellDay) {
		if(buyDay != sellDay)
			System.out.print("(" + buyDay + " " + (sellDay) + ") ");		
	}

}
