package com.kevin.conductores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConductoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConductoresApplication.class, args);
	}

}
