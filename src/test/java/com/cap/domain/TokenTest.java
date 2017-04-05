package com.cap.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class TokenTest {

	@Test
	public void testTokenIsConstructed(){
		String email = "email";
		String password = "password";
		
		Token token = new Token();
		token.setEmail(email);
		token.setPassword(password);
		
		assertEquals(email, token.getEmail());
		assertEquals(password,token.getPassword());
	}
}
