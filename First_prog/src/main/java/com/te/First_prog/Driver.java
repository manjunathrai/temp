package com.te.First_prog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext config = new ClassPathXmlApplicationContext("Configuration.xml");
		Car bean = config.getBean(Car.class);
		bean.move();
	}

}
