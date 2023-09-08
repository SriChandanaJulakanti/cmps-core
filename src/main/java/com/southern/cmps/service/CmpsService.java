package com.southern.cmps.service;

import java.util.List;

import com.southern.cmps.domain.Concentration;
import com.southern.cmps.domain.Student;
import com.southern.cmps.service.exception.CmpsException;

public interface CmpsService {

	public Student getStudentDetail(String uNumber) throws CmpsException;
	
	public List<Concentration> getConcentrations() throws CmpsException;
	
	
}
