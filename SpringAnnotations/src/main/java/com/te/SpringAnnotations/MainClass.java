package com.te.SpringAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
	 ApplicationContext container = new ClassPathXmlApplicationContext("Config.xml");
	 Salary bean = container.getBean(Salary.class);
	System.out.println(bean);
	}
}
