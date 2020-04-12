package com.admin_client.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin_client.dao.SchoolDao;
import com.admin_client.model.School;
import com.admin_client.service.SchoolService;

@Service
public class SchoolServiceImpl implements SchoolService{

	@Autowired
	SchoolDao schdao;
	

	
	@Override
	public String addSchool(School sch) {

		schdao.save(sch);
		return "added ";
	}

	@Override
	public List<School> getSchools() {
		return schdao.findAll();
	}

	@Override
	public School findSchool(int sch_id) {


		System.out.println("Service "+sch_id);
		return schdao.findById(sch_id).get();
		/*
		if(schdao.existsById(sch_id))
				return schdao.findById(sch_id).get();
		else
			return new School(12,"Unkonw");
*/	}
}
