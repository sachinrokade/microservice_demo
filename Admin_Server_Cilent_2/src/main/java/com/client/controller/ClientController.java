package com.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {


	private static final Logger log = LoggerFactory.getLogger(ClientController.class);

    @RequestMapping("/")
    public String home() {

		log.info("----------------------------------  Hello Cilent 2....!  ------------------------------------  ");
        return "Hello Cilent 2....!";
    }
}