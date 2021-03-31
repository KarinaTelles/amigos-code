package com.example.acode;

import com.example.acode.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class AcodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcodeApplication.class, args);
    }
}
