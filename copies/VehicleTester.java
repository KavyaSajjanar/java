package com.xworkz.copies;

import com.xworkz.copies.init.Vehicle;

public class VehicleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle=new Vehicle("Honda",909,"Dec 2020");
		String company=vehicle.getCompany();
		int chasisNo=vehicle.getChasisNo();
		String mfgDate=vehicle.getMfgDate();
		
		System.out.println(company);
		System.out.println(chasisNo);
		System.out.println(mfgDate);
		
		String color="black";
		vehicle.setColor(color);
		
		String owner="Ram";
		vehicle.setOwnerName(owner);


	}

}
