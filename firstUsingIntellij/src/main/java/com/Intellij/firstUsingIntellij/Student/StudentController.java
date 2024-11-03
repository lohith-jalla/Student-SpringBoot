package com.Intellij.firstUsingIntellij.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

//    @Autowired //field injection
    private StudentService service;

    //if we inject using Constructor it is
    // constructor injection(you don't need any annotation ) and if you do it in
    //  getter and setter it is called Setter injection

    //Always recommended to use constructor injection
    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> findAllStudents(){
        return service.findAllStudents();
    }

}
