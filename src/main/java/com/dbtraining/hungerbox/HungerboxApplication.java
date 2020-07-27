package com.dbtraining.hungerbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HungerboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(HungerboxApplication.class, args);
	}

}
