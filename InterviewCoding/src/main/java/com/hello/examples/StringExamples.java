package com.hello.examples;

public class StringExamples {

	public static void main(String[] args) {
		String str = "a b c  d e f";
		String arr[] = str.split("\\s+");
		for(String s : arr)
			System.out.println("'" +s +  "'");
	}
	
}
