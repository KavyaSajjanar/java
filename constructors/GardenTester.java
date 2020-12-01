package com.xworkz.constructors;

public class GardenTester {
	public static void main(String[] args) {
		Garden garden1=new Garden();
		System.out.println(garden1.name);
		
		
			Garden garden2=new Garden("dark forest");
			System.out.println(garden2.name);
			
			
				Garden garden3=new Garden("vana",245);
				System.out.println(garden3.name);
				System.out.println(garden3.area);
				
				Garden garden4=new Garden("vana",245,6.0f);
				System.out.println(garden4.name);
				System.out.println(garden4.area);
				System.out.println(garden4.width);
				
				Garden garden5=new Garden(245,789);
				System.out.println(garden5.area);
				System.out.println(garden5.noOfTrees);
				
				

			
		
	}

}
