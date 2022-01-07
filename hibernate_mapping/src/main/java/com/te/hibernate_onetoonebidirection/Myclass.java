package com.te.hibernate_onetoonebidirection;

import javax.persistence.*;

public class Myclass 
{
	public static void main(String[] args) {
		Girlnew gl = new Girlnew();
	gl.setGid(1);
	gl.setName("Ash");
	
	Boynew by = new Boynew();
	by.setBid(101);
	by.setName("Abhishek");
	
	gl.setB(by);
	by.setG(gl);
	
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetoone");
	EntityManager em = emf.createEntityManager();
	EntityTransaction trans = em.getTransaction();
	
	trans.begin();
	em.persist(gl);
	em.persist(by);
	trans.commit();
}

}
