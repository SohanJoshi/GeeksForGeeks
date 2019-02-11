package com.easy.strings;

import java.util.HashMap;
import java.util.Scanner;

public class RomanNumbers {

	private static HashMap<Character, Integer> romanMap = new HashMap<>();
	
	static { 
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		while(T-- > 0) {
			String roman = in.next();
			char arr[] = roman.toCharArray();
			int n = arr.length;
			int number = 0;
			
			int i = 0;
			while(i < n) {
				if(arr[i] == 'M')
					number += 1000;
				else if(i == n -1)
					number += romanMap.get(arr[i]);
				else {
					if(romanMap.get(arr[i]) < romanMap.get(arr[i + 1])) {
						number += romanMap.get(arr[i + 1]) - romanMap.get(arr[i]);
						i ++;
					}
					else if(romanMap.get(arr[i]) == romanMap.get(arr[i + 1])) {
						number += 2 * romanMap.get(arr[i]);
						i ++;
					}
					else
						number += romanMap.get(arr[i]);
				}
				i++;
			}
			System.out.println(number);
		}
		in.close();
	}

}
