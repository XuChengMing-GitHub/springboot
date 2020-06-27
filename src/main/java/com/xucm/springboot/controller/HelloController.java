package com.xucm.springboot.controller;

import com.xucm.springboot.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Student hello() {
        Student student = new Student();
        student.setAge(23);
        student.setName("许成明");
        return student;
    }

}
