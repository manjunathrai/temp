package com.te.hibernate_manytoone;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyMain {
	public static void main(String[] args) {
		
	
	GirlEntitynew gl = new GirlEntitynew();
	gl.setId(420);
	gl.setName("Ash");
	
	BoyEntitynew b = new BoyEntitynew();
	b.setId(101);
	b.setName("Vivek");
	
	BoyEntitynew b1 = new BoyEntitynew();
	b1.setId(102);
	b1.setName("selmon");
	
	BoyEntitynew b2 = new BoyEntitynew();
	b2.setId(103);
	b2.setName("Abhi");
	b.setG(gl);
	b1.setG(gl);
	b2.setG(gl);
	
	List<BoyEntitynew> list = Arrays.asList(b,b1,b2);
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
