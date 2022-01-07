package com.te.hibernate;
import javax.persistence.*;
public class App 
{
    public static void main( String[] args )
    {
    	//Enter the data into table//
    	
//    	Scanner sc = new Scanner(System.in);
//    	System.out.println("Enter the number of records u want to enter");
//    	int n= sc.nextInt();
//    	    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("Players");
//    	EntityManager em = emf.createEntityManager();
//    	EntityTransaction trans = em.getTransaction();
//    	for(int i=0;i<n;i++) {
//    		Team player1 = new Team();
//
//    		System.out.println("Enter the player name");
//    		String name = sc.next();
//        	player1.setName(name);
//        	System.out.println("Enter his designation");
//        	String des= sc.next();
//    		System.out.println("Enter the id of player");
//    		int id=sc.nextInt();
//    		player1.setId(id);
//    		System.out.println("Enter player salary");
//        	double sal=sc.nextDouble();
//        	player1.setSalary(sal);
//        	player1.setDesignation(des);	
//        	trans.begin();
//        	em.persist(player1);
//        	trans.commit();
//    	
//    	}
    	
    	//Retrive the data from the db using find//
    	
//    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Players");
//    	EntityManager em = emf.createEntityManager();
//    	EntityTransaction trans= em.getTransaction();
//    	trans.begin();
//    	Team player = em.find(Team.class, 18);
//    	System.out.println(player);
//    	
    	//retrive the data from the db using getReference//
    	
//    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Players");
//    	EntityManager em = emf.createEntityManager();
//    	Team vk = em.getReference(Team.class,18);
//    	System.out.println(vk);
    	
    	
    	//Deleting the record from data base//
    	
//    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Players");
//    	EntityManager em= emf.createEntityManager();
//    	EntityTransaction trans = em.getTransaction();
//    	Team rohit = em.getReference(Team.class,45 );
//    	em.remove(rohit);
//    	trans.begin();
//    	trans.commit();
    	
    	//Updating record in db//
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Players");
    	EntityManager em = emf.createEntityManager();
    	EntityTransaction trans = em.getTransaction();
    	Team vk = em.find(Team.class, 18);
    	if(vk!=null)
    	{
    		vk.setDesignation("Captain");
    		trans.begin();
    		trans.commit();
    	}
    	
    	
    }
}
