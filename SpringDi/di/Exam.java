package com.cg.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext c =new ClassPathXmlApplicationContext("Beans.xml");
		
		Student s1=c.getBean("s", Student.class);
		s1.Display();
		
		Student s2=c.getBean("s2", Student.class);
		s2.Display();
	}

}
