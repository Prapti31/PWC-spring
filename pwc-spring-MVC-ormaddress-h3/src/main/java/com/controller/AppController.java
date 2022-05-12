package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Address;
//import com.model.Student;
import com.service.AppService;

@RestController
@RequestMapping("/mainapp")
public class AppController {
	
	@Autowired
	private AppService service;
	@GetMapping("/loadaddress")
	public List <Address> sayHello(){
		List<Address> lst=service.loadAll();
		return lst;
	}
	
	/*@RequestMapping(value="/welcome",method=RequestMethod.GET)

	public String sayHello() {
		return "Welcome to Spring MVC";
	}*/
	
	//@RequestMapping(value="/login",method=RequestMethod.POST)
	
	
	
	//@RequestMapping(value="/registration",method=RequestMethod.GET)
	
	
	//@RequestMapping(value="/register",method = RequestMethod.POST)
	@PostMapping("/addaddress")
	public String register(@RequestBody Address reg) {
		service.addUser(reg);
		return "Student added";
	}
	@GetMapping("/findaddress/{uid}")
	public String findUser(@PathVariable("uid")int uid) {
		if(service.findUser(uid)) {
			return uid+" found";
		}
		return uid+" not found";
	}
	@DeleteMapping("/deleteaddress/{uid}")
	public String deleteUser(@PathVariable("uid")int uid) {
		if(service.deleteUser(uid)) {
			return uid+" deleted";
		}
		return uid+" not deleted";
	}
	@PutMapping("/updateaddress/{uid}")
	public String updateUser(@RequestBody Address reg, @PathVariable("uid") int uid) {
		if(service.updateUser(reg, uid))
			return uid+" updated";
		else 
			return uid+" not updated";
		
	}
}