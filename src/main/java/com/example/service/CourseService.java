package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Course;
import com.example.mapper.CourseMapper;

@Service
public class CourseService {
	private final CourseMapper courseMapper;
	
	@Autowired
	public CourseService(CourseMapper courseMapper) {
		this.courseMapper = courseMapper;
	}
	
	public List<Course> findAll(){
		return this.courseMapper.findAll();
	}
	
	public void insert(String name) {
		Course course = new Course();
		course.setName(name);
		this.courseMapper.insert(course);
	}
	
	public Course findById(Integer id) {
		return this.courseMapper.findById(id);
	}
	
	public void update(Integer id, String name) {
		Course course = new Course();
		course.setId(id);
		course.setName(name);
		this.courseMapper.update(course);
	}

}