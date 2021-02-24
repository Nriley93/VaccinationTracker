package vt;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//Author: Nick Riley

@Data
@Entity
@Table(name="healthRecord")
public class HealthRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer hRID;
	private String preconditions;
	private String foodAllergy;
	private String drugAllergy;
	private String petAllergy;
	private String medications;
	private String notes;
}
