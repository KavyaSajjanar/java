package com.xworkz.temple;


import com.xworkz.temple.repository.ComputerRepository;
import com.xworkz.temple.repository.ComputerRepositoryImpl;

public class ComputerTester {

	public static void main(String[] args) {
//ComputerEntity entity2=new ComputerEntity(2, "dell", "dell", 40000, "LapTop");
ComputerRepository repo=new ComputerRepositoryImpl();
	//repo.save(entity2);
	System.out.println(repo.findByName("dell"));
	repo.deleteById(2);
	}

}
