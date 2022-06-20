package com.xworkz.placement.dto;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lombok.Data;

@Data
public class RegistrationDTO {

	private final Logger logger=LogManager.getLogger( RegistrationDTO.class);
			private String username;
	        private String email;
	        private long contactno;
	        private String gender;
	        private String password;
	
	
}
