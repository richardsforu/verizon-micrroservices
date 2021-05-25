package com.cts.pss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.pss.entity.BookingRecord;
import com.cts.pss.model.SearchQuery;
import com.cts.pss.service.BookingService;

@RestController
@CrossOrigin
@RequestMapping("/api/book")
@RefreshScope
public class BookingRestController {

	@Autowired
	private BookingService bookingService;

	@Value("${coupon.code}")
	private String couponCode;

	@PostMapping
	public BookingRecord book(@RequestBody SearchQuery query) {
		System.out.println(">>>>>>>> BOOKING-SERVICE <<<<<<<<");
		System.out.println(">>>>>>>> Coupon COde Applied:::: "+couponCode);
		System.out.println("------------------------------------------------");
		return bookingService.bookFlight(query);
	}

	@GetMapping("/{id}")
	public BookingRecord getBooking(@PathVariable int id) {

		return bookingService.getBookingData(id);
	}

}
