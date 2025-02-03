package com.rohit.restapitest.controller;


import com.rohit.restapitest.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyRestController {


    @GetMapping("/hi")
    public Employee sayHello(){
        return new Employee(1, "rohan");
    }

    @PostMapping("/hello")
    public Employee sayHi() {
    	return new Employee(2, "Rohan");
    }
    
    @PostMapping("/register")
	public Employee userReister( @RequestParam("id") int id,
		    @RequestParam("name") String name){
		return new Employee(id, name);
	}



}
