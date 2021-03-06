package com.xworkz.data.dto;
import com.xworkz.data.ShapeDTO;
public class SweetDTO {
	 private String name;
     private int price;
     private String[] color;
     private String popularState;
     private ShapeDTO shape;
     private String quantity;
     
     public SweetDTO(String name,int price) {
    	 this.name=name;
    	 this.price=price;
     }
     //Shape s1=Shape.RECTANGLE;
     public SweetDTO(String popularState,String quantity,ShapeDTO shape,String[] color) {
    	 this.color=color;
    	 this.popularState=popularState;
    	 //this.shape=shape;
    	 this.quantity=quantity;
     }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String[] getColor() {
		return color;
	}
	public void setColor(String[] color) {
		this.color = color;
	}
	public String getPopularState() {
		return popularState;
	}
	public void setPopularState(String popularState) {
		this.popularState = popularState;
	}
	public ShapeDTO getShape() {
		return shape;
	}
	public void setShape(ShapeDTO shape) {
		this.shape = shape;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
     
}


