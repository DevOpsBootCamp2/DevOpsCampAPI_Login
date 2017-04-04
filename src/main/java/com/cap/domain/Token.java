package com.cap.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Token extends Login {
	
	@Value("${domian.token}")
    private String token;
	
	public String getToken(){
		return this.token;
	}
}
