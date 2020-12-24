package com.xworkz.comp;

import com.xworkz.comp.computer.DellLaptop;
import com.xworkz.comp.computer.LaptopComputer;

public class ComputerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LaptopComputer lap=new LaptopComputer();
lap.setLapModel("HP");
lap.setLapPrice(34557l);
lap.setModel("lenovo");
lap.setPrice(45674l);
lap.setVersion("i3");

lap.displayComputerDetails();

DellLaptop dell=new DellLaptop();
dell.setColor("black");
dell.setLapModel("i5");
dell.setLapPrice(3454567l);
dell.setVersion("i3");
dell.displayComputerDetails();
	}

}
