package vt.data;

import org.springframework.data.jpa.repository.JpaRepository;

import vt.Patient;

//Author: Nick Riley

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
