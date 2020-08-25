package com.stackroute.samplemvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.stackroute.samplemvc.model.Employee;
import com.stackroute.samplemvc.repository.EmployeeDAO;

@Controller
public class MyController {

	@Autowired
	EmployeeDAO empdao;
	
	@GetMapping("/")
	public String firstConnect()
	{
		return "index";
		
	}
	
	@PostMapping("/saveemp")
	
	public String storeRec(@ModelAttribute("employee") Employee emp,ModelMap map)
	{
		empdao.addEmployee(emp);
		map.put("employees", empdao.getallEmployees());
		
		
		return "index";
	}
	
}
