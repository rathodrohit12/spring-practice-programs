package com.rohit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.rohit.model.User;
import com.rohit.service.UserService;

public class RegisterController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String pass = request.getParameter("pass");

		System.out.println(name);
		System.out.println(email);
		System.out.println(mobile);
		System.out.println(pass);

		User user = new User(name, email, mobile, pass);

		UserService userService = new UserService();
		userService.registerService(user);


		ModelAndView modelAndView = new ModelAndView("welcome");
		modelAndView.addObject("title", "welcome page");
		modelAndView.addObject("name","Welcome!" + name);

		return modelAndView;
	}

}
