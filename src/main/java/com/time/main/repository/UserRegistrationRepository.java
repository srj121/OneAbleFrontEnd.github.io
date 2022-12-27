package com.time.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.time.main.entity.UserRegistration;

@Repository
public class UserRegistrationRepository {

	@Autowired
	MongoTemplate mongotemplate;

	//for finding all the registered users
	public List<UserRegistration> find() {
		return mongotemplate.findAll(UserRegistration.class);
	}

	
	//for storing all the user registration information
	public UserRegistration save(UserRegistration userReg) {

		return mongotemplate.save(userReg);

	}

}
