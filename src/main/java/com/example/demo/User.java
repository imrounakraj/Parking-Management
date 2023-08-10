package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="User")


public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	@Column(name="emailId")
    private String email;
    
	@Column(name="mobNo")
	private int mob;
    
	@Column(name="userName")
    private String name;
	
	@Column(name="address")
    private String address;
	
	@Column(name="vehicles")
    private String vehicles;
	
	@Column(name="profession")
    private String profession;
	
	@Column(name="isActive")
    private boolean isActive;

	public void setId(Integer id2) {
		// TODO Auto-generated method stub
		
	}

	
}
