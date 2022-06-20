package com.xworkz.placement.controller;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

private final Logger logger= (Logger) LogManager.getLogger(LoginController.class);
	
	@GetMapping("doregistration.do")
	public ModelAndView registereUser() {
		logger.info("INFO - login method invoked....");
		try {
			throw new Exception("some exception");
		}catch (Exception e) {
			//e.printStcktrace();
			logger.error(e.getMessage(),e);
		}
		return new ModelAndView("sign");
		
		
		
	}
}
