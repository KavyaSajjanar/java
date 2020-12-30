package com.xworkz.ward.area;

import com.xworkz.ward.area.constants.WardNames;

public class WardsDTO {
	
		private int wardno;
		private WardNames wardname;
		private String corporatorName;
		private int population;
		private String area;
		
		public WardsDTO() {
		System.out.println("invoked wardsDTO");
			
		}

		public WardsDTO(int wardno, WardNames wardname, String corporatorName, int population, String area) {
			super();
			this.wardno = wardno;
			this.wardname = wardname;
			this.corporatorName = corporatorName;
			this.population = population;
			this.area = area;
		}

		public int getWardno() {
			return wardno;
		}

		public void setWardno(int wardno) {
			this.wardno = wardno;
		}

		public WardNames getWardname() {
			return wardname;
		}

		public void setWardname(WardNames wardname) {
			this.wardname = wardname;
		}

		public String getCorporatorName() {
			return corporatorName;
		}

		public void setCorporatorName(String corporatorName) {
			this.corporatorName = corporatorName;
		}

		public int getPopulation() {
			return population;
		}

		public void setPopulation(int population) {
			this.population = population;
		}

		public String getArea() {
			return area;
		}

		public void setArea(String area) {
			this.area = area;
		}
	}
		

