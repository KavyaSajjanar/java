package com.xworkz.inherit.incomplete;

public class PoliceStationDTO extends Object {
	private String area;
	private int noOfCells;
	private String name;
	
	public PoliceStationDTO() {
		System.out.println("invoked PoliceStationdto");
		
		
	}

	public PoliceStationDTO(String area, int noOfCells, String name) {
		super();
		this.area = area;
		this.noOfCells = noOfCells;
		this.name = name;
	}

	@Override
	public String toString() {
		
		return "PoliceStationDTO [area=" + area + ", noOfCells=" + noOfCells + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
	if(obj!=null) {
		System.out.println("object is not null");
	
			if(obj==this) {
				System.out.println("object pointing to same memory");
				
			}
			else {
				if(obj instanceof PoliceStationDTO ) {
				 PoliceStationDTO casted=(PoliceStationDTO)obj;
				 if(casted.getName()!=null && casted.getName().equals (this.name)) {
					 
					 System.out.println("name is equal");
					 return true;
				 }
					 else { 
						 System.out.println("name is not equal");
					 }
				}
			
		}
		
	}
	System.out.println("object is not equal");
		return false;
	}
	
	
	

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getNoOfCells() {
		return noOfCells;
	}

	public void setNoOfCells(int noOfCells) {
		this.noOfCells = noOfCells;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
	


