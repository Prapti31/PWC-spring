package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.model.Department;

@RestController
public class DeptController {
	private static Map<String, List<Department>> empDB=new HashMap<String, List<Department>>();
	static List<Department> lst=new ArrayList<Department>();
	static {
		empDB=new HashMap<String,List<Department>>();
		
		Department dept1=new Department("It","Prapti");
		lst.add(dept1);
		dept1=new Department("Finance","vijay");
		lst.add(dept1);
		empDB.put("Wow", lst);
		
		Department dept2=new Department("It","Prapti");
		lst.add(dept1);
		dept2=new Department("Finance","vijay");
		lst.add(dept1);
		empDB.put("Myntra", lst);
		
	}
	@GetMapping("/loaddept/{projectname}")
	public List<Department> loadEmp(@PathVariable("projectname")String projectname){
		List<Department> deptlist=empDB.get(projectname);
		if(deptlist == null) {
			deptlist=new ArrayList<Department>();
			Department emp=new Department("NA","NOT FOUND");
			deptlist.add(emp);
		}
		
		return deptlist;
	}
	
	@GetMapping("/loaddept")
	public List<Department> loaddept(){
		return lst;
	}
}
