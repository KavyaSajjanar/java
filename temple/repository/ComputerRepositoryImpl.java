package com.xworkz.temple.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.jpa.util.JpaUtil;
import com.xworkz.temple.entity.ComputerEntity;


public class ComputerRepositoryImpl implements ComputerRepository{
	private EntityManagerFactory factory=JpaUtil.getFactory();
	@Override
	public void save(ComputerEntity entity) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();

		
	}

	@Override
	public ComputerEntity findByName(String name) {
		
		 System.out.println("invoked findByName"); 
		  
		  
		 EntityManager manager=factory.createEntityManager(); 
		  
		  Query query=manager.createNamedQuery("findByNames");
		  query.setParameter("nm",name);
		  ComputerEntity compEntityFromDb=(ComputerEntity) query.getSingleResult();
		  return compEntityFromDb;
		  
		  
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked deletebyid");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		Query query=manager.createNamedQuery("deleteByIds");
		  query.setParameter("id",id);
		  Integer num=query.executeUpdate();
		  System.out.println(num);
		  manager.getTransaction().commit();
		  manager.close();
		  factory.close();
		
	}

	@Override
	public List<ComputerEntity> getAll() {
		System.out.println("invoked deletebyid");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		Query query=manager.createNamedQuery("getAllEnt");
		List<ComputerEntity> list=query.getResultList();
		return list;
	}
}
	
