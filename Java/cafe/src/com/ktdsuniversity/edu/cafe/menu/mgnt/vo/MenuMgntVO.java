package com.ktdsuniversity.edu.cafe.menu.mgnt.vo;

public class MenuMgntVO {
	
	private String itemName;
	private int price;
	private boolean soldOut;
	private int stock;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isSoldOut() {
		return soldOut;
	}

	public void setSoldOut(boolean soldOut) {
		this.soldOut = soldOut;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}


	
	
}
