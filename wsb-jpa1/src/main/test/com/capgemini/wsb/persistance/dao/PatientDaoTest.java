package com.capgemini.wsb.persistance.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.dao.PatientDao;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientDaoTest {

    @Autowired
    private PatientDao patientDao;

    @Test
    public void testShouldFindByLastName(){
        // given resources/data.sql
        // when
        List<PatientEntity> patientsList = patientDao.findByLastName("Medyczna");

        // then
        assertThat(patientsList).hasSize(1);
    }

    @Test
     public void testShouldFindPatientsWithMoreVisitsThan(){
        // given - only patient with id 1 has 2 visits, the rest have 1 visit
        // when
        List<PatientEntity> patientsList = patientDao.findPatientsWithMoreVisitsThan(1);
        // then
        assertThat(patientsList).hasSize(1);
     }

    public void testShouldFindByEmploymentType(){
        // given resources/data.sql
        // when

        // then
    }
}
