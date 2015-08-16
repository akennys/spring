package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ValidateUser;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/com/service/beans.xml");
		ValidateUser check = (ValidateUser)ac.getBean("check");
		System.out.println(check.check("¿µ¿µ"));
		
	}
}
