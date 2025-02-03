package com.rohit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.rohit.model.User;
import com.rohit.service.UserService;


@Controller
public class LoginController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");

		System.out.println(email);
		System.out.println(pass);

		User user = new User(email, pass);

		UserService userService = new UserService();
		String name = userService.loginService(user);

		
        if (name != null) {
            ModelAndView modelAndView = new ModelAndView("welcome");
            modelAndView.addObject("title", "Welcome Page");
            modelAndView.addObject("msg", "Welcome!");
            modelAndView.addObject("name", name);
            
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("welcome");
            modelAndView.addObject("title", "Error Page");
            modelAndView.addObject("msg", "Invalid email or password");
            return modelAndView;
        }
		
	}

}
