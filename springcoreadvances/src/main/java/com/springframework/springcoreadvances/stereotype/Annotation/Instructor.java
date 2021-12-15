package com.springframework.springcoreadvances.stereotype.Annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("BiologyInstructor")
@Scope("prototype")
public class Instructor {
	//@Value("#{T(java.lang.Math).abs(111 - 222)}")
	//@Value("#{new Integer(999)}")
	//@Value("#{T(java.lang.Integer).MAX_VALUE}")
	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int id = 111;
	@Value("Mohammad Fawad")
	private String name = "Jhon Methew";
	@Value("#{courses}")
	private List<String> courses;
	@Autowired
	private Profile profile;

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", courses=" + courses + ", profile=" + profile + "]";
	}

}
