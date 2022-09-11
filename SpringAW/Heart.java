package com.cg.aw;

public class Heart {
	
	private String nameofanimal;
	private int numberofheart;
	
	
	public void Pumping() {
		System.out.println("Heartbeat");
		
	}
	public Heart() {
		System.out.println("Abhi is alive");
		
	}
	public String getNameofanimal() {
		return nameofanimal;
	}
	public void setNameofanimal(String nameofanimal) {
		this.nameofanimal = nameofanimal;
	}
	public int getNumberofheart() {
		return numberofheart;
	}
	public void setNumberofheart(int numberofheart) {
		this.numberofheart = numberofheart;
	}
	

}
