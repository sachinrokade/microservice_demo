package com.admin_client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AdminServerCilent1Application {

	private static final Logger log = LoggerFactory.getLogger(AdminServerCilent1Application.class);

	public static void main(String[] args) {
		
		log.info("***********************************  Client 1 Started  ************************************  ");
		SpringApplication.run(AdminServerCilent1Application.class, args);
	log.info("***********************************  Client 1 Started  ************************************  ");
	}

}

