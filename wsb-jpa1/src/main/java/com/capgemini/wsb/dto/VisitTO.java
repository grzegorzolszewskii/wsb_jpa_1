package com.capgemini.wsb.dto;

import java.io.Serializable;
import java.util.List;

public class VisitTO implements Serializable
{
    private Integer id;
    private String description;
    private DoctorTO doctor;
    private PatientTO patient;
    private List<MedicalTreatmentTO> medicalTreatments;

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

    public DoctorTO getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorTO doctor) {
        this.doctor = doctor;
    }

    public PatientTO getPatient() {
        return patient;
    }

    public void setPatient(PatientTO patient) {
        this.patient = patient;
    }

    public List<MedicalTreatmentTO> getMedicalTreatments() {
        return medicalTreatments;
    }

    public void setMedicalTreatments(List<MedicalTreatmentTO> medicalTreatments) {
        this.medicalTreatments = medicalTreatments;
    }
}