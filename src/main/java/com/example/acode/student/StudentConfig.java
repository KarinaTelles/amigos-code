package com.example.acode.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.DECEMBER;
import static java.time.Month.FEBRUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student mariam = new Student("Mariam",  LocalDate.of(1991, FEBRUARY,22), 30,"Mariam@email.com");
            Student alex = new Student("Alex",  LocalDate.of(1994, DECEMBER,2), 27,"Alex@email.com");
            repository.saveAll(List.of(mariam, alex));
        };
    }
}
