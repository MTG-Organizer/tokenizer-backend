package com.github.mtgorganizer.tokenizerbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}) // TODO
public class TokenizerBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(TokenizerBackendApplication.class, args);
    }
}
