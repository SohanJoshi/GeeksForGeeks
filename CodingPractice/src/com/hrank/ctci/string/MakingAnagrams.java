package com.hrank.ctci.string;

import java.util.Scanner;

public class MakingAnagrams {

	private static final int NUMBER_OF_CHARS = 26;

	public static int numberNeeded(String first, String second) {
	    char firstArr[] = first.toCharArray();
	    char secondArr[] = second.toCharArray();
	    
	    int firstCharsCount[] = getCharCount(firstArr);
	    int secondCharsCount[] = getCharCount(secondArr);
	    	    
	    int delta = getDeltaCount(firstCharsCount, secondCharsCount);
	    
		return delta;
	}
  
    private static int getDeltaCount(int[] arr1, int[] arr2) {
    	assert arr1.length == arr2.length;
    	int delta = 0;
    	for(int i = 0 ; i < NUMBER_OF_CHARS ; i ++)
    		delta += (Math.abs(arr1[i] - arr2[i]));
		return delta;
	}

	private static int[] getCharCount(char[] arr) {
    	int charCount[] = new int[NUMBER_OF_CHARS];
    	
    	for(char c : arr) {
    		char offset = 'a';
    		int index = c - offset;
    		charCount[index] ++;
    	}
    	
		return charCount;
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
        in.close();
    }
}
