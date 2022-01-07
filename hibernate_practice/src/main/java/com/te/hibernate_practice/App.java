package com.te.hibernate_practice;

import java.util.Scanner;

import javax.persistence.*;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of records you want to insert");
		int n = sc.nextInt();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employees");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		Employees emp = new Employees();
		for (int i = 0; i < n; i++) {
			int id = sc.nextInt();
			emp.setEmpId(id);
			sc.nextLine();
			String name = sc.nextLine();
			emp.setEmp_Name(name);
			String desg = sc.nextLine();
			emp.setDesignation(desg);
			long sal = sc.nextLong();
			emp.setSal(sal);
			trans.begin();
			em.persist(emp);
			trans.commit();
		}
	}
}
