package com.admin_client.contoller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.admin_client.model.School;
import com.admin_client.serviceimpl.SchoolServiceImpl;

@RestController
public class SchoolController {
	
	@Autowired
	SchoolServiceImpl schimpl;
	
	

	private Logger log = LoggerFactory.getLogger(SchoolController.class);
	@GetMapping("/")
    public String index() {

		log.info("----------------------------------  Hello Cilent 1....!  ------------------------------------  ");
       		return "Spring Admin Client 1";
	}
	
	@PostMapping("/add")
	@RequestMapping(value = "/add", consumes=MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
	public  String add(@RequestBody School sch)
	{
		return schimpl.addSchool(sch);
	}

	@GetMapping("/gets")
	@RequestMapping(value = "/employees", produces = MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
	public @ResponseBody List<School> gets()
	{
		 return schimpl.getSchools();
	}
	@GetMapping("/get/{id}")
	public School test(@PathVariable(value = "id") int id)
	{
		
		System.out.println("Controller "+id);
		return schimpl.findSchool(id);
	}
	// test PathParam and Request Parm
	//http://localhost:9092/srno/1001/receipts?date=2017-12-05
	@GetMapping(value="/srno/{orderId}/receipts")
	
	public String listUsersInvoices(@PathVariable("orderId") int order,
						@RequestParam(value = "date", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateOrNull) 
	{
		System.out.println(dateOrNull);
		return "order "+order+" "+dateOrNull;
	
	}
	
}
 