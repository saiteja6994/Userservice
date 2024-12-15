package com.scalar.userservice.Controllers;

import com.scalar.userservice.Dtos.LogoutReqDto;
import com.scalar.userservice.Dtos.SignupReqDto;
import com.scalar.userservice.Dtos.UserDto;
import com.scalar.userservice.Dtos.loginReqDto;
import com.scalar.userservice.Models.Token;
import com.scalar.userservice.Models.User;
import com.scalar.userservice.Services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/signup")
    public UserDto signup(@RequestBody SignupReqDto signupReqDto){
        User user=userService.signup(
                signupReqDto.getEmail(),
                signupReqDto.getName(),
                signupReqDto.getPassword()
        );
        return UserDto.from(user);
    }
    @PostMapping("/login")
    public Token login(@RequestBody loginReqDto loginreqDto){
        return null;
    }
    @PostMapping("/logout")
    public ResponseEntity<Void> logout(@RequestBody LogoutReqDto logoutReqDto){
        return null;
    }
    @PostMapping("/validate/{token}")
    public UserDto validateToken(@PathVariable String token){
        return null;
    }

}
