package vt;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class Visit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer visitId;
	private Long vacId;
	private Integer patId;
	private Integer proId;
	private String visitDate;
	private String reaction;
	private int dose;
}
