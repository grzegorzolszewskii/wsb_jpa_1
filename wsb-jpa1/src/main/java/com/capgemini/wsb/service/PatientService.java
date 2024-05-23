package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.dto.VisitTO;

import java.util.List;

public interface PatientService
{
    public PatientTO findById(final Integer id);

    public void deletePatient(Integer id);

    public List<VisitTO> findVisitsByPatientId(Integer id);
}
