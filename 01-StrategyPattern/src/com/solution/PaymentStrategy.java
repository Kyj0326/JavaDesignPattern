package com.solution;

public interface PaymentStrategy {
	
	
	public void pay(Item item, String arg);
	
	public void cancel();
	

}
