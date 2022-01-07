package com.te.Autowriningproj.ByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.Autowriningproj.ByType.Laptop;

public class MyClass {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
		NewLaptop bean = container.getBean(NewLaptop.class);
		System.out.println(bean);
	}

}
