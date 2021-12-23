package com.te.hibernate_cartProjrct;

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
    	Cart cart = new Cart();
    	cart.setId(1);
    	cart.setItemName("manju");
    	
    	Items its1 = new Items();
    	its1.setId(101);
    	its1.setItemName("Iphone 11");
    	its1.setPrice(54000);
    	its1.setQuantity(1);
    	its1.setC(cart);
    	
    	Items its2 = new Items();
    	its2.setId(102);
    	its2.setItemName("apple watch series 7");
    	its2.setPrice(51000);
    	its2.setQuantity(1);
    	its2.setC(cart);
    	
    	Items its3 = new Items();
    	its3.setId(103);
    	its3.setItemName("apple airpods");
    	its3.setPrice(24000);
    	its3.setQuantity(2);
    	its3.setC(cart);
    	long sum = 0;
    	sum = sum+(its1.getPrice()*its1.getQuantity());
    	sum = sum+(its2.getPrice()*its2.getQuantity());
    	sum = sum+(its3.getPrice()*its3.getQuantity());
    	
    	List<Items> list = Arrays.asList(its1,its2,its3);
    	cart.setItems(list);
    	cart.setTotalAmount(sum);
    	
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("addtocart");
    	EntityManager em = emf.createEntityManager();
    	EntityTransaction trans = em.getTransaction();
    	trans.begin();
    	em.persist(its1);
    	em.persist(its2);
    	em.persist(its3);
    	em.persist(cart);
    	trans.commit();
    }
}
