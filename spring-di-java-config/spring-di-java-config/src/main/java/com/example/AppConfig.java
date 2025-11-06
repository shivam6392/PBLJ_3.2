package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Course course() {
        return new Course("Spring Framework with Java Config");
    }

    @Bean
    public Student student() {
        // Inject the Course bean into Student
        return new Student(course());
    }
}
