package com.te.mailsimulation.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Component
@EnableJpaRepositories(basePackages = {"com.te.mailsimulation"})
@EnableTransactionManagement
public class MailConfig {
	 @Bean
	    public LocalEntityManagerFactoryBean entityManagerFactory() {
	        LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
	        factoryBean.setPersistenceUnitName("mailsimulation");
	         
	        return factoryBean;
	    }
	     
	    @Bean
	    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
	        JpaTransactionManager transactionManager = new JpaTransactionManager();
	        transactionManager.setEntityManagerFactory(entityManagerFactory);
	         
	        return transactionManager;
	    }  

}
