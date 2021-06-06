package com.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homecontroller {
	
	@RequestMapping(value="/home/getapi",method=RequestMethod.GET)
      public String getValue()
      {
		System.out.print("inside the get rest api");
		return "yes";
      }
	
}