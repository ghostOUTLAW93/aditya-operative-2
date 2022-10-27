package com.service;

import java.util.List;

import com.entity.Course;

public interface CourseInterface {

	public List<Course> addCourse(Course course);
	//public Course updateCourse(int id);
	public void deleteCourse(int id);
}
