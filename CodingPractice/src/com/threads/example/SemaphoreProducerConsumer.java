package com.threads.example;

import java.util.concurrent.Semaphore;

public class SemaphoreProducerConsumer {

	public static void main(String[] args) {
		Semaphore sema1 = new Semaphore(1);
		Semaphore sema2 = new Semaphore(0);
		
		char[] arr = new char[26] ;
		arr[0] = 'a';
		for(int i = 1; i < 26; i++)
			arr[i] = (char) (arr[0] + i);
		new Thread(new EvenPrinter(sema1, sema2, arr), "Thread 1").start();
		new Thread(new OddPrinter(sema2, sema1, arr), "Thread 2").start();
	}

}
class EvenPrinter implements Runnable {
	
	private Semaphore write;
	private char arr[];
	private int start;
	private Semaphore wait;
	
	public EvenPrinter(Semaphore write, Semaphore wait, char[] arr) {
		this.write = write;
		this.arr = arr;
		this.start = 0;
		this.wait = wait;
	}
	
	@Override
	public void run() {
		try {
			while(start < 26) {
				write.acquire();
				System.out.println(arr[start] + " " + Thread.currentThread().getName());
				start += 2;
				wait.release();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}

class OddPrinter implements Runnable {
	
	private Semaphore write;
	private char arr[];
	private int start;
	private Semaphore wait;
	
	public OddPrinter(Semaphore write, Semaphore wait, char[] arr) {
		this.write = write;
		this.arr = arr;
		this.start = 1;
		this.wait = wait;
	}
	
	@Override
	public void run() {
		try {
			while(start < 26) {
				write.acquire();
				System.out.println(arr[start] + " " + Thread.currentThread().getName());
				start += 2;
				wait.release();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}