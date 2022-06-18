package com.java.loginApplication.service;

import java.util.List;

import com.java.loginApplication.entity.Registration;

public interface RegistrationService {

	public Registration addUser(Registration registration);

	public List<Registration> viewList();

	public Object findByUserName(String userName);

}
