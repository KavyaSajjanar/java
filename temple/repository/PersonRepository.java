package com.xworkz.temple.repository;

import java.util.List;

import com.xworkz.temple.entity.ComputerEntity;
import com.xworkz.temple.entity.PersonEntity;

public interface PersonRepository {
	public void save(PersonEntity entity);
	public PersonEntity findByName(String name);

	
	public void deleteById(int id);

	public List <PersonEntity> getAll();
	
}
