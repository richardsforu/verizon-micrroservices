package com.cts.pss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.pss.entity.Fare;
import com.cts.pss.entity.Flight;
import com.cts.pss.entity.FlightDao;

@Service
public class FareServiceImpl implements FareService {

	@Autowired
	private FlightDao flightDao;

	@Override
	public Fare getFare(int id) {
		
		Flight flight = flightDao.findById(id).orElse(null);
			
		if(flight==null) {
			return null;
		}
		
		return flight.getFare();
	}
}
