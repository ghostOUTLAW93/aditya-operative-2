package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Course;
import com.service.CourseInterface;

@RestController
public class MyController {
	
	@Autowired
	private CourseInterface courseService;
	
	@PostMapping("/courses")
	public List<Course> addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
		
	}
	
//	@PutMapping("/courses")
//	public Course updatedCourse(@RequestBody Course course) {
//		return this.courseService.updateCourse(course);
//	}
	
	@DeleteMapping("/course/{id}")
		public ResponseEntity<HttpStatus>delete(@PathVariable String id){
		try {
			this.courseService.deleteCourse(Integer.parseInt(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	}

