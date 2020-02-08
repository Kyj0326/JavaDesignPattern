package com.classic;

public interface Payment {
	
	public void pay(String method, String arg);
	
	public void cancel(String method, String arg);

}
