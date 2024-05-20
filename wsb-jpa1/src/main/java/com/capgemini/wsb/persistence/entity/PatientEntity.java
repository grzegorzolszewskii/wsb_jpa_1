package com.capgemini.wsb.persistence.entity;

import com.capgemini.wsb.dto.AddressTO;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "PATIENT")
public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "firstName", nullable = false)
	private String firstName;

	@Column(name = "lastName", nullable = false)
	private String lastName;

	@Column(name = "telephoneNumber", nullable = false)
	private String telephoneNumber;

	@Column(name = "email")
	private String email;

	@Column(name = "patientNumber", nullable = false)
	private String patientNumber;

	@Column(name = "dateOfBirth", nullable = false)
	private LocalDate dateOfBirth;

	@Column(name = "isEmployed")
	private Boolean isEmployed;

	// Relacja one to one z Address - jednostronna od strony rodzica
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", nullable = false)
	private AddressEntity address;

	// Relacja one to many z Visit - dwustronna
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patient")
	private List<VisitEntity> visits;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPatientNumber() {
		return patientNumber;
	}

	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Boolean getIsEmployed(){
		return isEmployed;
	}

	public void setIsEmployed(Boolean isEmployed){
		this.isEmployed = isEmployed;
	}

	public List<VisitEntity> getVisits() {
		return visits;
	}

	public void setVisits(List<VisitEntity> visits) {
		this.visits = visits;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}
}
