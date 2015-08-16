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
		System.out.println("���췽��ִ��");
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
		System.out.println("setName����ִ��");
		this.name = name;
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("ִ��BeanNameAware ���� " + arg0);
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("ִ��ApplicationContextAware ���� " + arg0);		
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("ִ��BeanFactoryAware ���� " + arg0);		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("ִ��afterPropertiesSet ����");
	}
	
	public void init(){
		System.out.println("���Լ���init����");
	}
	public void destory(){
		System.out.println("���Լ���destory����");
	}
	/*public void sayHello(){
		System.out.println("hello " + name);
		byeService.sayBye();
	}*/
	
	
}
