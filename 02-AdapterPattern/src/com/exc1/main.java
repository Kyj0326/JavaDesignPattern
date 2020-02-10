package com.exc1;

public class main {
	
	public static void main(String[] args) {
		Client client = new Client();
		client.setTarget(new Adapter());
		client.doSomething();
	}

}
