package com.te.BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Demo implements InitializingBean,DisposableBean {
	public Demo() {
		System.out.println("Bean is created");
}
	public void name() {
		System.out.println("After setting properties");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("From set properties");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("bean is distroyed");
	}

}
