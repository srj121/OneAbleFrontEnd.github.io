package com.time.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.time.main.entity.Softwares;
import com.time.main.repository.SoftwareRepository;
import com.time.main.serviceIMPL.SoftwaresIMPL;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/soft")
public class SoftwaresController {
	@Autowired
	SoftwaresIMPL sft;
	
	@Autowired
	SoftwareRepository sftrepo;

	// for getting all the given data
	@GetMapping("/getsoft")
	public List<Softwares> getALL() {
		return sft.getAll();

	}
	
	
	// for psoting new data
	@PostMapping("/postsoft")
	public Softwares Save(@RequestBody Softwares soft) {

		return sft.save(soft);

	}
//	
//	@GetMapping("/softname/")
//	public List<String> getbyname(@RequestParam  String softname){
//		return sftrepo.getsoftwarebyname(softname);
//		
//		
//		
//	}

	// for updating the data and for END TIME
//	@PutMapping("/putsoft")
//	public Softwares update(@RequestBody Softwares soft)  {
//
//		return sft.update(soft);
//	}
	
//	@PutMapping("/putsoft")
//	public List<Softwares> getName(String name) {
//		return sft.getName(name);
//
//	}


}
