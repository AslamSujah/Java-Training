package com.sujah.medicare.patientservice.controller;

import com.sujah.medicare.common.model.Patient;
import com.sujah.medicare.patientservice.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/services")
public class PatientController {

    @Autowired
    PatientService patientService;

    @RequestMapping(value = "/patient", method = RequestMethod.POST)
    public Patient save(@RequestBody Patient patient){
        return patientService.save(patient);
    }

    
}
