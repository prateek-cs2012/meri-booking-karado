package com.mbkd.be.bookingapi.model.entity;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    LocalDateTime createdAt;
    LocalDateTime modifiedAt;
    Integer createdBy;
    Integer modifiedBy;
}
