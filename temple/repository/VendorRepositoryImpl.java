package com.xworkz.temple.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.jpa.util.JpaUtil;

import com.xworkz.temple.entity.VendorEntity;

public class VendorRepositoryImpl implements VendorRepository {
	private EntityManagerFactory factory=JpaUtil.getFactory();
	@Override
	public void save(VendorEntity entity) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();

		
	}

	@Override
	public VendorEntity findByName(String name) {
		
		System.out.println("invoked findByName"); 
		  
		  
		 EntityManager manager=factory.createEntityManager(); 
		  
		  Query query=manager.createNamedQuery("findByVendorNames");
		  query.setParameter("nm",name);
		  VendorEntity venEntityFromDb=(VendorEntity) query.getSingleResult();
		  return venEntityFromDb;
		  
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked deletebyid");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		Query query=manager.createNamedQuery("deleteByVendorid");
		  query.setParameter("id",id);
		  Integer num=query.executeUpdate();
		  System.out.println(num);
		  manager.getTransaction().commit();
		  manager.close();
		  factory.close();
		
		
	}

	@Override
	public List<VendorEntity> getAll() {
		System.out.println("invoked deletebyid");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		Query query=manager.createNamedQuery("getAllName");
		List<VendorEntity> list=query.getResultList();
		return list;
	}

	
	}


