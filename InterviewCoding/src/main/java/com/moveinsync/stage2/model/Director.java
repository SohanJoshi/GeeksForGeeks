package com.moveinsync.stage2.model;

public class Director extends AbstractEmployee {
	public Director(String name) {
		super(name, EmployeeType.DIRECTOR);
	}

	@Override
	public void takeCall(Customer customer) {
		while(!customer.isQueryClarified()) {
			System.out.println("Director : " + name + " taking call from customer : " + customer.getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Director : " + name + " done taking call from customer : " + customer.getName());
		setLastCallDropTime(System.currentTimeMillis());
	}

}
