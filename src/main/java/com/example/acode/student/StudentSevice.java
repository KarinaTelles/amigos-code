package com.example.acode.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentSevice {

    public String hello(){
        return "Hello World";
    }

    public List<String> hello2(){
        return List.of("Hello!", "World");
    }

    public List<Student> getStudents(){
        return List.of(new
                Student(1L,"Maria",  LocalDate.of(1991, Month.FEBRUARY,22), 30,"Maria@email.com")
        );
    }
}
