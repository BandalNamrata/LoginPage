package com.java.loginApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.loginApplication.entity.Registration;
import com.java.loginApplication.service.RegistrationService;


@RestController
@Controller
public class RegistrationController {
	 @Autowired
	    private RegistrationService registrationService;
	 @PostMapping("/createUser")
	 public Registration addProduct(@RequestBody Registration registration) {
			return this.registrationService.addUser(registration);
		}
	 @GetMapping("/view")
	 public List<Registration> viewRegistrations(){
		 return this.registrationService.viewList();
	 }
	 @GetMapping("/FindByUserName/{userName}")
	 public Object findByUserName(@PathVariable String userName) {
		 return registrationService.findByUserName(userName);
	 }
	

}
