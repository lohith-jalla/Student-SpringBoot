package com.Intellij.firstUsingIntellij.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class StudentDAO_inMemory implements StudentService{

    private final StudentDAO DAO;

    public StudentDAO_inMemory(StudentDAO studentDAO) {
        this.DAO = studentDAO;
    }

    public List<Student> findAllStudents(){

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

    @Override
    public void delete(String email) {
        DAO.delete(email);
    }
    @Override
    public Student save(Student s) {
        return DAO.save(s);
    }
    @Override
    public Student update(Student s) {
        return DAO.update(s);
    }
    @Override
    public Student findByemail(String email) {
        return DAO.findByemail(email);
    }


}
