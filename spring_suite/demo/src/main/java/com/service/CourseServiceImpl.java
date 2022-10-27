package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.entity.Course;
@Service
public class CourseServiceImpl implements CourseInterface {

	List<Course> list;
	
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(14,"java","learn java"));
		list.add(new Course(15,"spring","learn spring"));
	}


	@Override
	public List<Course> addCourse(Course course) {
		list.add(course);
		return list;
	}


	@Override
	public void deleteCourse(int id) {
		// TODO Auto-generated method stub
		list=this.list.stream().filter(e->e.getId()==id).collect(Collectors.toList());
	}


//	@Override
//	public Course updateCourse(Course course) {
//		list.forEach(e->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDesc(course.getDesc());
//			}
//		});
//		return course;
//	}


	

}
