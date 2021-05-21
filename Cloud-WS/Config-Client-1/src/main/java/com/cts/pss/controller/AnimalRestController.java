package com.cts.pss.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/animals")
@CrossOrigin
@RefreshScope
public class AnimalRestController {
	
	@Value("${name}")
	private String animalName;
	
	@GetMapping
	public String getName() {
		return animalName;
	}
	
	

}
