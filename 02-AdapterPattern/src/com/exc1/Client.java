package com.exc1;

public class Client {
	
	private Target target;

	public void setTarget(Target target) {
		this.target = target;
	}
	
	public void doSomething() {
		
		target.request();
		
	}
	

}
