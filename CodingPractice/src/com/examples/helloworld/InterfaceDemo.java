package com.examples.helloworld;

interface A {
	int i = 10;
}

interface B {
	int i = 10;
}

class C implements A{
	
}
public class InterfaceDemo implements A ,B{
	private static final void main(String args[]) {
//		System.out.println(new InterfaceDemo().i);	
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}

abstract class abs {
	protected abstract void doSomething();
	abstract void doAgainSomething();
	//private abstract void doSomethingMore();
}
