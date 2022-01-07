package com.te.Autowriningproj.ByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClass 
{
    public static void main( String[] args )
    {
    	ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
    	Laptop bean = container.getBean(Laptop.class);
    	System.out.println(bean);
    }
}
