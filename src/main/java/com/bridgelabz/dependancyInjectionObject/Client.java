package com.bridgelabz.dependancyInjectionObject;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("cheating.xml");
	System.out.println("xml file is running");
	Student student = context.getBean("student",Student.class);
	student.Cheating();
	AnotherStudent anotherStudent = context.getBean("anotherStudent",AnotherStudent.class);
	anotherStudent.startCheating();
}
}
