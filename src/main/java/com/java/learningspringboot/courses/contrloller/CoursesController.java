package com.java.learningspringboot.courses.contrloller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.java.learningspringboot.courses.bean.Course;
import com.java.learningspringboot.repository.CourseRepository;

@RestController
public class CoursesController {
	
	@Autowired
	private CourseRepository repository;
	
	//http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getListofCourses() {
		return repository.findAll();
//		return List.of(new Course(1, "Java Book", "Vibham"),
//				new Course(2, "SpringBoot", "Shaily"));
	}
	
	@GetMapping("/courses/{id}")
	public Course getOneCourse(@PathVariable long id) {
		Optional<Course> course = repository.findById(id);
		//return new Course(2, "SpringBoot", "Shaily"); 
		if(course.isEmpty()) {
			throw new RuntimeException("Cannot found course with id : " +id);
		}
		return course.get();
	}
	
	@PostMapping("/courses")
	public void createCourse(@RequestBody Course course) {
		repository.save(course);
	}

	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id, @RequestBody Course course) {
		repository.save(course);
	}
	
	@DeleteMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id) {
		repository.deleteById(id);
	}

}
