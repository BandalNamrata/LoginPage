package com.java.loginApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.loginApplication.entity.Registration;
import com.java.loginApplication.repository.RegistrationRepo;

@Service
public class RegistrationServiceImpl implements RegistrationService{
	List<Registration> List;
	@Autowired
	RegistrationRepo registrationRepo;


	@Override
	public Registration addUser(Registration registration) {
		registrationRepo.save(registration);
		return registration;
	}


	@Override
	public List<Registration> viewList() {
		return registrationRepo.findAll();
	}


	@Override
	public Object findByUserName(String userName) {
		return registrationRepo.findByName(userName);
	}

}
