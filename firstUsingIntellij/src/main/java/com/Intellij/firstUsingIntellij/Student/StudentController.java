package com.Intellij.firstUsingIntellij.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

//    @Autowired //field injection
    private final StudentService service;

    //if we inject using Constructor it is
    // constructor injection(you don't need any annotation ) and if you do it in
    //  getter and setter it is called Setter injection

    //Always recommended to use constructor injection
    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student save(@RequestBody Student student) {
        return service.save(student);
    }

    @GetMapping("/{email}")
    public Student findByemail(@PathVariable String email) {
        return service.findByemail(email);
    }

    @GetMapping
    public List<Student> findAllStudents(){
        return service.findAllStudents();
    }
    //put
    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return service.update(student);
    }

    @DeleteMapping("'{email}")
    public String delete(@PathVariable String email) {
        return service.delete(email);
    }

}
