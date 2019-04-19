package com.moveinsync.stage2.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.moveinsync.stage2.dao.EmployeeDAO;
import com.moveinsync.stage2.model.Customer;
import com.moveinsync.stage2.model.Director;
import com.moveinsync.stage2.model.Employee;
import com.moveinsync.stage2.model.Manager;
import com.moveinsync.stage2.model.Respondent;

public class CallDispatcher {

	private static EmployeeDAO employeeDAO = new EmployeeDAO();
	private static ExecutorService employeeExecutor = Executors.newFixedThreadPool(10);
	
	static {
		employeeDAO.addEmployee(new Respondent("Repondent 1"));
		employeeDAO.addEmployee(new Manager("Manager 2"));
		employeeDAO.addEmployee(new Manager("Manager 3"));
		employeeDAO.addEmployee(new Director("Director 1"));
		employeeDAO.addEmployee(new Manager("Manager 1"));
		employeeDAO.addEmployee(new Respondent("Repondent 2"));
		employeeDAO.addEmployee(new Director("Director 2"));
		employeeDAO.addEmployee(new Respondent("Repondent 3"));
		employeeDAO.addEmployee(new Respondent("Repondent 4"));
	}
	
	public static void dispatchCall(Customer customer) {
		
		Employee employee = employeeDAO.getFirstFreeEmployee();
		
		if(employee == null)
			System.out.println("No representative available. Please try later");
		else
			employeeExecutor.submit(() -> employee.takeCall(customer));
	}

	public static void markAvailable(Employee employee) {
		employeeDAO.addLastFreeEmployee(employee);
	}
	
}
