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
@Table(name="visit")
public class Visit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String vaccine;
	private String dose;
	private String vaccinationDt;
	private String facility;
	private String adverseReaction;
	
	//	Getters & Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVaccine() {
		return vaccine;
	}
	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}
	public String getDose() {
		return dose;
	}
	public void setDose(String dose) {
		this.dose = dose;
	}
	public String getVaccinationDt() {
		return vaccinationDt;
	}
	public void setVaccinationDt(String vaccinationDt) {
		this.vaccinationDt = vaccinationDt;
	}
	public String getFacility() {
		return facility;
	}
	public void setFacility(String facility) {
		this.facility = facility;
	}
	public String getAdverseReaction() {
		return adverseReaction;
	}
	public void setAdverseReaction(String adverseReaction) {
		this.adverseReaction = adverseReaction;
	}
}
