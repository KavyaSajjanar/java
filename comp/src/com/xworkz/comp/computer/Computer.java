package com.xworkz.comp.computer;

public class Computer {
	private String version;
	private String model;
	private long price;
	
	public void onOff() {
		System.out.println("invoked on and off");
	}
	public void displayComputerDetails() {
		System.out.println("invoked displayComputerDetails");
		System.out.println(this.version);
		System.out.println(this.model);
		System.out.println(this.price);
	
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	

}
