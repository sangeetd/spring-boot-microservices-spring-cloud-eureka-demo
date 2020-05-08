package com.sangeet.project.controller.model;

import java.util.List;

import com.sangeet.project.controller.microservicemodels.CirriculumData;
import com.sangeet.project.controller.microservicemodels.CourseData;

public class StudentData {

	private Long id;
	private String name;
	private List<CourseData> courseList;
	private List<CirriculumData> cirrList;
	
	public StudentData() {
		super();
	}
	
	public StudentData(Long id, String name, List<CourseData> courseList, List<CirriculumData> cirrList) {
		super();
		this.id = id;
		this.name = name;
		this.courseList = courseList;
		this.cirrList = cirrList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CourseData> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<CourseData> courseList) {
		this.courseList = courseList;
	}

	public List<CirriculumData> getCirrList() {
		return cirrList;
	}

	public void setCirrList(List<CirriculumData> cirrList) {
		this.cirrList = cirrList;
	}
	
	
	
}
