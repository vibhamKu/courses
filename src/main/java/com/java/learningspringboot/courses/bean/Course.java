package com.java.learningspringboot.courses.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String author;
	
	public Course() {}
	
	public Course(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}
	
	public String toString() {
		return "Courses [ id : " + id + ", name : " + name + ", author : " + author + "]";
	}
	
	

}
