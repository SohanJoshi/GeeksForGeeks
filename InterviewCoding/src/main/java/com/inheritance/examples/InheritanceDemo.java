package com.inheritance.examples;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		a.method();
		a = new B();
		b.method();
		a.method();
		A.method();
		B.method();
	}

}

class A {
	static void method() {
		System.out.println("A's method");
	}
}

class B extends A {
	static void method() {
		System.out.println("B's method");
	}
}