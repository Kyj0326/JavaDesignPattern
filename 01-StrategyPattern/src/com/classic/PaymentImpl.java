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
		
		System.out.println("�޴������� ����Ͻ��� ���� ���� �Ϸ�." + arg);
		
		}else if(method == "ACCOUNT") {
			
		System.out.println("���°��� ����Ͻ��� �����Ϸ�" + arg);	
		
		}
		
		
	}
	
	
	@Override
	public void cancel(String method, String arg) {
		// TODO Auto-generated method stub
		System.out.println("��� ����Ͻ��� ���� ��� �Ϸ�");
	}

	
}
