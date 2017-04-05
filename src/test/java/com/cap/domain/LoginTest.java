package com.cap.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginTest {
	
	@Test
	public void testLoginIsConstrcutedProperly() {
		String email = "email";
		String password = "password";
		
		Login login = new Login();
		login.setEmail(email);
		login.setPassword(password);
		
		assertEquals(email, login.getEmail());
		assertEquals(password, login.getPassword());
	}

}
