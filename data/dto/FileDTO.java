package com.xworkz.data.dto;

import java.util.Date;

public class FileDTO {
	
	private String name;
	private double size;
	private String type;
	private String location;
	private Date CreatedDate;
	
	public FileDTO() {
		System.out.println("default");
		
	}
	public FileDTO(String name,double size) {
		System.out.println("created filedto");
		this.name=name;
		this.size=size;
		
	}
	public FileDTO(String name,double size,String type,String location,Date CreatedDate) {
		this.name=name;
		this.size=size;
		this.type=type;
		this.location=location;
		this.CreatedDate=CreatedDate;
		
		
		
	}
	public String getName() {
		return name;
	}
	public double getSize() {
		return size;
	}
	public String getType() {
		return type;
	}
	public Date getCreatedDate() {
		return CreatedDate;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setCreatedDate(java.util.Date currentDate) {
		CreatedDate = (Date) currentDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
