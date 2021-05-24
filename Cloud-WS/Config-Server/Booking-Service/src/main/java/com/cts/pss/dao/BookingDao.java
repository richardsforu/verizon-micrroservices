package com.cts.pss.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.pss.entity.BookingRecord;

public interface BookingDao extends JpaRepository<BookingRecord, Integer> {
}
