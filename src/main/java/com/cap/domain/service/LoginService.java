package com.cap.domain.service;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cap.domain.Login;

@RestController
@RequestMapping(value="service/login")
public class LoginService {
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public void login(@Valid @RequestBody Login login){
		Logger.getLogger(LoginService.class.getName()).log(Level.INFO, "login");
		
	}
	
}
