package com.bridgelabz.dependancyInjectionObject;

public class Student {
    private int id;
	private MathCheat mathCheat;
	
	
	public void setId(int id) {
		this.id = id;
	}

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void Cheating()
	{
		mathCheat.mathCheat(); 
		System.out.println("my id is "+id+" do whatever want you do...");
	}
}
