package com.pankaj.microservices.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pankaj.microservices.limitservice.bean.Limits;
import com.pankaj.microservices.limitservice.configuration.Configuration;

@RestController
public class LimitsController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits getLimits() {
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
	}
}
