package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.service.UserService;

public class Test {
	public static void main(String[] args) {
//		UserService userSerivce = new UserService();
//		userSerivce.setName("平康");
//		userSerivce.sayHello();
		
		//得到spring的applicationContext对象
		/*ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us = (UserService)ac.getBean("userService");
		UserService us2 = (UserService)ac.getBean("userService");
		//us.sayHello();
		System.out.println(us);
		System.out.println(us2);
		System.out.println("123");*/
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		System.out.println(1234);
		UserService us1 = (UserService)ac.getBean("userService");
		//这是我的第一个dev的代码
		
	}
}
