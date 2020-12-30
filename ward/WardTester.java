package com.xworkz.ward;

import com.xworkz.ward.area.CityWard;
import com.xworkz.ward.area.WardsDTO;
import com.xworkz.ward.area.constants.WardNames;

public class WardTester {

	public static void main(String[] args) {
		CityWard cityWard=new CityWard(7);
		WardsDTO cityWardDTO=new WardsDTO(5634, WardNames.ATTUR, "Kavya", 6000, "350sf");
		cityWard.addWards(cityWardDTO);
		cityWard.displayWardDetails();
		cityWard.searchByNameAndNumber(WardNames.KEMPEGOUDA, 5634);
		
		WardsDTO cityWardDTO1=new WardsDTO(6986,WardNames.NAGAVARA,"Anita",3000,"698sq");
		cityWard.addWards(cityWardDTO1);
		
		WardsDTO cityWardDTO2=new WardsDTO(6354,WardNames.YELAHANKA,"Bharat",6820,"632sq");
		cityWard.addWards(cityWardDTO2);
		
		WardsDTO cityWardDTO3=new WardsDTO(8745,WardNames.PEENYA,"Sneha",4800,"854sq");
		cityWard.addWards(cityWardDTO3);
		
		
		
		cityWard.displayWardDetails();
		cityWard.searchByNameAndNumber(WardNames.ATTUR, 8745);
		
		cityWard.searchByNameAndNumber(null,0);
	}


	}


