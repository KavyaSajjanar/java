package com.xworkz.copies.init;

public class Temple {
	private String name;
	private String location;
	private float startTime;
	private String prasada;
	private float closeTime;
	
public Temple(String name,String location,float startTime,String prasada,float closeTime) {
	this.name=name;
	this.location=location;
	this.startTime=startTime;
	this.prasada=prasada;
	this.closeTime=closeTime;
	
}

public String getName() {
	return name;
}

public String getLocation() {
	return location;
}

public float getStartTime() {
	return startTime;
}

public String getPrasada() {
	return prasada;
}

public float getCloseTime() {
	return closeTime;
}

}




