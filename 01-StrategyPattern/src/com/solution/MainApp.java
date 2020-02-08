package com.solution;

public class MainApp {
	
	public static void main(String[] args) {
	
		ShoppingCart cart = new ShoppingCart(new Item("AABB#d",4),new KakaoPayment(),"01034497790");
		
		cart.pay();
		
	}
	

}
