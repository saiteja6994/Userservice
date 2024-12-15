package com.scalar.userservice.Dtos;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class loginReqDto {
    private String email;
    private String password;
}
