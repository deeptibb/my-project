package com.xworkz.placement.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.placement.dao.RegistrationDAO;
import com.xworkz.placement.dto.RegistrationDTO;
import com.xworkz.placement.entity.UserEntity;


@Service
public class RegistrationService {

	private final Logger logger=LogManager.getLogger(RegistrationService.class);
	
	@Autowired
	private RegistrationDAO registrationDao;
	private void  saveData(RegistrationDTO registrationDTO) throws Exception  {
		logger.info("INFO - save data registration service method invoked");
		UserEntity entity = new UserEntity();
		BeanUtils.copyProperties(registrationDTO, entity);
		{
			logger.info("INFO = login method invoked");
		 registrationDao.saveData(entity);
		}
	}

}
//logger.info("INFO - login method invoked");
//registrationDAO.saveData(entity);

	
