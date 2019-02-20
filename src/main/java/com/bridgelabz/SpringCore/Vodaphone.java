package com.bridgelabz.SpringCore;



public class Vodaphone implements Sim {
	public Vodaphone() {
		// TODO Auto-generated constructor stub
		System.out.println("Vodaphone constructor");
	}
	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling using Vodaphone");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Brousing using internet Vodaphone");
	}
}
