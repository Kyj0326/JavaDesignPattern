package com.solution;

public class KakaoPayment implements PaymentStrategy{

	@Override
	public void pay(Item item, String arg) {
		// TODO Auto-generated method stub
		System.out.println("카카오 결제입니다. item : "+item.getCode() + " "+ item.getAmount()+ " strategy : "+ arg);
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("카카오 결제 취소입니다.");
	}
	
	

}
