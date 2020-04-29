package com.org.capgemini.pl;

import java.util.Scanner;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.org.capgemini.model.Author1;



public class mainClass {

	public static void main(String[] args) {
		Author1 auth;
		EntityManagerFactory ef;
		EntityManager em;
		EntityTransaction tr;
			ef = Persistence.createEntityManagerFactory("jpa13");
			em = ef.createEntityManager();
			tr = em.getTransaction();

		Author1 aut=new Author1();
		aut.setAuthorId(111);
		aut.setFirstName("Ram");
		aut.setMiddleName("prashad");
		aut.setLastName("singh");
		aut.setPhoneNo("736373828");
		
		tr.begin();
		em.persist(aut);
		tr.commit();		
		
System.out.println(" press: \n 1--insert\n2--update\n3--delete");
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
switch(n) {
 
case 1:
	System.out.println("enter ID=" );
	Author1 aut1=new Author1();
	aut1.setAuthorId(sc.nextInt());
	System.out.println("enter Fname=");
	aut1.setFirstName(sc.next());
	System.out.println("enter Mname=");
	aut1.setMiddleName(sc.next());
	System.out.println("enter Lname");
	aut1.setLastName(sc.next());
	System.out.println("enter Pno.");
	aut1.setPhoneNo(sc.next());
	tr.begin();
	em.persist(aut1);
	tr.commit();
	ef.close();
	
case 2:
	System.out.println("enter Id of author u want to update:");
	int id=sc.nextInt();
	auth= em.find(Author1.class, id);
		if (auth != null) {
			System.out.println("enter Fname=");
			auth.setFirstName(sc.next());
			System.out.println("enter Mname=");
			auth.setMiddleName(sc.next());
			System.out.println("enter Lname");
			auth.setLastName(sc.next());
			System.out.println("enter Pno.");
			auth.setPhoneNo(sc.next());
			tr.begin();
			em.persist(auth);
			tr.commit();
			ef.close();
			System.out.println("updated");
		}
		else {
		System.out.println("Not found");
	}
		
case 3:
	System.out.println("enter Id of author u want to delete:");
	int id1=sc.nextInt();
	auth= em.find(Author1.class, id1);
		if (auth != null) {
			
			tr.begin();
			em.remove(auth);
			tr.commit();
			ef.close();
			System.out.println("Deleted");
		}
		else {
		System.out.println("Not found");
		}
	
	

}
}	

}