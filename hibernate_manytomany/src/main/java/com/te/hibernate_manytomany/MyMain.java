package com.te.hibernate_manytomany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyMain 
{
    public static void main( String[] args )
    {
    	Girl g1= new Girl();
    	g1.setId(1);
    	g1.setName("dingi");
    	
    	Girl g2 = new Girl();
    	g2.setId(2);
    	g2.setName("tanu");
    	
    	Boys b1= new Boys();
    	b1.setId(101);
    	b1.setBalance(10000);
    	b1.setName("Dinga");
    	
    	Boys b2 = new Boys();
    	b2.setId(102);
    	b2.setBalance(150000);
    	b2.setName("tarun");
    	
    	List<Boys> boys = Arrays.asList(b1,b2);
    	List<Girl> girls = Arrays.asList(g1,g2);
    	
    	b1.setGirls(girls);
    	b2.setGirls(girls);
    	g1.setBoys(boys);
    	g2.setBoys(boys);
    	 
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytomany");
    	EntityManager em = emf.createEntityManager();
    	EntityTransaction trans = em.getTransaction();
    	
    	trans.begin();
    	em.persist(b1);
    	em.persist(b2);
    	em.persist(g1);
    	em.persist(g2);
    	trans.commit();
    }
}
