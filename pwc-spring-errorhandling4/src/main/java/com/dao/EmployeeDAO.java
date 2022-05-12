package com.dao;

import org.springframework.stereotype.Service;

import com.model.Employee;
import com.model.Employees;
@Service
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
