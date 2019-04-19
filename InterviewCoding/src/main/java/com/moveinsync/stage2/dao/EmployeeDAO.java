package com.moveinsync.stage2.dao;

import com.moveinsync.stage2.model.Employee;

public class EmployeeDAO {

	private static final EmployeeQueue employeeQueue = new EmployeeQueue();

	public Employee getFirstFreeEmployee() {
		return employeeQueue.getFirstFreeEmployee();
	}
	
	public void removeEmployee(Employee employee) {
		employeeQueue.removeEmployee(employee);
	}
	
	public void addLastFreeEmployee(Employee employee) {
		employeeQueue.addEmployee(employee);
	}
	
	public void addEmployee(Employee employee) {
		employeeQueue.addEmployee(employee);
	}
}
