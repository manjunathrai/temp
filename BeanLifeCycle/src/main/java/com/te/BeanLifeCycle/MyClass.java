package com.te.BeanLifeCycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
@Myannotation
public class MyClass 
{
    public static void main( String[] args )
    {
    	//ConfigurableApplicationContext con =  new AnnotationConfigApplicationContext(config.class);
    	AbstractApplicationContext con = new AnnotationConfigApplicationContext(config.class);
    	con.registerShutdownHook();//works with abstractApplicationcontext to destroy bean after completing process automatically
    	Demo bean = (Demo)con.getBean("demo");
    	bean.name();
    	bean.name();
    //	abs.close();
    	
    }
}
