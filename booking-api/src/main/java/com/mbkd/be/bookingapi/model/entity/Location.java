package com.mbkd.be.bookingapi.model.entity;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Location extends BaseEntity {
    private String name;
    private String state;
    private String city;
    private String country;
    private String pincode;
    private Double Latitude; 
    private Double longitude;
}
