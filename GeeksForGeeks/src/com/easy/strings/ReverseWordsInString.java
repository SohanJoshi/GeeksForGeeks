package com.easy.strings;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		while (T-- > 0) {
			String str = in.next();
			String words[] = str.split("\\.");
			for(int i = 0; i < words.length / 2; i++) {
				String temp = words[i];
				words[i] = words[words.length - i - 1];
				words[words.length - i - 1] = temp;
			}
			str = String.join(".", words);
			System.out.println(str);
		}
		in.close();
	}

}
