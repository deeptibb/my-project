package com.xworkz.placement.dao;

import javax.persistence.EntityManagerFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

 @Repository
public class LoginDAO {

	private final Logger logger=LogManager.getLogger(LoginDAO.class);

	@Autowired
	EntityManagerFactory entityManagerFactory;
	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
  public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}


	public void saveData() {
		logger.info("INFO - login method invoked");
		
	}

}

