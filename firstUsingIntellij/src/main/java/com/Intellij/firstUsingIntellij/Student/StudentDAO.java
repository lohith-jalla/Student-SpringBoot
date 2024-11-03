package com.Intellij.firstUsingIntellij.Student;

import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.IntStream;


//This acts as DataBase............
@Repository
public class StudentDAO {

    private List<Student> Students =new ArrayList<>();

    public String delete(String email) {
        var student= findByemail(email);
        if(student!=null){
            Students.remove(student);
            return "removed Succcess";
        }
        return "Failed To remove";
    }

    public Student save(Student s) {
        Students.add(s);
        return s;
    }

    public Student update(Student s) {
        var studentIndex = IntStream.range(0, Students.size())
                .filter(index -> Students.get(index).getEmail().equals(s.getEmail()))
                .findFirst()
                .orElse(-1);
        if(studentIndex > -1){
            Students.set(studentIndex, s);
            return s;
        }
        return null;
    }

    public Student findByemail(String email) {
        return Students.stream()
                .filter(s -> email.equals(s.getEmail()))
                .findFirst()
                .orElse(null);
    }

    public List<Student> findAll() {
        return Students;
    }
}
