package com.example.awhombackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AWhomBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(AWhomBackendApplication.class, args);
    }

}
