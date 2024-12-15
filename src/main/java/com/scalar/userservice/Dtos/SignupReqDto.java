package com.scalar.userservice.Dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupReqDto {
    private String email;
    private String password;
    private String name;
    public String getEmail() {
        return email;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for password
    public String getPassword() {
        return password;
    }

    // Optional: Setter methods if you need them
    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
