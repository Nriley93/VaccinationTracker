package vt;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import vt.data.HealthRecordRepository;
import vt.data.PatientRepository;

//Author: Nick Riley

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class PatientRepositoryTest {

	@Autowired
	private PatientRepository patientRepo;
	
	@Autowired
	private HealthRecordRepository recordRepo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreatePatient() {
		Patient pat = new Patient();
		pat.setFname("Nick");
		pat.setLname("Riley");
		pat.setAddress("1234 central");
		pat.setCity("St.Louis");
		pat.setZipcode("63021");	
		pat.setEmail("nickriley@outlook.com");
		pat.setPhone("3144482054");
		pat.setSex("Male");
		
		HealthRecord rec = new HealthRecord();
		rec.setPreconditions("cancer aids depression");
		rec.setFoodAllergy(null);
		rec.setDrugAllergy(null);
		rec.setPetAllergy(null);
		rec.setMedications("none");
		rec.setNotes("Patient is healthy");
		
		Patient savePat = patientRepo.save(pat);
		HealthRecord saveRec = recordRepo.save(rec);
		
		Patient existPat = entityManager.find(Patient.class, savePat.getPatId());
		HealthRecord existRec = entityManager.find(HealthRecord.class, saveRec.getHRID());
		
		assertThat(existPat.getEmail()).isEqualTo(pat.getEmail());
		assertThat(existRec.getPreconditions()).isEqualTo(rec.getPreconditions());
	}
}
