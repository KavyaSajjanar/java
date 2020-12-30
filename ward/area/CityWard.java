package com.xworkz.ward.area;

import com.xworkz.ward.area.constants.WardNames;

public class CityWard {
	
	private WardsDTO[] dto;
	int currentIndex = 0;

	public CityWard(int size) {
		this.dto = new  WardsDTO[size];
	}

	public void addWards( WardsDTO cityDTO) {
		if (dto != null && this.currentIndex < this.dto.length) {
			int wardNo = cityDTO.getWardno();
			WardNames wardName = cityDTO.getWardname();
			String corporatorName = cityDTO.getCorporatorName();
			int population = cityDTO.getPopulation();
			String area = cityDTO.getArea();
			if (wardNo > 0 && wardName != null && corporatorName != null && population > 5000 && area != null) {
				System.out.println("You can add the ward");
				System.out.println("Current Index is " + this.currentIndex);
				dto[currentIndex] = cityDTO;
				currentIndex++;
			} else {
				System.out.println("Population is less you can not ward");
			}
		}
	}

	public void searchByNameAndNumber(WardNames name, int wardNo) {
		if (name != null) {
			boolean start = false;
			if (dto != null) {
				for (int k = 0; k < this.dto.length; k++) {
					WardsDTO cityWardDTO = this.dto[k];
					WardNames wardName = cityWardDTO.getWardname();
					int number = cityWardDTO.getWardno();
					if (name.equals(wardName) || wardNo == number) {
						start = true;
						System.out.println("Ward name is :" + cityWardDTO.getWardname());
						System.out.println(cityWardDTO.getWardno());
						System.out.println(cityWardDTO.getCorporatorName());
						System.out.println(cityWardDTO.getPopulation());
						System.out.println(cityWardDTO.getArea());
						break;
					} else {
						System.out.println("Ward not found");
					}
				}
				if (start == false) {
					System.out.println("Ward Name is not found");
				}
			}
		}
	}

	public void displayWardDetails() {
		for (int i = 0; i < this.dto.length; i++) {
			WardsDTO dto = this.dto[i];
			if (dto != null) {
				System.out.println(dto.getWardno());
				System.out.println(dto.getWardname());
				System.out.println(dto.getCorporatorName());
				System.out.println(dto.getPopulation());
				System.out.println(dto.getArea());
			}
		}
	}
}


