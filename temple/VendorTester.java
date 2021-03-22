package com.xworkz.temple;

import com.xworkz.temple.entity.VendorEntity;
import com.xworkz.temple.repository.VendorRepository;
import com.xworkz.temple.repository.VendorRepositoryImpl;

public class VendorTester {
	public static void main(String[] args) {
		VendorEntity entity=new VendorEntity(1, "mysql", "sql", "oracle");
		VendorRepository repo=new VendorRepositoryImpl();
		repo.save(entity);
		
	}

}
