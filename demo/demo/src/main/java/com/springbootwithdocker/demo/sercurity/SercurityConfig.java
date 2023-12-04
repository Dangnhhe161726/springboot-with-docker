package com.springbootwithdocker.demo.sercurity;

import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@EnableWebSecurity
@RequiredArgsConstructor
@EnableMethodSecurity
@Component
public class SercurityConfig {
    private final Authentication authentication;
}
