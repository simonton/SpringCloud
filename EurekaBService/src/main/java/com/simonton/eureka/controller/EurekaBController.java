package com.simonton.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class EurekaBController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/serviceB",method=RequestMethod.GET)
	public String service() {
		String serviceA = restTemplate.getForEntity("http://a-service/serviceA", String.class).getBody();
		return "service B " + serviceA;
	}
	
	@RequestMapping(value="/beforeService",method=RequestMethod.GET)
	public String beforeService() {
		String ret = null;
		restTemplate.getForEntity("http://a-service/print", String.class);
		ret = this.restTemplate.getForEntity("http://a-service/beforeService", String.class).getBody();
		return ret;
	}
}
