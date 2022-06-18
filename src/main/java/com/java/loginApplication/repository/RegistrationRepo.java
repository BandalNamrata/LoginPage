package com.java.loginApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.loginApplication.entity.Registration;

@Repository
public interface RegistrationRepo extends JpaRepository<Registration, String>
{

	Object findByName(String userName);

}
