package com.example.crudservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("crud/")
public class StudentController {
    @Autowired
    private StudentRepository studentRepo;

    @GetMapping("get-all")
    public List<Student> getAll(){
        return studentRepo.findAll();
    }

    @PostMapping("/create")
    public Student create(@RequestBody  Student student){
        return studentRepo.save(student);
    }


}
