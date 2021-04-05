package com.example.acode.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentSevice {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentSevice(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public String hello(){
        return "Hello World";
    }

    public List<String> hello2(){
        return List.of("Hello!", "World");
    }

 //List.of(new Student(1L,"Maria",  LocalDate.of(1991, Month.FEBRUARY,22), 30,"Maria@email.com"));
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
}
