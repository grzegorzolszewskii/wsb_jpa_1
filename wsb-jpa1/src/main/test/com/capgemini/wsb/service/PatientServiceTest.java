package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.dto.VisitTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientService patientService;

    @Test
    public void testShouldFindPatientById() {
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

    @Test
    public void testShouldDeletePatient() {
        // given

        // when
        patientService.deletePatient(1);

        // then
        assertNull(patientService.findById(1));
    }

    @Test
    public void testShouldFindVisitsByPatientId() {
        // given

        // when
        PatientTO patientTO = patientService.findById(5);
        List<VisitTO> visitTOs = patientService.findVisitsByPatientId(5);

        // then
        assertFalse(patientTO.getVisits().isEmpty());
        assertEquals(1, visitTOs.size());
    }
}