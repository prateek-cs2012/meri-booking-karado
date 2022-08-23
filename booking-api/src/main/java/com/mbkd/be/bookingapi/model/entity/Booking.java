package com.mbkd.be.bookingapi.model.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Booking extends BaseEntity {
    @ManyToOne
    User user;

    @ManyToOne
    Theater  theater;
    
    @ManyToOne
    Movie movie;
    
    Integer noOfSeats;
    String seatNumbers;
}
