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
	private Long id;
	
//	private String preconditions;
//	private String allergies;
//	private String notes;
	
	private boolean polyethyleneGlycol;
	private boolean polysorbate;
	private boolean latex;
	private boolean previousCOVID19Vaccine;
	private boolean anotherVaccine;
	private boolean foodPetEnviromentalMedication;
	private boolean weakenedImmuneSystem;
	private boolean bleedingDisorder;
	private boolean guillainBarreSyndrome;
	private boolean bellsPalsy;
	private boolean heartCondition;
	private boolean pregnacy;
	private boolean intellectualDisabilities;
	private boolean cancer;
	private boolean note1;
	private boolean note2;
	
	//	Getters & Setters

	public boolean isPolyethyleneGlycol() {
		return polyethyleneGlycol;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setPolyethyleneGlycol(boolean polyethyleneGlycol) {
		this.polyethyleneGlycol = polyethyleneGlycol;
	}
	public boolean isPolysorbate() {
		return polysorbate;
	}
	public void setPolysorbate(boolean polysorbate) {
		this.polysorbate = polysorbate;
	}
	public boolean isLatex() {
		return latex;
	}
	public void setLatex(boolean latex) {
		this.latex = latex;
	}
	public boolean isPreviousCOVID19Vaccine() {
		return previousCOVID19Vaccine;
	}
	public void setPreviousCOVID19Vaccine(boolean previousCOVID19Vaccine) {
		this.previousCOVID19Vaccine = previousCOVID19Vaccine;
	}
	public boolean isAnotherVaccine() {
		return anotherVaccine;
	}
	public void setAnotherVaccine(boolean anotherVaccine) {
		this.anotherVaccine = anotherVaccine;
	}
	public boolean isFoodPetEnviromentalMedication() {
		return foodPetEnviromentalMedication;
	}
	public void setFoodPetEnviromentalMedication(boolean foodPetEnviromentalMedication) {
		this.foodPetEnviromentalMedication = foodPetEnviromentalMedication;
	}
	public boolean isWeakenedImmuneSystem() {
		return weakenedImmuneSystem;
	}
	public void setWeakenedImmuneSystem(boolean weakenedImmuneSystem) {
		this.weakenedImmuneSystem = weakenedImmuneSystem;
	}
	public boolean isBleedingDisorder() {
		return bleedingDisorder;
	}
	public void setBleedingDisorder(boolean bleedingDisorder) {
		this.bleedingDisorder = bleedingDisorder;
	}
	public boolean isGuillainBarreSyndrome() {
		return guillainBarreSyndrome;
	}
	public void setGuillainBarreSyndrome(boolean guillainBarreSyndrome) {
		this.guillainBarreSyndrome = guillainBarreSyndrome;
	}
	public boolean isBellsPalsy() {
		return bellsPalsy;
	}
	public void setBellsPalsy(boolean bellsPalsy) {
		this.bellsPalsy = bellsPalsy;
	}
	public boolean isHeartCondition() {
		return heartCondition;
	}
	public void setHeartCondition(boolean heartCondition) {
		this.heartCondition = heartCondition;
	}
	public boolean isPregnacy() {
		return pregnacy;
	}
	public void setPregnacy(boolean pregnacy) {
		this.pregnacy = pregnacy;
	}
	public boolean isIntellectualDisabilities() {
		return intellectualDisabilities;
	}
	public void setIntellectualDisabilities(boolean intellectualDisabilities) {
		this.intellectualDisabilities = intellectualDisabilities;
	}
	public boolean isCancer() {
		return cancer;
	}
	public void setCancer(boolean cancer) {
		this.cancer = cancer;
	}
	public boolean isNote1() {
		return note1;
	}
	public void setNote1(boolean note1) {
		this.note1 = note1;
	}
	public boolean isNote2() {
		return note2;
	}
	public void setNote2(boolean note2) {
		this.note2 = note2;
	}
}
