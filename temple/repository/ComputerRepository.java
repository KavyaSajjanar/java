package com.xworkz.temple.repository;

import java.util.List;

import com.xworkz.temple.entity.ComputerEntity;


public interface ComputerRepository {
	public void save(ComputerEntity entity);
	public ComputerEntity findByName(String name);

	
	public void deleteById(int id);

	public List <ComputerEntity> getAll();
	

}
