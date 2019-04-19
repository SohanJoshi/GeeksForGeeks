package com.moveinsync.stage2.dao;

import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;

import com.moveinsync.stage2.model.Employee;

public class EmployeeQueue {
private final Object dummy = new Object();
	
	private Map<Employee, Object> employees = new ConcurrentHashMap<>();
	
	private BlockingQueue<Employee> availableEmployees = new PriorityBlockingQueue<>(20, getComparator());

	private Map<Employee, Object> waitingForRemoval = new ConcurrentHashMap<>();

	private Comparator<Employee> getComparator() {
		return (e1, e2) -> {
			int employeeTypeComparison = e1.getEmployeeType().compareTo(e2.getEmployeeType());
			if(employeeTypeComparison != 0)
				return employeeTypeComparison;
			return Long.compare(e1.lastCallDropTime(), e1.lastCallDropTime());
		};
	}
	
	public void addEmployee(Employee employee) {
		employees.put(employee, dummy);
		availableEmployees.offer(employee);
	}
	
	public void removeEmployee(Employee employee) {
		if(employees.remove(employee) != null && !availableEmployees.remove(employee))
			waitingForRemoval.put(employee,  dummy);
	}
	
	public Employee getFirstFreeEmployee() {
		try {
			return availableEmployees.take();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void addLastFreeEmployee(Employee employee) {
		if(waitingForRemoval.remove(employee) == null)
			try {
				availableEmployees.put(employee);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
