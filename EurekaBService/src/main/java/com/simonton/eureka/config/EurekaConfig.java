/**
 * 
 */
package com.simonton.eureka.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author simonton
 *
 */
@Configuration
public class EurekaConfig {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplage() {
		return new RestTemplate();
	}
}
