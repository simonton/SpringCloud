/**
 * 
 */
package com.simonton.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author simonton
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaDemoServer {
	public static void main(String[] args) {
		SpringApplication.run(EurekaDemoServer.class, args);
	}
}
