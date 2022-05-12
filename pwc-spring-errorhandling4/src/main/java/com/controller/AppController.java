package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.dao.EmployeeDAO;
import com.model.Employee;
import com.model.Employees;

import io.swagger.annotations.ApiOperation;
@RestController
public class AppController {
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@GetMapping("/loadall")
	@ApiOperation(value="load all users from backend",
	notes="basically loads stored from mysql database",response=Employee.class
			)
	public Employees loadAll(
			@RequestHeader(name="X-COM_PERSIST",required=true)String header,
			@RequestHeader(name="X-COM-LOCATION",defaultValue="ASIA")String loc
			) {
		return employeeDAO.getAllEmpList();
	}
	@PostMapping("/adduser")
	public ResponseEntity<Object> adduser(@RequestBody Employee emp){
		int id=employeeDAO.getAllEmpList().getEmpList().size()+1;
		emp.setEmpId(id);
		employeeDAO.addEmployees(emp);
		return ResponseEntity.ok("Emp Added");
	}
}
