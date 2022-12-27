package com.time.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.time.main.entity.User;

@Repository
public class User_Repository {

	@Autowired
	MongoTemplate mongotemp;

	public List<User> find() {
		return mongotemp.findAll(User.class);
	}

	public User save(User user) {

		return mongotemp.save(user);
	}

	public User update(User user) {

		return mongotemp.save(user);
	}

	public User getuserbyid(int userid) {
	
		return mongotemp.findById(userid, User.class);

	}
}
