package com.xworkz.temple.repository;

import java.util.List;


import com.xworkz.temple.entity.VendorEntity;



public interface VendorRepository {
	public void save(VendorEntity entity);
	public VendorEntity findByName(String name);

	
	public void deleteById(int id);

	public List <VendorEntity> getAll();
	
	
}
