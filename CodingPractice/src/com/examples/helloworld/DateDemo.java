package com.examples.helloworld;

import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Date());
		Calendar cal = Calendar.getInstance();
		cal.set(2018, 0, 19);
		System.out.println(cal);
	}

}
