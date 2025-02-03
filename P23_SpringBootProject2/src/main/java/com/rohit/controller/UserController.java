package com.rohit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rohit.model.User;
import com.rohit.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String showLoginForm() {
		return "index";
	}

	@PostMapping("/login")
	public String loginUser(@RequestParam String email, @RequestParam String pass, Model model) {
		boolean isValid = userService.loginService(email, pass);

		if (isValid) {
			model.addAttribute("msg", "Login successful!");
			return "welcome";
		} else {
			model.addAttribute("msg", "Invalid email or password");
			//return "index";
			return "welcome";
		}
	}

	@GetMapping("/register")
	public String showRegistrationForm() {
		return "registerPage";
	}

	@PostMapping("/register")
	public String registerUser(@ModelAttribute User user, Model model) {
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		System.out.println(user.getMobile());
		System.out.println(user.getPass());

		try {
			userService.registerService(user);
			model.addAttribute("msg", "Registration successful!");
			//return "index";
			return "welcome";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("msg", "Registration failed. Please try again.");
			//return "registerPage";
			return "welcome";
		}
	}

}
