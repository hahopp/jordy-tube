package com.jordytube.edge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EdgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeApplication.class, args);
	}

}
