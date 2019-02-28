package com.functions.examples;

import java.util.function.Predicate;

public class LambdaDemo {
	public static void main(String[] args) {
		Runnable runnable = () -> {System.out.println("In Thread");
									System.out.println("halfkjdvbhfsalk");};
		
		Thread t = new Thread(runnable);
		t.start();
		
		Predicate<String> pre = (str) -> str.isEmpty();
		
		
	}
}

