package com.xworkz.data.dto;

public class CompanyDTO {
	private String name;
	private String location;
	private long employees;
	private String branch;
	private String ceoName;
	private int startedYear;
	
	
	public CompanyDTO() {
		System.out.println("default values");
		
	}
	public CompanyDTO(String name,String location) {
		this.ceoName=name;
		this.location=location;
		
		
	}
	public CompanyDTO(String branch,String ceoName,int startedYear) {
		this.branch=branch;
		this.ceoName=ceoName;
		this.startedYear=startedYear;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getEmployees() {
		return employees;
	}
	public void setEmployees(long employees) {
		this.employees = employees;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCeoName() {
		return ceoName;
	}
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	public int getStartedYear() {
		return startedYear;
	}
	public void setStartedYear(int startedYear) {
		this.startedYear = startedYear;
	}
	

}
