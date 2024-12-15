package com.scalar.userservice.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter@Getter
@Entity

public class Token extends BaseModel{
    private String value;
    @ManyToOne
    private User user;
    private Date expiryDate;
}
