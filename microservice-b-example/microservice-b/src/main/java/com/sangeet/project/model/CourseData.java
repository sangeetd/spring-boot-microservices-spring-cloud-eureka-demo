package com.sangeet.project.model;

public class CourseData {

	private String course;
	private String desc;
	private Long fee;
	
	public CourseData() {
		super();
	}
	
	public CourseData(String course, String desc, Long fee) {
		super();
		this.course = course;
		this.desc = desc;
		this.fee = fee;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Long getFee() {
		return fee;
	}
	public void setFee(Long fee) {
		this.fee = fee;
	}
	
	
	
}
