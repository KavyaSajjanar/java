package com.xworkz.temple.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.jpa.util.JpaUtil;
import com.xworkz.temple.entity.ComputerEntity;
import com.xworkz.temple.entity.PersonEntity;

public class PersonRepositoryImpl implements PersonRepository {
	private EntityManagerFactory factory=JpaUtil.getFactory();
	@Override
	public void save(PersonEntity entity) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();

		
	}

	@Override
	public PersonEntity findByName(String name) {
		System.out.println("invoked findByName"); 
		  
		  
		 EntityManager manager=factory.createEntityManager(); 
		  
		  Query query=manager.createNamedQuery("findByPersonNames");
		  query.setParameter("nm",name);
		  PersonEntity findByPersonNames=(PersonEntity) query.getSingleResult();
		  return findByPersonNames;
		  
		
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked deletebyid");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		Query query=manager.createNamedQuery("deleteByPersonids");
		  query.setParameter("id",id);
		  Integer num=query.executeUpdate();
		  System.out.println(num);
		  manager.getTransaction().commit();
		  manager.close();
		  factory.close();
		
	}

	@Override
	public List<PersonEntity> getAll() {
	
		System.out.println("invoked getall");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		Query query=manager.createNamedQuery("getAllE");
		List<PersonEntity> list=query.getResultList();
		return list;

	
		
	}

}
