package com.cts.pss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SpringAdminAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAdminAppApplication.class, args);
	}

}
