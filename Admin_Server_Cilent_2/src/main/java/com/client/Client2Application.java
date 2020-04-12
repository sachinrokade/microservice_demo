package com.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Client2Application {


	private static final Logger log = LoggerFactory.getLogger(Client2Application.class);
	public static void main(String[] args) {

		log.info("***********************************  Client 2 Started  ************************************  ");
		SpringApplication.run(Client2Application.class, args);
	log.info("***********************************  Client 2 Started  ************************************  ");
	}

}

