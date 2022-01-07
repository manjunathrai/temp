package com.te.loginApp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerClass 
{
	static EntityManager getEntityObject()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("User");
		return emf.createEntityManager();
	}

}
