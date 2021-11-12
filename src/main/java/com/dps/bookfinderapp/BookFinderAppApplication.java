package com.dps.bookfinderapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.dps.bookfinderapp.repository")
public class BookFinderAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookFinderAppApplication.class, args);
    }

}
