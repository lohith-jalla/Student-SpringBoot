package com.Intellij.firstUsingIntellij.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.IntStream;

//This is my service class
@Service
public class StudentDAO_inMemory implements StudentService{

    private final StudentDAO DAO;

    public StudentDAO_inMemory(StudentDAO studentDAO) {
        this.DAO = studentDAO;
    }

    public List<Student> findAllStudents(){
            return DAO.findAll();
    }

    @Override
    public String delete(String email) {
        return DAO.delete(email);
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
