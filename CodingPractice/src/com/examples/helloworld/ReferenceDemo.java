package com.examples.helloworld;

public class ReferenceDemo {

	public static void main(String[] args) {
		String str = null;
		method(str);
		System.out.println(str);
	}

	private static void method(String str) {
		str = "hello";
	}
}
