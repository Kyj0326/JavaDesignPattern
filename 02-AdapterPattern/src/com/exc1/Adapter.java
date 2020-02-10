package com.exc1;

public class Adapter implements Target{
	
	Adaptee adaptee = new Adaptee();

	@Override
	public void request() {
		// TODO Auto-generated method stub
		adaptee.request();
	}	
	
}
