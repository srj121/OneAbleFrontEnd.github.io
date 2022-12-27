package com.time.main.serviceDAO;

import java.util.List;

import com.time.main.entity.User;


public interface UserServiceDAO {


	public abstract List<User> getAll();
	public User save(User user);
	public User update(User user,int id);
}
