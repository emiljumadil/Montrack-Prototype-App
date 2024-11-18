package com.emil.montrackbackend;


import com.emil.montrackbackend.infrastructure.config.JwtConfigProperties;
import com.emil.montrackbackend.infrastructure.config.RsaKeyConfigProperties;
import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Log
@SpringBootApplication
@EnableConfigurationProperties({JwtConfigProperties.class, RsaKeyConfigProperties.class})
public class MontrackbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MontrackbackendApplication.class, args);
	}

}
