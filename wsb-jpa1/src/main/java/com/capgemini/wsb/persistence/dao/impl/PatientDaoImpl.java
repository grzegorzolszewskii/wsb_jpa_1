package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientDaoImpl extends AbstractDao<PatientEntity, Integer> implements PatientDao
{

    @Override
    public List<PatientEntity> findByFirstName(String firstName) {
        return entityManager.createQuery("SELECT p FROM PatientEntity p " +
                        "WHERE p.firstName LIKE :firstName", PatientEntity.class)
                .setParameter("firstName", firstName)
                .getResultList();
    }

    @Override
    public List<PatientEntity> findByLastName(String lastName) {
        return entityManager.createQuery("SELECT p FROM PatientEntity p " +
                        "WHERE p.lastName = :lastName", PatientEntity.class)
                .setParameter("lastName", lastName)
                .getResultList();
    }

    @Override
    public List<VisitEntity> findVisitsByPatientId(Integer id) {
        return entityManager.createQuery("SELECT v FROM VisitEntity v " +
                        "WHERE v.patient.id = :id", VisitEntity.class)
                .setParameter("id", id)
                .getResultList();
    }

    @Override
    public List<PatientEntity> findPatientsWithMoreVisitsThan(Integer visitsNum) {
        return entityManager.createQuery("SELECT p FROM PatientEntity p " +
                        "WHERE SIZE(p.visits) > :visitsNum", PatientEntity.class)
                .setParameter("visitsNum", visitsNum)
                .getResultList();
    }

    @Override
    public List<PatientEntity> findByEmploymentType(Boolean employmentType) {
        return entityManager.createQuery("SELECT p from PatientEntity p " +
                        "WHERE p.isEmployed = :employmentType", PatientEntity.class)
                .setParameter("employmentType", employmentType)
                .getResultList();
    }
}
