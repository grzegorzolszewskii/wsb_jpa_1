package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.persistence.entity.DoctorEntity;
import com.capgemini.wsb.dto.DoctorTO;
import com.capgemini.wsb.persistence.entity.VisitEntity;

import java.util.stream.Collectors;

public final class DoctorMapper
{
    public static DoctorTO mapToTO(final DoctorEntity doctorEntity)
    {
        if (doctorEntity == null)
        {
            return null;
        }
        final DoctorTO doctorTO = new DoctorTO();
        doctorTO.setId(doctorEntity.getId());
        doctorTO.setFirstName(doctorEntity.getFirstName());
        doctorTO.setLastName(doctorEntity.getLastName());
        doctorTO.setTelephoneNumber(doctorEntity.getTelephoneNumber());
        doctorTO.setEmail(doctorEntity.getEmail());
        doctorTO.setAddress(AddressMapper.mapToTO(doctorEntity.getAddress()));

        // Entity przechowuje liste encji, TO przechowuje liste ID
        doctorTO.setVisitsById(doctorEntity.getVisits().stream()
                .map(VisitEntity::getId).collect(Collectors.toList())
        );

        return doctorTO;
    }

    public static DoctorEntity mapToEntity(final DoctorTO doctorTO)
    {
        if (doctorTO == null)
        {
            return null;
        }
        final DoctorEntity doctorEntity = new DoctorEntity();
        doctorEntity.setId(doctorTO.getId());
        doctorEntity.setFirstName(doctorTO.getFirstName());
        doctorEntity.setLastName(doctorTO.getLastName());
        doctorEntity.setTelephoneNumber(doctorTO.getTelephoneNumber());
        doctorEntity.setEmail(doctorTO.getEmail());
        doctorEntity.setAddress(AddressMapper.mapToEntity(doctorTO.getAddress()));

        return doctorEntity;
    }
}