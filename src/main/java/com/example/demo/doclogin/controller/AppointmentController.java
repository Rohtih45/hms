package com.example.demo.doclogin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.doclogin.entity.appointment;
import com.example.demo.doclogin.repo.AppointmentRepo;
import com.example.demo.entity.Patient;

@RestController
@RequestMapping("/api/v2")
@CrossOrigin(origins = "http://localhost:4200")
public class AppointmentController {
	
	@Autowired
	private AppointmentRepo repo;
	
	@PostMapping("/appointments")
	public appointment createAppointment(@RequestBody appointment docappntmnt) {
		return repo.save(docappntmnt);
	}
	
	@GetMapping("/appointments")
	public List<appointment> getappntmnt(){
		return repo.findAll();
	}
	
	@DeleteMapping("/appointments/{id}")
	public ResponseEntity<Map<String, Boolean>> removeAppointment(@PathVariable long id) throws AttributeNotFoundException {
		appointment aptmt = repo.findById(id).orElseThrow(()-> new AttributeNotFoundException("Appointment is not found"));
		repo.delete(aptmt);
		Map<String, Boolean> response = new HashMap<String, Boolean>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
}
