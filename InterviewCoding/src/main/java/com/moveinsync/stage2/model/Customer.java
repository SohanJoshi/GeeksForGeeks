package com.moveinsync.stage2.model;

public class Customer {

	private String name ;
	
	public Customer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private boolean queryClarified;

	public boolean isQueryClarified() {
		return queryClarified;
	}

	public void setQueryClarified(boolean queryClarified) {
		this.queryClarified = queryClarified;
	}

}
