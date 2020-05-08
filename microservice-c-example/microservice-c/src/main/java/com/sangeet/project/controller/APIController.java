package com.sangeet.project.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangeet.project.service.CirriculumListService;

@RestController
@RequestMapping("/api/c")
public class APIController {

	//json template to be provided...
	/*
	{
		
		"id": {id},
		"name": "name",
		//from microservice-b
		"courseList": [
               {
					"course": "A",
					"desc": "desc",
					"fee": "amount"
               },
		       {
					"course": "A",
					"desc": "desc",
					"fee": "amount"
		       }	               
		],
		
		//from microservice-c
		"cirriculum": [
		               {
							"cirr": "A",
							"desc": "desc",
							"grade": "amount"
		               },
				       {
							"cirr": "A",
							"desc": "desc",
							"grade": "amount"
				       }	               
				]
		
		
	}
	*/
	
	@Autowired
	private CirriculumListService cirrListService;
	
	@GetMapping("/getCirriculumListById/{id}")
	public ResponseEntity<Object> getCirriculumListById(@PathParam("id") String id){
		return new ResponseEntity<>(cirrListService.getCirriculumData(id), HttpStatus.OK);
	}
	
}
