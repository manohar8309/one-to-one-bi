package com.ty;

import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPersonDetailsById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person person = entityManager.find(Person.class, 1);
		System.out.println("------person details-----");
		System.out.println("name=" + person.getName());
		System.out.println("id=" + person.getId());
		System.out.println("gender=" + person.getGender());

		Pan pan = person.getPan();
		if (pan != null) {
			System.out.println("------pan details----");
			System.out.println("id=" + pan.getId());
			System.out.println("number=" + pan.getNumber());
			System.out.println("type=" + pan.getType());
		} else {
			System.out.println("there is no pan details for person");
		}

	}

}
