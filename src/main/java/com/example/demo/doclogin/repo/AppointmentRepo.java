package com.example.demo.doclogin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.doclogin.entity.appointment;
@Repository
public interface AppointmentRepo extends JpaRepository<appointment, Long>{

}
