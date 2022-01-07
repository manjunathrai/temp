package com.te.hibernate_onetomanymapping;

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
    	GirlEntity gl = new GirlEntity();
    	gl.setId(420);
    	gl.setName("Ash");
    	
    	BoyEntity b = new BoyEntity();
    	b.setId(101);
    	b.setName("Vivek");
    	
    	BoyEntity b1 = new BoyEntity();
    	b1.setId(102);
    	b1.setName("selmon");
    	
    	BoyEntity b2 = new BoyEntity();
    	b2.setId(103);
    	b2.setName("Abhi");
    	
    	List<BoyEntity> list = Arrays.asList(b,b1,b2);
    	gl.setB(list);
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetomany");
    	EntityManager em= emf.createEntityManager();
    	EntityTransaction trans = em.getTransaction();
    	trans.begin();
    	em.persist(gl);
    	em.persist(b);
    	em.persist(b1);
    	em.persist(b2);
    	trans.commit();
    }
}
