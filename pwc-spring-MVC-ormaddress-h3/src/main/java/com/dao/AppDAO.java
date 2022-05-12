package com.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Address;
//import com.model.Student;
@Repository
public interface AppDAO extends CrudRepository<Address,Integer>{

	//Optional findById(String id);

}
