package com.sangeet.project.controller.microservicemodels;

public class CirriculumData {

	private String cirr;
	private String desc;
	private String grade;
	
	public CirriculumData() {
		super();
	}
	
	public CirriculumData(String cirr, String desc, String grade) {
		super();
		this.cirr = cirr;
		this.desc = desc;
		this.grade = grade;
	}
	public String getCirr() {
		return cirr;
	}
	public void setCirr(String cirr) {
		this.cirr = cirr;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
	
	
}