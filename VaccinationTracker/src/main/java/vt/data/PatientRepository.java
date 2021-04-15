package vt.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import vt.Patient;

//Author: Nick Riley

public interface PatientRepository extends JpaRepository<Patient, Long> {
	Patient findByFnameAndLname(String firstName, String lastName);
}
