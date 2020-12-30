package com.xworkz.cake;

public class Cake {
	private String shape;
	private double quantity;
	private String flavour;
	
	
	public boolean taste() {
		System.out.println("invoked taste");
	
	boolean cakeIsTaste=true;
	return cakeIsTaste;
	}


	public String getShape() {
		return shape;
	}


	public void setShape(String shape) {
		this.shape = shape;
	}


	public double getQuantity() {
		return quantity;
	}


	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}


	public String getFlavour() {
		return flavour;
	}


	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	
}
