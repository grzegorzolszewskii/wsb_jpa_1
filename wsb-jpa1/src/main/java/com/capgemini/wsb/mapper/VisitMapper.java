package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.persistence.entity.VisitEntity;

import java.util.stream.Collectors;

public class VisitMapper {

    public static VisitTO mapToTO(final VisitEntity visitEntity)
    {
        if (visitEntity == null)
        {
            return null;
        }

        final VisitTO visitTO = new VisitTO();
        visitTO.setId(visitEntity.getId());
        visitTO.setDescription(visitEntity.getDescription());
        visitTO.setDoctor(DoctorMapper.mapToTO(visitEntity.getDoctor()));
        visitTO.setPatient(PatientMapper.mapToTO(visitEntity.getPatient()));

        visitTO.setMedicalTreatments(visitEntity.getMedicalTreatments().stream()
                .map(MedicalTreatmentMapper::mapToTO)
                .collect(Collectors.toList()));

        return visitTO;
    }

    public static VisitEntity mapToEntity(final VisitTO visitTo)
    {
        if(visitTo == null)
        {
            return null;
        }

        VisitEntity visitEntity = new VisitEntity();
        visitEntity.setId(visitTo.getId());
        visitEntity.setDescription(visitTo.getDescription());
        visitEntity.setDoctor(DoctorMapper.mapToEntity(visitTo.getDoctor()));
        visitEntity.setPatient(PatientMapper.mapToEntity(visitTo.getPatient()));

        visitEntity.setMedicalTreatments(visitTo.getMedicalTreatments().stream()
                .map(MedicalTreatmentMapper::mapToEntity)
                .collect(Collectors.toList()));

        return visitEntity;
    }
}
