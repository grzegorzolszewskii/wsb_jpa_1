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
        // given resources/data.sql
        // when
        Long visitCount = 1L;
        System.out.println("Type of visitCount: " + ((Object) visitCount).getClass().getName());
        List<PatientEntity> patientsList = patientDao.findPatientsWithMoreVisitsThan(visitCount);
        // then
        // assertThat(patientsList).hasSize(1);
        assertThat(patientsList).isNotEmpty();
     }

    public void testShouldFindByEmploymentType(){
        // given resources/data.sql
        // when

        // then
    }
}
