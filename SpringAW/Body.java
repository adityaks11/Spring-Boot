package com.cg.aw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("Beans.xml");
		Human h= c.getBean ("human", Human.class);
		h.Startpumping();
		
	}

}
