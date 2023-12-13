package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.entity.Course;

@Mapper
public interface CourseMapper {
	public List<Course> findAll();
	
	public void insert(Course course);
	
	public Course findById(Integer id);
	
	public void update(Course course);
}
