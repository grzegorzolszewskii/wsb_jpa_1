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
    public void testShouldFindByFirstName(){
        // given resources/data.sql - jest 2 pacjentow o imieniu Leszek
        // when
        List<PatientEntity> patientsList = patientDao.findByFirstName("Leszek");

        // then
        assertThat(patientsList).hasSize(2);
    }

    @Test
    public void testShouldFindByLastName() {
        // given resources/data.sql - jest 2 pacjentow o naziwsku Zdolny
        // when
        List<PatientEntity> patientsList = patientDao.findByLastName("Zdolny");

        // then
        assertThat(patientsList).hasSize(2);
    }

    @Test
     public void testShouldFindPatientsWithMoreVisitsThan(){
        // given - tylko jeden pacjent ma wiecej niz jedna wizyte
        // when
        List<PatientEntity> patientsList = patientDao.findPatientsWithMoreVisitsThan(1);
        // then
        assertThat(patientsList).hasSize(1);
     }

     @Test
    public void testShouldFindByEmploymentType(){
        // given - 7 pacjentow jest zatrudnionych
        // when
        List<PatientEntity> patientsList = patientDao.findByEmploymentType(true);

        // then
        assertThat(patientsList).hasSize(7);
    }
}
