package com.classic;

public class Item {
	
	String code;
	
	int amount;
	

	public Item(String code, int amount) {
		this.code = code;
		this.amount = amount;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
