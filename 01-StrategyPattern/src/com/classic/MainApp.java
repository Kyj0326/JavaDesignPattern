package com.classic;
public class MainApp {
	
	public static void main(String[] args) {
	

		Payment customer = new PaymentImpl(new Item("AAB33D", 3));
		
		customer.pay("HP", "01034497790");
		
		Payment customer2 = new PaymentImpl(new Item("ABBDCC", 5));
		
		customer.pay("ACCOUNT", "88091039728907");
	
	}

}

//���⼭ īī������, �����Ȱ���, ī����� ��� �߰� ����� �����?

