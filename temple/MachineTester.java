package com.xworkz.temple;

import com.xworkz.temple.entity.MachineEntity;
import com.xworkz.temple.repository.MachineRepository;
import com.xworkz.temple.repository.MachineRepositoryImpl;

public class MachineTester {
public static void main(String[] args) {
	//MachineEntity entity1=new MachineEntity(2, "typing", "hardware","bajaj");
MachineRepository repo=new MachineRepositoryImpl();
//repo.save(entity1);
System.out.println(repo.findByName("drilling"));
repo.deleteById(2);
}
}
