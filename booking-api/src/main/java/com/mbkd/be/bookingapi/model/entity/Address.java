package com.mbkd.be.bookingapi.model.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Address extends BaseEntity {
    private String city;
    private String state; 
    private String country;
    private Double latitude; 
    private Double longitude;
    private String line1;
    private String line2;
}
