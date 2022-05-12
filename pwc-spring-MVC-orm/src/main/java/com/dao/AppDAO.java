package com.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Registration;
@Repository
public interface AppDAO extends CrudRepository<Registration,Integer>{

	//Optional findById(String id);

}
