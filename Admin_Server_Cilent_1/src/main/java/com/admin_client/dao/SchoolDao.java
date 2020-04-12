package com.admin_client.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin_client.model.School;
@Repository
public interface SchoolDao extends JpaRepository<School,Integer>{

}
