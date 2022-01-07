package com.te.website;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityObjectClass {
	static EntityManager getEntityManagerobj()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("User");
		EntityManager em = emf.createEntityManager();
		return em;
	}

}
