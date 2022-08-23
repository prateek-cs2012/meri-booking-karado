package com.mbkd.be.bookingapi.model.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Invoice extends BaseEntity {
    
    @ManyToOne
    User user;

    @ManyToOne
    Booking booking;
    Double amount;
    @Enumerated(EnumType.STRING)
    PaymentMode paymentMode;
    
}
