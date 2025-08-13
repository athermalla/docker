package com.docker.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DockerController {


    @Autowired
    StudentRepo sr;


    @GetMapping("/")
    public String greet() {

        return "hello this is running from Docker";


    }

    @GetMapping("/getStudents")
    public List<Student> getStudents() {

        return sr.findAll();


    }

}
