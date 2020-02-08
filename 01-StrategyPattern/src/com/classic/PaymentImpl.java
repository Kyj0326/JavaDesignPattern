package com.classic;

public class PaymentImpl implements Payment {


	private Item item;
		
	public PaymentImpl(Item item) {
		this.item = item;
	}

	@Override
	public void pay(String method, String arg) {
		// TODO Auto-generated method stub
		
		if (method == "HP") {
		
		System.out.println("휴대폰결제 비즈니스를 통해 결제 완료." + arg);
		
		}else if(method == "ACCOUNT") {
			
		System.out.println("계좌결제 비즈니스로 결제완료" + arg);	
		
		}
		
		
	}
	
	
	@Override
	public void cancel(String method, String arg) {
		// TODO Auto-generated method stub
		System.out.println("취소 비즈니스를 통해 취소 완료");
	}

	
}
