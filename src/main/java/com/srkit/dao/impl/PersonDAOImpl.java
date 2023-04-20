package com.srkit.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.otm.entities.CategoryEntity;
import com.srkit.dao.PersonDAO;
import com.srkit.entity.Person;

public class PersonDAOImpl implements PersonDAO 
{
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
	
	
	@Override
	public void savePerson(Person person) 
	{
		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		try {
			em.persist(person);
			t.commit();
			System.out.println("Person details persisted into Database...");
		} catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		finally {
			em.close();
		}


	}

	@Override
	public Person fetchPerson(Integer personId) 
	{
		EntityManager em = factory.createEntityManager();
		Person entity = em.find(Person.class, personId);
		em.close();
		return entity;
	}

	@Override
	public void removePerson(Integer personId) 
	{
		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();
		Person entity = em.find(Person.class, personId);
		t.begin();
		try {
			em.remove(entity);
			t.commit();
			System.out.println("Person with passport details are removed from Database");
		}catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		finally {
			em.close();
		}

	}

}
