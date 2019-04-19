package com.moveinsync.stage2.model;

public class Manager extends AbstractEmployee {
	public Manager(String name) {
		super(name, EmployeeType.MANAGER);
	}

	@Override
	public void takeCall(Customer customer) {
		while(!customer.isQueryClarified()) {
			System.out.println("Manager : " + name + " taking call from customer : " + customer.getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Manager : " + name + " done taking call from customer : " + customer.getName());
		setLastCallDropTime(System.currentTimeMillis());
	}

}
