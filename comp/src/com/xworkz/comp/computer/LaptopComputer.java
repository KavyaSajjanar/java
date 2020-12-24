package com.xworkz.comp.computer;

public class LaptopComputer extends Computer {
	
	private String lapModel;
	private long lapPrice;
	
	public void operate() {
		System.out.println("invoked operate");
		
	}

	public String getLapModel() {
		return lapModel;
	}

	public void setLapModel(String lapModel) {
		this.lapModel = lapModel;
	}

	public long getLapPrice() {
		return lapPrice;
	}

	public void setLapPrice(long lapPrice) {
		this.lapPrice = lapPrice;
	}

}
