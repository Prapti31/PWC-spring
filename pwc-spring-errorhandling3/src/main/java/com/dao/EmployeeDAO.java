package com.dao;

import com.model.Employee;
import com.model.Employees;

public class EmployeeDAO {
	private static Employees list=new Employees();
	
	static {
		list.getEmpList().add(new Employee(1,"admin","manager","admin@mail.com"));
		list.getEmpList().add(new Employee(2,"QA","Testing","QA@mail.com"));
	}
	public Employees getAllEmpList() {
		return list;
	}
	public void addEmployees(Employee employee) {
		list.getEmpList().add(employee);
	}
}
