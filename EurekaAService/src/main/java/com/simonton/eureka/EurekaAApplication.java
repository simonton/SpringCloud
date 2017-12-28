/**
 * 
 */
package com.simonton.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author simonton
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaAApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaAApplication.class, args);
	}
}
