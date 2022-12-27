package com.time.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.time.main.entity.User;
import com.time.main.entity.UserRegistration;
import com.time.main.repository.UserRegistrationRepository;
import com.time.main.repository.User_Repository;

import jakarta.servlet.http.HttpSession;

@Controller
public class ControllerHtml {

	@Autowired
	private UserRegistrationRepository repo;

	
	// ........................ Login pages connections...............................

	@RequestMapping("/loginpage")
	public String logindetails() {
		return "index";
	}

	@PostMapping("/loginpage")
	public ModelAndView welcomePage(@ModelAttribute UserRegistration userregi) {

		System.out.println(userregi);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("welcomePage");

		mav.addObject("userregi",userregi);

		return mav;

	}
	// ...................^^^^^ Login pages connections^^^^^^...............................

	// ..................... registration pages connections...............................
	@GetMapping("/registration")
	public String registerationPage() {
		return "registration";
	}

	@PostMapping("/registrationinfo")
	public String registerationInfo(@ModelAttribute UserRegistration regi) {

		repo.save(regi);
		return "redirect:/loginpage";
	}

	// .................^^^^^ registration pages connections^^^^^^...............................

	// ........................ softwares pages connections...............................
	@RequestMapping("/chrome")
	public String ChromePage() {
		return "chrome";
	}

	@GetMapping("/visualstudio")
	public String vsPage() {
		return "vs";
	}

	@GetMapping("/Springboot")
	public String stsPage() {
		return "sts";
	}

	@GetMapping("/eclipse")
	public String eclipsePage() {
		return "eclipse";
	}

	@GetMapping("/postman")
	public String postman() {
		return "postman";
	}

	@GetMapping("/mongodb")
	public String mongodbPage() {
		return "mongodb";

	}

	@GetMapping("/thymeleaf")
	public String thymeleaf() {
		return "thymeleaf";
	}
	// ........................^^^^^ softwares pages connections^^^^^^...............................

}
