package com.xworkz.inherit;

import com.xworkz.inherit.incomplete.PoliceStationDTO;

public class StationTester {

	public static void main(String[] args) {
		Object dto=new PoliceStationDTO("RajajiNagar",14,"RajajiNagarPoliceStation");
		System.out.println(dto);   //implicit
	 System.out.println(dto.toString());  //explicit
	 System.out.println(dto.hashCode());
	 
	 PoliceStationDTO dto1 = new PoliceStationDTO("Upparpet", 6, "Upparpet Police Station");
			System.out.println(dto1.hashCode());// Collections
			System.out.println(dto1);

			PoliceStationDTO dto2 = new PoliceStationDTO("Upparpet", 6, "Upparpet Police Station");
			dto1=dto2;
			PoliceStationDTO dto3=new PoliceStationDTO("MG Road",3, "Upparpet Polic Station");
			boolean equal=dto1.equals("WORD");
			System.out.println(equal);
			
			if(equal)
			{
				System.out.println("dto is equal");
			}
			else {
				System.out.println("dto is not equal");
			}
		}

	

	

}
