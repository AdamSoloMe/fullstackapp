package com.example.FullStackApp.controller;

import com.example.FullStackApp.model.Student;
import com.example.FullStackApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        System.out.println(student.getAddress());
        return "New student is added";
    }
    @GetMapping("/getall")
        public List<Student> getALLStudents(){
         return studentService.getAllStudents();
    }
}
