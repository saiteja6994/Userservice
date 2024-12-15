package com.scalar.userservice.Services;

import com.scalar.userservice.Models.Token;
import com.scalar.userservice.Models.User;
import com.scalar.userservice.Repositories.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private UserRepository userRepository;

    UserService(BCryptPasswordEncoder bCryptPasswordEncoder, UserRepository userRepository) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.userRepository = userRepository;
    }

    public User signup(String email, String password,String name) {
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        user.setHashedpassword(bCryptPasswordEncoder.encode(password));
        user.setUserVerified(true);

        //save the user tp the DB

        return userRepository.save(user);
    }
    public Token login(String email, String password) {
        return null;
    }
    public void logout(String token) {
        return;
    }
    public User validateToken(String token) {
        return null;
    }
}
