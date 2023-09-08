package com.southern.cmps.dao;

import java.util.List;

import com.southern.cmps.domain.Concentration;
import com.southern.cmps.domain.Student;

public interface CmpsDao {
	
	public List<Concentration> getConcentrations();

	Student getStudentDetail(String uNumber);

}
