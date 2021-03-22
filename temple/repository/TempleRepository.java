package com.xworkz.temple.repository;

import java.util.List;

import com.xworkz.temple.entity.PersonEntity;
import com.xworkz.temple.entity.TempleEntity;


public interface TempleRepository {
	public void save(TempleEntity entity);
	public TempleEntity findByName(String name);

	
	public void deleteById(int id);

	public List <TempleEntity> getAll();
	
	

}
