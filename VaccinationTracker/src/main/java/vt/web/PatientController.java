package vt.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import vt.HealthRecord;
import vt.Patient;
import vt.Visit;
import vt.data.HealthRecordService;
import vt.data.PatientRepository;
import vt.data.PatientService;
import vt.data.VisitService;

//Author: Nick Riley

@Controller
public class PatientController {
	
	@Autowired
	private PatientService patService;
	
	@Autowired
	private PatientRepository patRepo;
	
	@Autowired
	private HealthRecordService recordService;
	
	@Autowired
	private VisitService visitService;
	
	
	// Menu Page Mappings
	@GetMapping("/pageSelect")
	public String showSelect() {
		return "pageSelect";
	}
	@GetMapping("/id")
	public String showPatients(Model model) {
		List<Patient> patients = patService.listAll();
		model.addAttribute("patients", patients);
		
		List<HealthRecord> records = recordService.listAll();
		model.addAttribute("records", records);
		return "id";
	}
	
	// Patient Mappings
	@GetMapping("/patient")
	public String showPatient() {
		return "patient";
	}
	@GetMapping("/EditPatient")
	public String showEditPatient() {
		return "EditPatient";
	}
	@GetMapping("/patient/new")
	public String showPatientForm(Model model) {
		model.addAttribute("patient", new Patient());
		model.addAttribute("record", new HealthRecord());

		return "patient";
	}
	@GetMapping("/EditPatient/{id}")
	public ModelAndView showEditPatientForm(@PathVariable(name = "id") Long id) {
		ModelAndView mav = new ModelAndView("EditPatient");

		Patient patient = patService.get(id);
		HealthRecord record = recordService.get(id);
		Visit visit = visitService.get(id);
		mav.addObject("patient", patient);
		mav.addObject("record", record);
		mav.addObject("visit", visit);
				
		return mav;
	}
	@PostMapping("/patient/save")
	public String savePatient(Patient pat, HealthRecord hr) {
		
		patService.save(pat);
		recordService.save(hr);
		
		return "redirect:/visit";
	}
	@PostMapping("/edit")
	public String editPatient(Patient pat, HealthRecord hr) {
		
		patService.save(pat);
		recordService.save(hr);
		
		return "redirect:/pageSelect";
	}
	
	// Visit Mappings
	@GetMapping("/visit")
	public String showVisit(Model model) {
		model.addAttribute("visit", new Visit());
		return "visit";
	}
	@GetMapping("/editVisit/{id}")
	public ModelAndView showEditVisitForm(@PathVariable(name = "id") Long id) {
		
		ModelAndView mav = new ModelAndView("editVisit");

		List<Visit> visits = visitService.listAll();
		mav.addObject("visits", visits);
		
		Visit visit = visitService.get(id);
		mav.addObject("visit", visit);
				
		return mav;
	}
	@PostMapping("/visit/save")
	public String saveVisit(Visit vi) {

		visitService.save(vi);
		
		return "redirect:/pageSelect";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEntry(@PathVariable(name="id") Long id) {
		patService.delete(id);
		recordService.delete(id);
		visitService.delete(id);
		
		return "redirect:/id";
	}
	
	@GetMapping("/patient/find")
	public String findPatientByName(@Param("fName") String fName,
									@Param("lName") String lName, Model model) {
		Patient patient = patRepo.findByFnameAndLname(fName, lName);
		model.addAttribute(patient);
		return "id";
	}
	
	
}
