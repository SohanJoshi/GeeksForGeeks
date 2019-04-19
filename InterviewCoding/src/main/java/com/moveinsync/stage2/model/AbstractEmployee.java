package com.moveinsync.stage2.model;

public abstract class AbstractEmployee implements Employee {

	protected final EmployeeType employeeType;
	protected String name;
	private long lastCallDropTime = System.currentTimeMillis();
	
	protected long getLastCallDropTime() {
		return lastCallDropTime;
	}

	protected void setLastCallDropTime(long lastCallDropTime) {
		this.lastCallDropTime = lastCallDropTime;
	}

	public AbstractEmployee(String name, EmployeeType employeeType) {
		this.name = name;
		this.employeeType = employeeType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	@Override
	public long lastCallDropTime() {
		return lastCallDropTime;
	}

}
