package com.example.module;

/*
1.Create an API for managing the results of college students where every student
        has name ,unique  roll no , branch - CSE/IT/EE/ME/BT and  marks out of 100,and
        passing criteria is >=40 marks.(Ask the student to create an enum for Branch Name)
         and grant given to every branch of the college which can vary from branch to branch in a
          college.
          Student = name ,rollNo ,branchName ,Marks.
          Branch = branchName ,HodName ,contactNo .
          Grant =BranchName ,grant given in rupees
        1.  POST :- Add a student with given name ,roll no , branchName ,marks .
        2.  GET API - Find list of contact number of HOD(s) who has maximum no. of passing students in their branch.

        */

import com.example.module.Service.StudentService;
import com.example.module.entity.Student;
import com.fasterxml.jackson.core.PrettyPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/module")
public class Controller {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/getMaxPassedStudent")
    public int getMaxPassedStudent(){

        return studentService.getMaxPassStudent();

    }
}
