package com.java.learningspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.learningspringboot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
