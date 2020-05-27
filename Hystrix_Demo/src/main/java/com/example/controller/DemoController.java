package com.example.controller;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DemoController {

	
	@GetMapping("/")
	public String test()
	{
		return "Great it's working.....!";
	}
	
	@GetMapping("/test")
	@HystrixCommand(fallbackMethod="catchException_1")
	public String test1()
	{
		if(RandomUtils.nextBoolean())
				throw new RuntimeException("This service get falid RuntimeException");
		else
			return "Method 1.....!";
	}
	public String catchException_1()
	{
		return "Exception under testing Metode 1...!";
	}
	
	
	@GetMapping("/test2")
	@HystrixCommand(fallbackMethod="catchException_2")
	public String test2()
	{
		if(RandomUtils.nextBoolean())
				throw new ArrayIndexOutOfBoundsException("This service get falid ArrayIndexOutOfBoundsException");
		else
			return "Method 2.....!";
	}
	public String catchException_2()
	{
		return "Exception under testing Metode 2...!";
	}
}
