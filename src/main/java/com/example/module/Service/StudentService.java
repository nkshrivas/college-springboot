package com.example.module.Service;

import com.example.module.Enum.BranchName;
import com.example.module.Repositories.BranchRepo;
import com.example.module.Repositories.StudentRepo;
import com.example.module.entity.Branch;
import com.example.module.entity.Student;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;
    HashMap<BranchName,Integer> branchNameStudentHashMap=new HashMap<>();

    @Autowired
    BranchRepo branchRepo;
    public String addStudent(Student student) {
        studentRepo.save(student);
        return "Student Successfully Added";
    }

    public int getMaxPassStudent() {
        branchNameStudentHashMap=new HashMap<>();
        List<Student> students=studentRepo.findAll();

        for(Student std:students) {
            BranchName bn = std.getBranchName();
            int marks = std.getMarks();

            if (marks >= 40) {
                branchNameStudentHashMap.put(bn, branchNameStudentHashMap.getOrDefault(bn, 0) + 1);
            }

        }
        return 0;

    }

//    GET API -
//    find the list of roll no of students which belongs to the most recent branch of college in terms of year only .
    public List<Integer>  findMostRecent(){
        List<Branch> branches=branchRepo.findAll();
        List<Student> students=studentRepo.findAll();
        List<Student>

        int mostRecent= Integer.MIN_VALUE;
        BranchName bn=BranchName.BT;

        for(Branch b:branches){
            if(mostRecent<b.getYear()){
                mostRecent=b.getYear();
                bn=b.getBranchName();
            }
        }

        for(Student std:students){
            BranchName studBranch=std.getBranchName();
            if(studBranch.equals(bn)){

            }

        }

    }

//    GET API = find the grant given to the department containing the maximum absolute number of students who have passed.
    public int findGrant(){
        getMaxPassStudent();
        for(Map.Entry)
    }

}
