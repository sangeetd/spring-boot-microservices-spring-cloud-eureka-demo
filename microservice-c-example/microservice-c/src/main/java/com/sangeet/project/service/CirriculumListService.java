package com.sangeet.project.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sangeet.project.model.CirriculumData;

@Service
public class CirriculumListService {

	public List<CirriculumData> getCirriculumData(String id){
		
		List<CirriculumData> dataList = Arrays.asList(
				
				new CirriculumData("Cirr A", "Desc A", "A"),
				new CirriculumData("Cirr B", "Desc B", "B"),
				new CirriculumData("Cirr C", "Desc C", "C")
				
				);
		
		return dataList;
		
	}
	
}
