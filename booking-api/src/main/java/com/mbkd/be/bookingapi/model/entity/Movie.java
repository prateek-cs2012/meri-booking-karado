package com.mbkd.be.bookingapi.model.entity;

import javax.persistence.Entity;

@Entity
public class Movie extends BaseEntity {
    String name;
    String description;
    String genre;
    String bannerUrl;
}
