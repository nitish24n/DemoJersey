package com.myCode.DemoJersey.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.myCode.DemoJersey.database.DatabaseClass;
import com.myCode.DemoJersey.model.Employee;

public class EmployeeService {
	private Map<Integer,Employee> employees = DatabaseClass.getAllEmployees();
	/*
	public List<Employee> getAllEmployees(){
		Employee e1 = new Employee("Nitish", "Pandey", 1);
		Employee e2 = new Employee("Hithesth", "hoooma", 2);
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		return list;	
	}
	*/
	
	public EmployeeService() {
		employees.put(1,new Employee("Nitish", "Pandey",1));
		employees.put(2,new Employee("Kamlesh", "Hulkk",2));
	}
	
	//Passing a collection to a arraylist constructor initialises the list with those elements
	public List<Employee> getAllEmployees(){
		return new ArrayList<Employee>(employees.values());	
	}
	
	public Employee getEmployee(int id) {
		return employees.get(id);
	}
	
	public Employee addEmployee(Employee emp) {
		emp.setId(emp.getFirstName().length());
		employees.put(emp.getId(), emp);
		return emp;
	}
	
	public Employee updateEmployee(Employee emp) {
		if(emp.getId() <= 0)
			return null;
	
		employees.put(emp.getId(),emp);
		return emp;
	}
	
	public Employee removeEmployee(int id) {
		return employees.remove(id);
	}
}
