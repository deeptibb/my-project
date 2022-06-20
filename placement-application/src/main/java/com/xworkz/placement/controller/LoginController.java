package com.xworkz.placement.controller;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.placement.dto.LoginDTO;

	@Controller
	public class LoginController {

		private final Logger logger=LogManager.getLogger(LoginController.class);

		@PostMapping("login.do")
		public ModelAndView login(LoginDTO loginDto) {
			logger.info("INFO - login method invoked");
			return new ModelAndView("success");
		}
	}

