package com.solution;

public class PhonePayment implements PaymentStrategy{

	@Override
	public void pay(Item item, String arg) {
		// TODO Auto-generated method stub
		System.out.println("�޴��� �����Դϴ�. item : "+item.getCode() + " "+ item.getAmount()+ " strategy : "+ arg);
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("�޴��� ���� ����Դϴ�.");
	}
	

}