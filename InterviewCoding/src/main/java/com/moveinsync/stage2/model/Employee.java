package com.moveinsync.stage2.model;

public interface Employee {

	EmployeeType getEmployeeType();
	
	void takeCall(Customer customer);

	long lastCallDropTime();
	
}
