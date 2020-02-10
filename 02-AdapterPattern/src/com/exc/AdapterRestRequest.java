package com.exc;

public class AdapterRestRequest implements RestRequest{
	
	RestRequestImpl rri = new RestRequestImpl();
	
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("신규 비즈니스 수행 해 주세요!");
		rri.call();
	}
	
	

}
