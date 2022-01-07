package com.te.Autowiringproj.ByConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClass {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("configuration.xml");
		LapTop bean = container.getBean(LapTop.class);
		System.out.println(bean);
	}

}
