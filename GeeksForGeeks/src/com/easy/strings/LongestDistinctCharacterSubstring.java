package com.easy.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestDistinctCharacterSubstring {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T-- > 0) {
			String str = in.next();
			str = str.trim();
			
			char arr[] = str.toCharArray();
			int n = arr.length;
			
			Map<Character, Integer> map = new HashMap<>();
			int maxLength = 0;
			int start = 0;
			
			for(int i = 0; i < n; i++) {
				Integer index = map.put(arr[i], i);
				if(index != null) {
					if(maxLength < map.size())
						maxLength = map.size();
					for(char c : str.substring(start, index).toCharArray())
						map.remove(c);
					start = index + 1;
				}
			}
			if(maxLength < map.size())
				maxLength = map.size();
			System.out.println(maxLength);
		}
		in.close();
	}

}
