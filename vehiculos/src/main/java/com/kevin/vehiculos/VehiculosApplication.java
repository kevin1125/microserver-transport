package com.kevin.vehiculos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients // Asegúrate de que apunta donde están tus interfaces Feign
public class VehiculosApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehiculosApplication.class, args);
	}
}
