/**
 * 
 */
package com.simonton.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

/**
 * @author simonton
 *
 */
@RestController
public class EurekaAController {

	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping(value="/serviceA", method=RequestMethod.GET)
	public String service() {
		System.out.println(JSONObject.toJSONString(client.getLocalServiceInstance()));
		return "service A";
	}
	
	@RequestMapping(value="/print", method=RequestMethod.GET)
	public void print() {
		System.out.println(" print info.");
	}
	
	@RequestMapping(value="/beforeService", method=RequestMethod.GET)
	public String beforeService() {
		return "Ready invoke service? ";
	}
}
