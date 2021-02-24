package vt.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import vt.HealthRecord;
import vt.Patient;
import vt.User;
import vt.data.HealthRecordRepository;
import vt.data.PatientRepository;

//Author: Nick Riley

@Controller
public class PatientController {
	
	@Autowired
	private PatientRepository patient;
	
	@Autowired
	private HealthRecordRepository record;
	
	@GetMapping("/patient/new")
	public String showPatientForm(Model model) {
		model.addAttribute("patient", new Patient());
		model.addAttribute("healthRecord", new HealthRecord());
		
		return "new_patient";
	}
	
	@GetMapping("/patient/record")
	public String showHealthForm(Model model) {
		model.addAttribute("healthrecord", new HealthRecord());
		
		return "health_records";
	}
	
	@PostMapping("/patient/save")
	public String savePatient(Patient pat, HealthRecord hr) {
		
		patient.save(pat);
		record.save(hr);
		
		return "redirect:/homepage";
	}
}
