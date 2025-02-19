package com.sts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootMySqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMySqlApplication.class, args);
    }

}
