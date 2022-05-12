package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AppDAO;

import com.model.Student;

@Service
public class AppService {
	@Autowired
	private AppDAO appDAO;
	
	List<Student> lst = new ArrayList<Student>();
	
	
	
	public void addUser(Student stu) {
		//lst.add(reg);
		appDAO.save(stu);
		System.out.println(lst);
	}
	
	public List<Student> loadAll(){
		List<Student> lst=(List<Student>)appDAO.findAll();
		return lst;
	}
	/*public boolean findUser(String name) {
		for(Registration rs:lst) {
			if(rs.getUsername().equals(name)) {
				System.out.println(rs.getEmail());
				return true;
			}
		}
		return false;
	}*/
	public boolean findUser(int rollno) {
		Optional opt=appDAO.findById(rollno);
		if(opt.isPresent()) {
			return true;
		}
		return false;
		
	}
	public boolean deleteUser(int id) {
		Optional opt=appDAO.findById(id);
		if(opt.isPresent()) {
			appDAO.deleteById(id);
			return true;
		}
		return false;
		/*for(Registration rs:lst) {
		if(rs.getUsername().equals(name)) {
			lst.remove(rs);
			return true;
		}
	}*/
	}
	public boolean updateUser(Student reg,int id) {
		/*int i=0;
		for(Registration rs:lst)
		{
			if(rs.getUsername().equals(name)) {
				lst.set(i,reg);
				return true;
		}
			i++;
	}
		return false;
	}*/
		Optional opt=appDAO.findById(id);
		if(opt.isPresent()) {
			appDAO.deleteById(id);
			appDAO.save(reg);
			return true;
		}
		return false;
	}
}
