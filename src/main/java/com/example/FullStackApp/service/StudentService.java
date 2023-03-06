package com.example.FullStackApp.service;

import com.example.FullStackApp.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
