package com.client.model;

public class School
{
	int sch_id;
	String name;
	public School(int sch_id, String name) {
		super();
		this.sch_id = sch_id;
		this.name = name;
	}
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getSch_id() {
		return sch_id;
	}
	public void setSch_id(int sch_id) {
		this.sch_id = sch_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "School [sch_id=" + sch_id + ", name=" + name + "]";
	}
}
