package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;

import java.util.stream.Collectors;

public final class PatientMapper
{

    public static PatientTO mapToTO(final PatientEntity patientEntity)
    {
        if (patientEntity == null)
        {
            return null;
        }
        final PatientTO patientTO = new PatientTO();
        patientTO.setId(patientEntity.getId());
        patientTO.setFirstName(patientEntity.getFirstName());
        patientTO.setLastName(patientEntity.getLastName());
        patientTO.setTelephoneNumber(patientEntity.getTelephoneNumber());
        patientTO.setEmail(patientEntity.getEmail());
        patientTO.setPatientNumber(patientEntity.getPatientNumber());
        patientTO.setDateOfBirth(patientEntity.getDateOfBirth());
        patientTO.setIsEmployed(patientEntity.getIsEmployed());

        patientTO.setAddress(AddressMapper.mapToTO(patientEntity.getAddress()));

        patientTO.setVisits(patientEntity.getVisits().stream()
                .map(VisitMapper::mapToTO)
                .collect(Collectors.toList()));


        return patientTO;
    }

    public static PatientEntity mapToEntity(final PatientTO patientTo)
    {
        if(patientTo == null)
        {
            return null;
        }

        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setId(patientTo.getId());
        patientEntity.setFirstName(patientTo.getFirstName());
        patientEntity.setLastName(patientTo.getLastName());
        patientEntity.setTelephoneNumber(patientTo.getTelephoneNumber());
        patientEntity.setEmail(patientTo.getEmail());
        patientEntity.setPatientNumber(patientTo.getPatientNumber());
        patientEntity.setDateOfBirth(patientTo.getDateOfBirth());
        patientEntity.setIsEmployed(patientTo.getIsEmployed());

        patientEntity.setAddress(AddressMapper.mapToEntity(patientTo.getAddress()));

        patientEntity.setVisits(patientTo.getVisits().stream()
                .map(VisitMapper::mapToEntity)
                .collect(Collectors.toList()));

        return patientEntity;
    }
}