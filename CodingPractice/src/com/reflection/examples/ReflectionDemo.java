package com.reflection.examples;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> clazz = Demo.class;
		Method fields[] = clazz.getDeclaredMethods();
		for (Method field: fields) {
			System.out.println(field.getModifiers());
			System.out.println(field);
		}
	}

}

abstract class Demo {
	private int i;
	protected String j;
	int k;
	public String l;
	abstract void method();
	private void meht() {
		
	}
}