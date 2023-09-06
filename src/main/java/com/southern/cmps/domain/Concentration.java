package com.southern.cmps.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Concentration {

	private Integer concentrationCode;
	private String name;
	private List<Course> courses;
	private String createdBy;
	private Date dateCreated;
	private String modifiedBy;
	private Date dateModified;
}
