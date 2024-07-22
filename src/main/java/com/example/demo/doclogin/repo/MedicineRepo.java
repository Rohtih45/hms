package com.example.demo.doclogin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.doclogin.entity.medicine;
@Repository
public interface MedicineRepo extends JpaRepository<medicine, Long>{

}
