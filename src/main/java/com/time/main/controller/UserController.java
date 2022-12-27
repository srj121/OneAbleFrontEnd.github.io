package com.time.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.time.main.entity.User;
import com.time.main.serviceIMPL.UserServiceIMPL;

@RestController
@RequestMapping("/time")
public class UserController {
	@Autowired
	UserServiceIMPL ser;

	// for getting all the given data
	@GetMapping("/gettime")
	public List<User> getALL() {
		return ser.getAll();

	}

	// for psoting new data
	@PostMapping("/posttime")
	public User Save(@RequestBody User user) {

		return ser.save(user);

	}

	// for updating the data and for END TIME
	@PutMapping("/puttime/{id}")
	public User update(@RequestBody User user, @PathVariable int id)  {

		return ser.update(user, id);
	}

}
