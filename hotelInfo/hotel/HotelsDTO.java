package com.xworkz.hotelInfo.hotel;

import com.xworkz.hotelInfo.constants.Location;

public class HotelsDTO{
	private String name;
	private Location location;
	private String ownerName;
	private String[] foodItems;

	
	public HotelsDTO(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	
	public HotelsDTO(String name, Location location, String[] foodItems) {
		this.name = name;
		this.location = location;
		this.foodItems = foodItems;
	}

	public String[] getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(String[] foodItems) {
		this.foodItems = foodItems;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

}
