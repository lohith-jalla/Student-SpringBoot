package com.Intellij.firstUsingIntellij.Student;

import java.time.LocalDate;

public class Student {

    private String name;
    private int age;
    private LocalDate birthDate;
    private String gender;
    private String email;

    public Student(String name, int age, LocalDate birthDate, String gender, String email) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.gender = gender;
        this.email = email;
    }

    public Student() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
