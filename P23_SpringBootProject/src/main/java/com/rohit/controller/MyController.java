package com.rohit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	
	
	@GetMapping(value = "/")
	public String homepage() {
		return "index";
	}
	
	
	@GetMapping(value = "/register")
	public String register() {
		return "registerPage";
	}

}
