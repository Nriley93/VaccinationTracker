package vt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//Author: Nick Riley

@Data
@Entity
@Table(name="patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer patId;
	
	private String fname;
	private String lname;
	private String address;
	private String city;
	
	@Column(length=5)
	private String zipcode;
	
	@Column(unique=true, length=45)
	private String email;
	
	@Column(length=10)
	private String phone;
	private String sex;
}
