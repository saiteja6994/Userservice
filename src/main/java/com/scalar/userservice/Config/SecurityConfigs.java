package com.scalar.userservice.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfigs {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((requests) -> {
                    try{
                        requests.anyRequest().permitAll()
                                .and().cors().disable()
                                .csrf().disable();
                    }
                       catch (Exception e){
                        throw new RuntimeException(e);
                    }
                        }
                )
                .httpBasic(withDefaults());
        return http.build();
    }
}
