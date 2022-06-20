package com.xworkz.placement.dto;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginDTO {

	private final Logger logger = LogManager.getLogger(LoginDTO.class);
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Logger getLogger() {
		return logger;
	}
	
}
