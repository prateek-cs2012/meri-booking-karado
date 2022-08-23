package com.mbkd.be.bookingapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbkd.be.bookingapi.model.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>{
    
}
