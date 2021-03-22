package com.xworkz.temple.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.jpa.util.JpaUtil;
import com.xworkz.temple.entity.ComputerEntity;
import com.xworkz.temple.entity.MachineEntity;

public class MachineRepositoryImpl implements MachineRepository{
	private EntityManagerFactory factory=JpaUtil.getFactory();
	@Override
	public void save(MachineEntity entity) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();

		
	}

	@Override
	public MachineEntity findByName(String name) {
		System.out.println("invoked findByName"); 
		  
		  
		 EntityManager manager=factory.createEntityManager(); 
		  
		  Query query=manager.createNamedQuery("findBynames");
		  query.setParameter("nm",name);
		  MachineEntity machFromDb=(MachineEntity) query.getSingleResult();
		  return machFromDb;
		  
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked deletebyid");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		Query query=manager.createNamedQuery("deleteByids");
		  query.setParameter("id",id);
		  Integer num=query.executeUpdate();
		  System.out.println(num);
		  manager.getTransaction().commit();
		  manager.close();
		  factory.close();
		
	}

	@Override
	public List<MachineEntity> getAll() {
		System.out.println("invoked list ");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		Query query=manager.createNamedQuery("getAllen");
		List<MachineEntity> list=query.getResultList();
		return list;
	

	
	}

}
