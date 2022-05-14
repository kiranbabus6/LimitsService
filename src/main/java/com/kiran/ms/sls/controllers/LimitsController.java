package com.kiran.ms.sls.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiran.ms.sls.beans.Limits;
import com.kiran.ms.sls.configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration config;

	@GetMapping("/limits")
	public Limits retrieveLimits()
	{
		return new Limits(config.getMin(),config.getMax());
	}
	
}
