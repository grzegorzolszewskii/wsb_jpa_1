package com.capgemini.wsb.persistence.dao;

import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;

import java.util.List;

public interface PatientDao extends Dao<PatientEntity, Long>
{
    List<PatientEntity> findByFirstName(String firstName);

    List<PatientEntity> findByLastName(String lastName);

    List<VisitEntity> findVisitsByPatientId(Long id);

    List<PatientEntity> findPatientsWithMoreVisitsThan(Long visitsNum);

    List<PatientEntity> findByEmploymentType(Boolean employmentType);
}
