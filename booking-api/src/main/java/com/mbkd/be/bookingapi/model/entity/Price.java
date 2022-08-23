package com.mbkd.be.bookingapi.model.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Price extends BaseEntity{
    
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Theater theater;
    private String seatType;
    private Double price;
}
