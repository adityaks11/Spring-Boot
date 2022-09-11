package com.cg.SpringDi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("Beans.xml");
		
		Student s = c.getBean("student", Student.class);
		s.cheating();
		Friend s1 = c.getBean("friend", Friend.class);
		s1.startcheating();
		
	}

}
