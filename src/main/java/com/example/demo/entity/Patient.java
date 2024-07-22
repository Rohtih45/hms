package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="PatientDetails")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="bloodgroup")
	private String bloodgroup;
	@Column(name="prescription")
	private String prescription;
	@Column(name="dose")
	private String dose;
	@Column(name="fees")
	private int fees;
	@Column(name="urgency")
	private String urgency;
	
	
	
	
	
}
