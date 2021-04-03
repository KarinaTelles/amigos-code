package com.example.acode.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path="api/v1")
public class StudentController {

    private final StudentSevice studentSevice;

    @Autowired
    public StudentController(StudentSevice studentSevice) {
        this.studentSevice = studentSevice;
    }
    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentSevice.getStudents();
    }
    @GetMapping("/hello2")
    public List<String> hello2(){
        return studentSevice.hello2();
    }
    @GetMapping("/hello")
    public String hello(){
        return studentSevice.hello();
    }
}
