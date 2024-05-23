package com.capgemini.wsb.persistence.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "VISIT")
public class VisitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "description")
	private String description;

	@Column(name = "time", nullable = false)
	private LocalDateTime time;

	// Relacja many to one z Doctor - dwustronna
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private DoctorEntity doctor;

	// Relacja many to one z Patient - dwustronna
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private PatientEntity patient;

	// Relacja one to many z MedicalTreatment
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "visit_id")
	private List<MedicalTreatmentEntity> medicalTreatments;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public DoctorEntity getDoctor() {
		return doctor;
	}

	public void setDoctor(DoctorEntity doctor) {
		this.doctor = doctor;
	}

	public PatientEntity getPatient() {
		return patient;
	}

	public void setPatient(PatientEntity patient) {
		this.patient = patient;
	}

	public List<MedicalTreatmentEntity> getMedicalTreatments() {
		return medicalTreatments;
	}

	public void setMedicalTreatments(List<MedicalTreatmentEntity> medicalTreatments) {
		this.medicalTreatments = medicalTreatments;
	}

}
