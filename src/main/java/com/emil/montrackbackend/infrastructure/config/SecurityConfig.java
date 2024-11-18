package com.emil.montrackbackend.infrastructure.config;



import lombok.extern.java.Log;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@Log
public class SecurityConfig {
    private final GetUserAuthDetailsUsecasr getUserAuthDetailsUsecase;
    private final JwtConfigProperties jwtConfigProperties;
    private final PasswordEncoder passwordEncoder;
    private final RsaKeyConfigProperties rsaKeyConfigProperties;

}
