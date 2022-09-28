package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetCharcyDetails {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Charcy charcy=entityManager.find(Charcy.class, 1);
		
		System.out.println("--- details of charcy-----");
		System.out.println("id="+charcy.getId());
		System.out.println("name="+charcy.getType());
		
		Bike bike=charcy.getBike();
		System.out.println("----details of bike------");
		System.out.println("id="+bike.getId());
		System.out.println("name="+bike.getName());
		System.out.println("cost="+bike.getCost());
		
				
	}

}
