package com.examples.helloworld;

class Parent
{
	public static void method()
	{
		System.out.println("Parent Method");
	}
}

class Child extends Parent
{
//	Cannot override static method with instance method
	public static void method()
	{
		System.out.println("Child Method");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		Parent.method();
		Child.method();
	}

}
