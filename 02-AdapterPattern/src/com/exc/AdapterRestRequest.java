package com.exc;

public class AdapterRestRequest implements RestRequest{
	
	RestRequestImpl rri = new RestRequestImpl();
	
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("�ű� ����Ͻ� ���� �� �ּ���!");
		rri.call();
	}
	
	

}
