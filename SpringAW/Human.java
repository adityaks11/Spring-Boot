package com.cg.aw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	private Heart  heart;


	public Heart getHeart() {
		return heart;
	}
    
	@Qualifier("humanheart")
    @Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}


	public void Startpumping() {
		System.out.println("Name of Aniaml is:"+heart.getNameofanimal() );
		System.out.println("Number of Heart is:"+heart.getNumberofheart() );
		heart.Pumping();
		
	}
	
	

}
