package com.threads.example;

public class PrintAlternateCharacter {

	public static void main(String[] args) {
		Shared s = new Shared();
		new Thread(new EvenCharPrinter(s), "Thread 1").start();
		new Thread(new OddCharPrinter(s), "Thread 2").start();
	}

}

class EvenCharPrinter implements Runnable {
	private Shared s;
	EvenCharPrinter(Shared s){
		this.s = s;
	}

	@Override
	public void run() {
		for(int i = 0; i < 26 ; i+=2)
			s.printEven(i);
	}
}

class OddCharPrinter implements Runnable {
	private Shared s;
	OddCharPrinter(Shared s){
		this.s = s;
	}

	@Override
	public void run() {
		for(int i = 1; i < 26 ; i+=2)
			s.printOdd(i);
	}
}

class Shared {
	char arr[] = new char[26];
	private boolean evenFlag;
	Shared() {
		arr[0] = 'a';
		for( int i = 0 ; i < 26; i++)
			arr[i] = (char) (arr[0] + i);
	}

	public void printEven(int i) {
		synchronized(this) {
			while(evenFlag)
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.print(arr[i] + " " + Thread.currentThread().getName() + "\t");
			evenFlag = true;
			notify();
		}

	}
	
	public void printOdd(int i) {
		synchronized(this) {
			while(!evenFlag)
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println(arr[i] + " " + Thread.currentThread().getName());
			evenFlag = false;
			notify();
		}

	}

}
