package com.kt.springcloud.limit.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kt.springcloud.limit.service.bean.Confuguration;
import com.kt.springcloud.limit.service.bean.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {
	@Autowired
	private Confuguration confuguration;
	
	@GetMapping("/limits")
	public LimitsConfiguration retrieveLimitsFromConfigurations() {
		
		return new LimitsConfiguration(confuguration.getMax(),confuguration.getMin());
		
	}

}
