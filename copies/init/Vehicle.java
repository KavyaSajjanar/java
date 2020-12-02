package com.xworkz.copies.init;

public class Vehicle {
	private String mfgDate;
	private String company;
	private int chasisNo;
	private String color;
	private String ownerName;
	
public Vehicle(String company,int chasisNo,String mfgDate) {
		this.company=company;
		this.chasisNo=chasisNo;
		this.mfgDate=mfgDate;
		

}
	public String getMfgDate() {
		return mfgDate;
	}


	public String getCompany() {
		return company;
	}


	public int getChasisNo() {
		return chasisNo;
	}


	public void setColor(String color) {
		this.color = color;
		System.out.println("vehicle color is: "+color);
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
		System.out.println("company owner is: "+ownerName);
	}

	}
