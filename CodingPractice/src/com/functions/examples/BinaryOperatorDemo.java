package com.functions.examples;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {
		BinaryOperator<Integer> operator = BinaryOperator.maxBy(Comparator.naturalOrder());
		System.out.println(operator.apply(45, 63));
	}

}
