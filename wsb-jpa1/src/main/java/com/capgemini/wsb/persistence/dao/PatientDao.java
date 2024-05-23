package com.capgemini.wsb.persistence.dao;

import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;

import java.util.List;

public interface PatientDao extends Dao<PatientEntity, Integer>
{
    List<PatientEntity> findByFirstName(String firstName);

    List<PatientEntity> findByLastName(String lastName);

    List<VisitEntity> findVisitsByPatientId(Integer id);

    List<PatientEntity> findPatientsWithMoreVisitsThan(Integer visitsNum);

    List<PatientEntity> findByEmploymentType(Boolean employmentType);
}
