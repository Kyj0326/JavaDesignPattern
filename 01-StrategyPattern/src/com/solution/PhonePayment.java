package com.solution;

public class PhonePayment implements PaymentStrategy{

	@Override
	public void pay(Item item, String arg) {
		// TODO Auto-generated method stub
		System.out.println("휴대폰 결제입니다. item : "+item.getCode() + " "+ item.getAmount()+ " strategy : "+ arg);
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("휴대폰 결제 취소입니다.");
	}
	

}
