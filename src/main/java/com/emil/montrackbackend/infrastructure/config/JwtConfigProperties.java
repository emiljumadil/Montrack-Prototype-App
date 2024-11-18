package com.emil.montrackbackend.infrastructure.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "jwt")
@Data
public class JwtConfigProperties {
    private String secret;
}