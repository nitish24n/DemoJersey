package com.myCode.DemoJersey.database;

import java.util.HashMap;
import java.util.Map;

import com.myCode.DemoJersey.model.Employee;

public class DatabaseClass {
	
	private static Map<Integer,Employee> employees = new HashMap<>();
	
	public static Map<Integer,Employee> getAllEmployees(){
		return employees;
	}

}
