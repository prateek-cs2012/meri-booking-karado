package com.mbkd.be.bookingapi.model.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Data;

@Entity(name = "users")
@Data
public class User  extends BaseEntity {
    private String username;
    private String password;
    private LocalDate dob;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
