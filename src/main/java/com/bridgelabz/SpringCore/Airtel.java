package com.bridgelabz.SpringCore;

public class Airtel implements Sim {
	public Airtel() {
		// TODO Auto-generated constructor stub
		System.out.println("Airtel constructor");
	}
	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling using Airtel");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Brousing using internet Airtel");
	}

}
