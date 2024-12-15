package com.scalar.userservice.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;


import java.util.List;

@Getter
@Setter
@Entity
public class User extends BaseModel {
    private String name;
    private String email;
    private String Hashedpassword;
    @ManyToMany
    private List<Role> roles;
    private boolean isUserVerified;

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setHashedpassword(String hashedpassword) {
        this.Hashedpassword = hashedpassword;
    }
    public String getHashedpassword() {
        return Hashedpassword;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public boolean isUserVerified() {
        return isUserVerified;
    }
    public void setUserVerified(boolean userVerified) {
        isUserVerified = userVerified;
    }
}
