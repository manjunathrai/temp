package com.te.Springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.Springbean.beanConfiguration.*;

public class MainClass {
	public static void main(String[] args) {
//		ApplicationContext container = new AnnotationConfigApplicationContext(ConfigClass.class);
		ApplicationContext container = new AnnotationConfigApplicationContext(ComponentConfig.class);
		Pet pet = container.getBean(Pet.class);
		pet.myPet();
	}

}
