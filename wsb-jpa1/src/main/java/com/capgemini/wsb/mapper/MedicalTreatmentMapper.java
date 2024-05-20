package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.MedicalTreatmentTO;
import com.capgemini.wsb.persistence.entity.MedicalTreatmentEntity;
import com.capgemini.wsb.persistence.enums.TreatmentType;

public final class MedicalTreatmentMapper {

    public static MedicalTreatmentTO mapToTO(final MedicalTreatmentEntity medicalTreatmentEntity) {
        if (medicalTreatmentEntity == null) {
            return null;
        }

        final MedicalTreatmentTO medicalTreatmentTO = new MedicalTreatmentTO();
        medicalTreatmentTO.setId(medicalTreatmentEntity.getId());
        medicalTreatmentTO.setDescription(medicalTreatmentEntity.getDescription());
        medicalTreatmentTO.setType(medicalTreatmentEntity.getType());

        return medicalTreatmentTO;
    }

    public static MedicalTreatmentEntity mapToEntity(final MedicalTreatmentTO medicalTreatmentTo) {
        if (medicalTreatmentTo == null) {
            return null;
        }

        MedicalTreatmentEntity medicalTreatmentEntity = new MedicalTreatmentEntity();
        medicalTreatmentEntity.setId(medicalTreatmentTo.getId());
        medicalTreatmentEntity.setDescription(medicalTreatmentTo.getDescription());
        medicalTreatmentEntity.setType(medicalTreatmentTo.getType());

        return medicalTreatmentEntity;
    }
}