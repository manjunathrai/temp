package com.te.setterconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Driver {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("Configuration.xml");
		Car bean = app.getBean(Car.class);
		bean.move();
	}

}
