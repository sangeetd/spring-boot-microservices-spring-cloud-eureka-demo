package com.sangeet.project.controller.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sangeet.project.controller.model.CourseData;

@Service
public class CourseListService {

	
	public List<CourseData> getCourseData(String id){
		
		List<CourseData> dataList = Arrays.asList(
				
				new CourseData("Course A", "Desc A", 230l),
				new CourseData("Course B", "Desc B", 450l),
				new CourseData("Course C", "Desc C", 120l)
				
				);
		
		return dataList;
		
	}
	
}
