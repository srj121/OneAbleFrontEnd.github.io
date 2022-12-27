package com.time.main.serviceDAO;

import java.util.List;

import com.time.main.entity.User;
import com.time.main.entity.UserRegistration;


public interface UserServiceRegistrationDAO {


	public abstract List<UserRegistration> getAll();

	public UserRegistration save(UserRegistration userRegi);
}
