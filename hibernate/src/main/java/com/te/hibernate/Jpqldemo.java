package com.te.hibernate;

import java.util.List;

import javax.persistence.*;

public class Jpqldemo
{
	public static void main(String[] args) {
		//Retrieve multiple data from DB//
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Players");
//		EntityManager em = emf.createEntityManager();
//		String query = "from teamIndia";
//		Query createQuery = em.createQuery(query);
//		List<Team> resultList = createQuery.getResultList();
//		for(Team t: resultList)
//			System.out.println(t);
		
		//Retrieve a single record from data base using jpql query//
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Players");
//		EntityManager em = emf.createEntityManager();
//		String query1 = "select min(salary) from teamIndia";
//		Query minRecord = em.createQuery(query1);
//		Double Minsalary = (Double)minRecord.getSingleResult();
//		System.out.println(Minsalary);
		
		//Updating record to Data base using jpql//
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Players");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction trans = em.getTransaction();
//		String query3 = "update teamIndia set salary=5000000 where id=18";
//		trans.begin();
//		Query createQuery = em.createQuery(query3);
//		int executeUpdate = createQuery.executeUpdate();
//		trans.commit();
		
		//Providing dynamic value//
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Players");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		String query3 = "update teamIndia set salary=:sal where id=:od";
		trans.begin();
		Query createQuery = em.createQuery(query3);
		createQuery.setParameter("sal",15.0 );
		createQuery.setParameter("od", 1);
		createQuery.executeUpdate();
		trans.commit();
	}

}
