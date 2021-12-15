package com.springframework.springcoreadvances.stereotype.Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
	@Value("#{'JAVA WEB SPRING BOOT DEVELOPER.'.toLowerCase()}")
	private String jobTitle = "LECTURER.";
	@Value("#{new java.lang.String('ELIXER TECHNOLOGIES ISLAMABAD.').toLowerCase()}")
	private String institute = "CIIT ISLAMABAD.";
	//@Value("#{0 > T(java.lang.Integer).MIN_VALUE}")
	@Value("#{0 > T(java.lang.Integer).MIN_VALUE ? true:false}")
	private boolean isActive;

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Profile [jobTitle=" + jobTitle + ", institute=" + institute + ", isActive=" + isActive + "]";
	}

}
