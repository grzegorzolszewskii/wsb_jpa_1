package com.capgemini.wsb.persistence.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "VISIT")
public class VisitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "description")
	private String description;

	@Column(name = "time", nullable = false)
	private LocalDateTime time;

	// Relacja many to one z Doctor
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private DoctorEntity doctor;

	// Relacja many to one z Patient
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private PatientEntity patient;

	// Relacja one to many z MedicalTreatment
	@OneToMany(mappedBy = "visit")
	private List<MedicalTreatmentEntity> medicalTreatments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

}
