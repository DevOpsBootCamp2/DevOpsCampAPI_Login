package com.cap.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class TokenTest {

	@Test
	public void testTokenIsConstructed(){
		Token token = new Token();
		token.setEmail("email");
		token.setPassword("password");
		
		assertEquals("email", token.getEmail());
		assertEquals("as",token.getPassword());
	}
}
