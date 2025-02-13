package com.scalar.userservice.Dtos;

import com.scalar.userservice.Models.Role;
import com.scalar.userservice.Models.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter@Setter
public class UserDto {
    private String name;
    private String email;
    private List<Role> roles;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<Role> getRoles() {
        return roles;
    }
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public static UserDto from(User user) {
        UserDto userDto = new UserDto();
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
//        userDto.setRoles(user.getRoles());

        return userDto;
    }
}
