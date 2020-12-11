package com.xworkz.data.dto;

public class MoblieDTO {
	private String mobileName;
	private String brand;
	private String version;
	private int price;
	private byte ram;
	private byte rom;
	
	public MoblieDTO() {
		System.out.println("default value");
		
	}
public MoblieDTO(String mobileName,String brand) {
	this.mobileName=mobileName;
	this.brand=brand;
}
public String getMobileName() {
	return mobileName;
}
public void setMobileName(String mobileName) {
	this.mobileName = mobileName;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getVersion() {
	return version;
}
public void setVersion(String version) {
	this.version = version;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public byte getRam() {
	return ram;
}
public void setRam(byte ram) {
	this.ram = ram;
}
public byte getRom() {
	return rom;
}
public void setRom(byte rom) {
	this.rom = rom;
}
	
}

