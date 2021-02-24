package vt.data;

import org.springframework.data.jpa.repository.JpaRepository;

import vt.HealthRecord;

//Author: Nick Riley

public interface HealthRecordRepository extends JpaRepository<HealthRecord, Integer> {

}
