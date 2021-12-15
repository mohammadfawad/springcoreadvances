package com.springframework.springcoreadvances.stereotype.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereotypeAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/springframework/springcoreadvances/stereotype/Annotation/stereotypeAnnotationConfig.xml");
		Instructor instructor = (Instructor) context.getBean("BiologyInstructor");
		System.out.println("\n\n Stereotype Annotation @Component :: with XML \n <context:component-scan base-package=\"com.springframework.springcoreadvances.stereotype.Annotation\"/>\n" + instructor);
		
		Instructor instructor0 = (Instructor) context.getBean("BiologyInstructor");
		System.out.println("\n\n Stereotype Annotation @Component Bean Scope HashCode :: \n" + instructor0.hashCode());
		
		Instructor instructor1 = (Instructor) context.getBean("BiologyInstructor");
		System.out.println("\n\n Stereotype Annotation @Component Bean Scope HashCode :: \n" + instructor1.hashCode());

	}

}
