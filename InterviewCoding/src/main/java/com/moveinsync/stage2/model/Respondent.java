package com.moveinsync.stage2.model;

import com.moveinsync.stage2.main.CallDispatcher;

public class Respondent extends AbstractEmployee {

	
	public Respondent(String name) {
		super(name, EmployeeType.RESPONDENT);
	}

	@Override
	public void takeCall(Customer customer) {
		while(!customer.isQueryClarified()) {
			System.out.println("Respondent : " + name + " taking call from customer : " + customer.getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Respondent : " + name + " done taking call from customer : " + customer.getName());
		setLastCallDropTime(System.currentTimeMillis());
		CallDispatcher.markAvailable(this);
	}

}
