package com.te.hibernate_project;
import java.util.List;
import java.util.Scanner;
import javax.persistence.*;
public class hibernate_player
{
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("MusicPlayer");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction trans = em.getTransaction();
	static void add()
	{
		Scanner sc = new Scanner(System.in);
		MyPlayList o1= new MyPlayList();
		System.out.println("enter the song name you want to add");
		String song = sc.nextLine();
		o1.setSong_name(song);
		o1.setId(1);
		trans.begin();
		em.persist(o1);
		trans.commit();
		
	}
	static void delete() {
		Scanner sc = new Scanner(System.in);
		display();
		System.out.println("Enter the song u want to delete");
		String song = sc.nextLine();
		String query = "delete from MyPlayList where song_name=:sg";
		trans.begin();
		Query createQuery = em.createQuery(query);
		createQuery.setParameter("sg", song);
		createQuery.executeUpdate();
		trans.commit();
	}
	static void update() {
		Scanner sc = new Scanner(System.in);
		display();
		System.out.println("enter the song u want to upade");
		String osong = sc.nextLine();
		System.out.println("Enter the new song name");
		String nsong = sc.nextLine();
		String query = "update MyPlayList set song_name=:ns where song_name=:os";
		trans.begin();
		Query createQuery = em.createQuery(query);
		createQuery.setParameter("os", osong);
		createQuery.setParameter("ns", nsong);
		int executeUpdate = createQuery.executeUpdate();
		trans.commit();
		if(executeUpdate>0)
			System.out.println("updated Successfully");
		else
			System.out.println("no song found!!");
	}
	static boolean search()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the song u want to search");
		String song = sc.nextLine();
		String query = "from MyPlayList where song_name=:sg";
		trans.begin();
		Query createQuery = em.createQuery(query);
		createQuery.setParameter("sg", song);
		MyPlayList singleResult = null;
		try {
		 singleResult = (MyPlayList) createQuery.getSingleResult();
		}catch(NoResultException e)
		{
			singleResult = null;
			
		}
		trans.commit();
		if(singleResult!=null)
		{
			System.out.println(song+" is playing");
			System.out.println("===============================================");
			return true;
		}
		else
		{
			System.out.println("No Song found!!!");
			System.out.println("===============================================");
			return false;
		}
	}
	static void display() 
	{
		String query = "from MyPlayList";
		Query createQuery = em.createQuery(query);
		List<MyPlayList> list = createQuery.getResultList();
		for (MyPlayList hibernateMain : list) {
			System.out.println(hibernateMain);
		}
	}
	static boolean play() {
		display();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the song u want play");
		String song = sc.nextLine();
		String query = "from MyPlayList where song_name = :sg";
		trans.begin();
		Query createQuery = em.createQuery(query);
		createQuery.setParameter("sg", song);
		MyPlayList singleResult = null;
		try {
		 singleResult = (MyPlayList) createQuery.getSingleResult();
		}catch(NoResultException e)
		{
			singleResult = null;
			
		}
		trans.commit();
		if(singleResult!=null)
		{
			System.out.println(song+" is playing");
			System.out.println("===============================================");
			return true;
		}
		else
		{
			System.out.println("No Song found!!!");
			System.out.println("===============================================");
			return false;
		}
	}

}
