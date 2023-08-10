package com.example.demo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vehicle")

public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="vechileId")
        private String vehicleId;
	
	@Column(name="regNo")
        private String regNo;
	
	@Column(name="make")
        private String make;
	
	@Column(name="model")
        private String model;
	
	@Column(name="varient")
        private String varient;
	
	@Column(name="owner")
        private String owner;
	
	@Column(name="type")
        private String type;

	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}
		
    }
    

