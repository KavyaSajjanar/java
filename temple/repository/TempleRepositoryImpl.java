package com.xworkz.temple.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Session;

import com.xworkz.jpa.util.JpaUtil;
import com.xworkz.temple.entity.PersonEntity;
import com.xworkz.temple.entity.TempleEntity;

public class TempleRepositoryImpl implements TempleRepository {
private EntityManagerFactory factory=JpaUtil.getFactory();
	@Override
	public void save(TempleEntity entity) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();

	}

	@Override
	public TempleEntity findByName(String name) {
		

	  System.out.println("invoked findByName"); 
	  
	  
	 EntityManager manager=factory.createEntityManager(); 
	  
	  Query query=manager.createNamedQuery("findByName");
	  query.setParameter("nm",name);
	  TempleEntity templeEntityFromDb=(TempleEntity) query.getSingleResult();
	  return templeEntityFromDb;
	  
	  
	 
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked deletebyid");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		Query query=manager.createNamedQuery("deleteById");
		  query.setParameter("id",id);
		  Integer num=query.executeUpdate();
		  System.out.println(num);
		  manager.getTransaction().commit();
		  manager.close();
		  factory.close();
		  
		}

	@Override
	public List<TempleEntity> getAll() {
		System.out.println("invoked getall");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		Query query=manager.createNamedQuery("getAllnames");
		List<TempleEntity> list=query.getResultList();
		return list;

	}

	

	
	}


