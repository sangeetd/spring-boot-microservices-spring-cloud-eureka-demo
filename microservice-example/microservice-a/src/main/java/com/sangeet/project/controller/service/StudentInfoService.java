package com.sangeet.project.controller.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.sangeet.project.controller.microservicemodels.CirriculumData;
import com.sangeet.project.controller.microservicemodels.CourseData;
import com.sangeet.project.controller.model.StudentData;

@Service
public class StudentInfoService {

	@Autowired
	private RestTemplate restCall;

	@Autowired
	private WebClient.Builder webClientBuilder;

	public List<StudentData> getStudentDataById(String id) {

		// generate course list
		// RestTemplate Way of calling rest apis
		//just an example
//		List<CourseData> getCourseData = Arrays.asList(
//				restCall.getForObject("http://localhost:8082/b-app/api/b/getCourseListById/" + id, CourseData[].class));

		// WebClient way of calling rest apis -- newer spring boot way
		List<CourseData> getCourseDataViaWebClient = Arrays
				.asList(webClientBuilder.build().get().uri("http://localhost:8082/b-app/api/b/getCourseListById/" + id)
						.retrieve().bodyToMono(CourseData[].class).block());

		// getCourseData.stream().forEach(cdata ->
		// System.out.println(cdata.getCourse()));
		// getCourseDataViaWebClient.stream().forEach(cdata ->
		// System.out.println(cdata.getCourse()));

		// generate cirr list
		List<CirriculumData> getCirriculumDataViaWebClient = Arrays.asList(
				webClientBuilder.build().get().uri("http://localhost:8083/c-app/api/c/getCirriculumListById/" + id)
						.retrieve().bodyToMono(CirriculumData[].class).block());

		// immiating student database here
		List<StudentData> StudentData_Database = Arrays.asList(
				new StudentData(1l, "Rio", getCourseDataViaWebClient, getCirriculumDataViaWebClient),
				new StudentData(2l, "Denver", getCourseDataViaWebClient, getCirriculumDataViaWebClient),
				new StudentData(3l, "Tokyo", getCourseDataViaWebClient, getCirriculumDataViaWebClient),
				new StudentData(4l, "Professor", getCourseDataViaWebClient, getCirriculumDataViaWebClient),
				new StudentData(5l, "Nirobi", getCourseDataViaWebClient, getCirriculumDataViaWebClient)
		);

		// prepare studentinfo data list
		//StudentData_Database.stream().forEach(sdata -> System.out.println(sdata.getId()));
		
		return  StudentData_Database.stream()
				.filter( sdata -> sdata.getId()==Long.parseLong(id))
				.collect(Collectors.toList());

	}

	public List<StudentData> getStudentDataByIdViaEurekaServerReg(String id) {

		// generate course list
		// RestTemplate Way of calling rest apis
		//just an example
//		List<CourseData> getCourseData = Arrays.asList(
//				restCall.getForObject("http://localhost:8082/b-app/api/b/getCourseListById/" + id, CourseData[].class));

		// WebClient way of calling rest apis -- newer spring boot way
		List<CourseData> getCourseDataViaWebClient = Arrays
				.asList(webClientBuilder.build().get().uri("http://microservice-b/b-app/api/b/getCourseListById/" + id)
						.retrieve().bodyToMono(CourseData[].class).block());

		// getCourseData.stream().forEach(cdata ->
		// System.out.println(cdata.getCourse()));
		// getCourseDataViaWebClient.stream().forEach(cdata ->
		// System.out.println(cdata.getCourse()));

		// generate cirr list
		List<CirriculumData> getCirriculumDataViaWebClient = Arrays.asList(
				webClientBuilder.build().get().uri("http://microservice-c/c-app/api/c/getCirriculumListById/" + id)
						.retrieve().bodyToMono(CirriculumData[].class).block());

		// immiating student database here
		List<StudentData> StudentData_Database = Arrays.asList(
				new StudentData(1l, "Rio", getCourseDataViaWebClient, getCirriculumDataViaWebClient),
				new StudentData(2l, "Denver", getCourseDataViaWebClient, getCirriculumDataViaWebClient),
				new StudentData(3l, "Tokyo", getCourseDataViaWebClient, getCirriculumDataViaWebClient),
				new StudentData(4l, "Professor", getCourseDataViaWebClient, getCirriculumDataViaWebClient),
				new StudentData(5l, "Nirobi", getCourseDataViaWebClient, getCirriculumDataViaWebClient)
		);

		// prepare studentinfo data list
		//StudentData_Database.stream().forEach(sdata -> System.out.println(sdata.getId()));
		
		return  StudentData_Database.stream()
				.filter( sdata -> sdata.getId()==Long.parseLong(id))
				.collect(Collectors.toList());

	}
	
}
