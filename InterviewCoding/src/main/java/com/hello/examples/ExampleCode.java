package com.hello.examples;

public class ExampleCode {

	public static void main(String[] args) {
		// myMeth(null); // Compiler Error : The method myMeth(String) is ambiguous for the type ExampleCode
		myMeth(new Object());
	}

	private static void myMeth(String str) {
		
	}
/*	
	private static void myMeth(StringBuffer str) {
		
	}*/
	
	private static void myMeth(Object o) {
		System.out.println("Hi");
	}
	
}
