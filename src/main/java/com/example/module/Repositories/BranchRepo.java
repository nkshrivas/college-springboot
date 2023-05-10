package com.example.module.Repositories;

import com.example.module.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepo extends JpaRepository<Branch,Integer> {
}
