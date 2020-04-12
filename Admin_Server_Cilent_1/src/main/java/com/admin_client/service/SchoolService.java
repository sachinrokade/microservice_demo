package com.admin_client.service;

import java.util.List;

import com.admin_client.model.School;

public interface SchoolService {

	public String addSchool(School sch);
	public List<School> getSchools();
	public School findSchool(int sch_id);
}
