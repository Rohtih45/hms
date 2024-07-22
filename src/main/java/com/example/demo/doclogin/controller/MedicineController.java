package com.example.demo.doclogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.doclogin.entity.appointment;
import com.example.demo.doclogin.entity.medicine;
import com.example.demo.doclogin.repo.MedicineRepo;

@RestController
@RequestMapping("/api/v3")
public class MedicineController {
	
	@Autowired
	private MedicineRepo repo;
	
	@PostMapping("/insert")
	public medicine createAppointment(@RequestBody medicine docmedicine) {
		return repo.save(docmedicine);
	}
	
	@GetMapping("/get")
	public List<medicine> getmedicine(){
		return repo.findAll();
	}

}
