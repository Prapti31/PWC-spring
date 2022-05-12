package com.controller;

import org.springframework.stereotype.Service;
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



import java.util.List;

@RestController

public class AppController {
	
	//@RequestMapping(value= "/welcome",method=RequestMethod.GET)
	@GetMapping("/mainapp/loaduserfromapp")
	public String loadUsers() {
		return "user loaded";
	}
	@GetMapping("/user/loaduserfromapp")
	public String showUsers() {
		return "users are called";
	}
	
}
