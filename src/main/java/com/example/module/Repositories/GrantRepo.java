package com.example.module.Repositories;

import com.example.module.entity.Grant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrantRepo extends JpaRepository<Grant,Integer> {
}
