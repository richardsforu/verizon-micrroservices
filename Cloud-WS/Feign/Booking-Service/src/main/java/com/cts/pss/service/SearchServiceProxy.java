package com.cts.pss.service;

import java.time.LocalDate;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.pss.entity.Flight;

@FeignClient(name = "search-service",url = "http://localhost:8082/api/search")
public interface SearchServiceProxy {
	
	@GetMapping("/{flightNumber}/{origin}/{destination}/{flightDate}")
	public Flight getFlight(@PathVariable String flightNumber,
							@PathVariable String origin,
							@PathVariable String destination,
							@PathVariable @DateTimeFormat(iso = ISO.DATE)LocalDate flightDate);

}
