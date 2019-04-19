package com.moveinsync.stage2.main;

import com.moveinsync.stage2.model.Customer;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		
		Customer customer1 = new Customer("Customer 1");
		Customer customer2 = new Customer("Customer 2");
		Customer customer3 = new Customer("Customer 3");
		Customer customer4 = new Customer("Customer 4");
		Customer customer5 = new Customer("Customer 5");
		
		CallDispatcher.dispatchCall(customer1);
		
		Thread.sleep(1000);
		
		CallDispatcher.dispatchCall(customer2);
		
		Thread.sleep(1000);
		
		customer1.setQueryClarified(true);
		
		CallDispatcher.dispatchCall(customer3);
		
		Thread.sleep(1000);
		
		CallDispatcher.dispatchCall(customer4);
		
		Thread.sleep(1000);
		
		CallDispatcher.dispatchCall(customer5);
		
		
		customer2.setQueryClarified(true);
		customer3.setQueryClarified(true);
		customer4.setQueryClarified(true);
		customer5.setQueryClarified(true);
		
	}

}
