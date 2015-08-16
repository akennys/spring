package com.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class UserService implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean{
	private String name;
	/*private ByeService byeService;*/
	
	public UserService(){
		System.out.println("构造方法执行");
	}
	/*public ByeService getByeService() {
		return byeService;
	}

	public void setByeService(ByeService byeService) {
		this.byeService = byeService;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName方法执行");
		this.name = name;
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("执行BeanNameAware 方法 " + arg0);
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("执行ApplicationContextAware 方法 " + arg0);		
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("执行BeanFactoryAware 方法 " + arg0);		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("执行afterPropertiesSet 方法");
	}
	
	public void init(){
		System.out.println("我自己的init方法");
	}
	public void destory(){
		System.out.println("我自己的destory方法");
	}
	/*public void sayHello(){
		System.out.println("hello " + name);
		byeService.sayBye();
	}*/
	
	
}
