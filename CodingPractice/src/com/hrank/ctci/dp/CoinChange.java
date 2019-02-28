package com.hrank.ctci.dp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoinChange {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }
        
        System.out.println(findCombinationsForMoney(coins, n, m));
        
        in.close();
    }

	private static long findCombinationsForMoney(int[] coins, int n, int m) {
		
		return findCombinationForMoneyUtil(coins, n, m, 0, new HashMap<String, Long>());
	}

	private static long findCombinationForMoneyUtil(int[] coins, int money, int m, int index, Map<String,Long> map) {
		if(money <= 0 )
			return 1;
		
		if(index >= m)
			return 0;
		
		String mapKey = getKey(index , money);
		if(map.containsKey(mapKey))
			return map.get(mapKey);	
		
		long ways = 0;
		int amountRemainingInMoney = 0;
		
		while(amountRemainingInMoney <= money) {
			int remaining = money - amountRemainingInMoney;
			ways += findCombinationForMoneyUtil(coins, remaining, m, index + 1, map);
			amountRemainingInMoney += coins[index];
		}
		
		map.put(mapKey, ways);
		return ways;
	}

	private static String getKey(int index, int money) {
		return index + "-" + money;
	}
}
