package com.cap.domain.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cap.domain.Login;
import com.cap.domain.Token;

@RestController
@RequestMapping(value="service/login")
public class LoginService {
	
	@Autowired
	private Token token;
	
	@RequestMapping(value="/auth", method=RequestMethod.POST)
	public Token login(@Valid @RequestBody Login login){
		token.setEmail(login.getEmail());
		token.setPassword(login.getPassword());
		return token;
	}
}
