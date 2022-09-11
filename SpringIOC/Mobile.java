package com.cg.area;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("Beans.xml");
		
		/*
		 * Airtel a= c.getBean ("airtel", Airtel.class); a.Calling(); a.Data();
		 * 
		 * Jio j=(Jio) c.getBean("jio"); j.Calling(); j.Data();
		 */
		
		Sim s= c.getBean("sim", Sim.class);
		s.Calling();
		s.Data();
	}

}
