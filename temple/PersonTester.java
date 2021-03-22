package com.xworkz.temple;

import com.xworkz.temple.entity.PersonEntity;
import com.xworkz.temple.repository.PersonRepository;
import com.xworkz.temple.repository.PersonRepositoryImpl;

public class PersonTester {
public static void main(String[] args) {
	PersonEntity entity=new PersonEntity(1, "Bharat", "Male", "Iquia");
	PersonRepository rep=new PersonRepositoryImpl();
	rep.save(entity);
	System.out.println(rep.findByName("Bharat"));
}
}
