package com.xworkz.temple.repository;

import java.util.List;

import com.xworkz.temple.entity.ComputerEntity;
import com.xworkz.temple.entity.MachineEntity;



public interface MachineRepository {
	public void save(MachineEntity entity);
	public MachineEntity findByName(String name);

	
	public void deleteById(int id);

	public List <MachineEntity> getAll();
	
}
