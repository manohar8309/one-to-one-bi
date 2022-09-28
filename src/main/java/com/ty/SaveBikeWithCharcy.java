package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBikeWithCharcy {
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.setName("r15");
		bike.setCost(2000000);
		
		Charcy charcy=new Charcy();
		charcy.setType("blader");
		
		bike.setCharcy(charcy);
		charcy.setBike(bike);
		
		EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(bike);
		entityManager.persist(charcy);
		entityTransaction.commit();
		
	}

}
