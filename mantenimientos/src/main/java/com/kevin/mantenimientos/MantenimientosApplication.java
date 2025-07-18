package com.kevin.mantenimientos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MantenimientosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MantenimientosApplication.class, args);
	}

}
