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
@RestController
public class AcodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcodeApplication.class, args);
    }
    /*root*/
    @GetMapping
    public String hello(){
        return "Hello World";
    }
    @GetMapping ("/json")
    public List<String> hello2(){
        return List.of("Hello!", "World");
    }
    @GetMapping("/student")
    public List<Student> hello3(){
        return List.of(new
                Student(1L,"Maria",  LocalDate.of(1991, Month.FEBRUARY,22), 30,"Maria@email.com")
        );
    }

}
