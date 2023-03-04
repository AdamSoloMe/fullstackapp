package com.example.FullStackApp.service;

import com.example.FullStackApp.Repository.StudentRepository;
import com.example.FullStackApp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{


    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student) ;
    }
}
