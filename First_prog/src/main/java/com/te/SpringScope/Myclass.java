package com.te.SpringScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Myclass {
 public static void main(String[] args) {
	ApplicationContext cont = new ClassPathXmlApplicationContext("Config.xml");
	Demo bean = cont.getBean(Demo.class);
	System.out.println(bean);
	Demo bean2 = cont.getBean(Demo.class);
	System.out.println(bean2);
 }
}
