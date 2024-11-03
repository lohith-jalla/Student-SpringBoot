package com.Intellij.firstUsingIntellij.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Lohith Jalla",
                        20,
                        LocalDate.now(),
                        "Male",
                        "Lohithjalla12@gmail.com"
                ),
                new Student(
                        "Mani",
                        20,
                        LocalDate.now(),
                        "Male",
                        "Mani@gmail.com"
                ),
                new Student(
                        "Nivas",
                        120,
                        LocalDate.now(),
                        "Male",
                        "Nivas@gmail.com"
                ),
                new Student(
                        "Arshak",
                        124,
                        LocalDate.now(),
                        "Male",
                        "Arshak@gmail.com"
                )
        );
    }
}
