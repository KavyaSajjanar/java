package com.xworkz.temple;

import com.xworkz.temple.entity.TempleEntity;
import com.xworkz.temple.repository.TempleRepository;
import com.xworkz.temple.repository.TempleRepositoryImpl;

public class TempleTester {
	public static void main(String[] args) {
		
	
TempleEntity entity1=new TempleEntity(2,"laxmi", "banglore", 1000, 34);
TempleRepository rep=new TempleRepositoryImpl();
//rep.save(entity1);
	System.out.println(rep.findByName("saibaba"));
	rep.deleteById(2);
	}
	
	
}
