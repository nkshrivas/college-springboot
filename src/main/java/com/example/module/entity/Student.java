package com.example.module.entity;

import com.example.module.Enum.BranchName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "student")

public class Student {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private  String rollNo;
   private String name;
   @Enumerated(EnumType.STRING)
   private BranchName branchName;
   private int Marks;
}
