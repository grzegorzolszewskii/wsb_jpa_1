package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.PatientTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientService patientService;

    @Test
    public void FindById() {
        // given
        PatientTO patientTO = patientService.findById(5);
        // when

        //then
        assertEquals("Ewa", patientTO.getFirstName());
        assertEquals("Biegająca", patientTO.getLastName());
        assertEquals("999999", patientTO.getTelephoneNumber());
        assertEquals("ewa@biegajaca.com", patientTO.getEmail());
        assertEquals("105", patientTO.getPatientNumber());
        assertEquals(true, patientTO.getIsEmployed());
    }
}