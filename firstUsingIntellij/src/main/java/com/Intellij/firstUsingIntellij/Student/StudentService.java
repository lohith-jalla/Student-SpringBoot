package com.Intellij.firstUsingIntellij.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

public interface StudentService {

    Student save(Student s);
    List<Student> findAllStudents() ;
    Student findByemail(String email);
    void delete(String email);
    Student update(Student s);
}
