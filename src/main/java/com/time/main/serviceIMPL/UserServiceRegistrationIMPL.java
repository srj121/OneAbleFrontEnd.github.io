package com.time.main.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.time.main.entity.UserRegistration;
import com.time.main.repository.UserRegistrationRepository;
import com.time.main.serviceDAO.UserServiceRegistrationDAO;

@Service
public class UserServiceRegistrationIMPL implements UserServiceRegistrationDAO {

	@Autowired
	UserRegistrationRepository reporegi;

	// for getting all the user information
	public List<UserRegistration> getAll() {
		return reporegi.find();

	}

	// setting the user name password for users
	public UserRegistration save(UserRegistration userRegi) {

		userRegi.setUserName(userRegi.getUserName());
		userRegi.setPassWord(userRegi.getPassWord());

	
		return reporegi.save(userRegi);

	}


}
