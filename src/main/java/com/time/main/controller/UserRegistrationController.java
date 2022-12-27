package com.time.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.time.main.entity.UserRegistration;
import com.time.main.serviceIMPL.UserServiceRegistrationIMPL;

@Controller
@RestController
@RequestMapping("/main") // MUST USE REQUEST MAPPING
public class UserRegistrationController {
	@Autowired
	UserServiceRegistrationIMPL serimpl;

	// for getting the list of registered users
	@GetMapping("/info")
	public List<UserRegistration> getALL() {
		return serimpl.getAll();
	}

}
