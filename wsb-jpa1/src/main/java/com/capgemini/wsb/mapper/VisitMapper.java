package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.persistence.entity.VisitEntity;

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

        // jak zmapowac medical treatment?

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

        // jak i czy zmapowac medical treatment?

        return visitEntity;
    }
}
