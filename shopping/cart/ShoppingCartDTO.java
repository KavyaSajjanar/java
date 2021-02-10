package com.xworkz.shopping.cart;

public class ShoppingCartDTO {
	private String iteamName;
	private int quantity;
	private int price;
	
	public ShoppingCartDTO() {
		
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return true;
		if(obj instanceof ShoppingCartDTO) {
			ShoppingCartDTO casted=(ShoppingCartDTO)obj;
			if(this.iteamName.equals(casted.iteamName)) {
				System.out.println("item is matched :"+iteamName);
				return true;
			}
		}
		return false;
	
	}

	public String getIteamName() {
		return iteamName;
	}

	public void setIteamName(String iteamName) {
		this.iteamName = iteamName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
