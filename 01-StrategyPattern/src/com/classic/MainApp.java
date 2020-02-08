package com.classic;
public class MainApp {
	
	public static void main(String[] args) {
	

		Payment customer = new PaymentImpl(new Item("AAB33D", 3));
		
		customer.pay("HP", "01034497790");
		
		Payment customer2 = new PaymentImpl(new Item("ABBDCC", 5));
		
		customer.pay("ACCOUNT", "88091039728907");
	
	}

}

//여기서 카카오결제, 페이팔결제, 카드결제 등등 추가 요건이 생기면?

