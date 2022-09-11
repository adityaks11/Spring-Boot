package com.cg.SpringDi;

public class Student {
	
	MathCheat m;
	
	public MathCheat getM() {
		return m;
	}

	public void setM(MathCheat m) {
		this.m = m;
	}

	void cheating() {
		m.cheat();
		
	}

}
