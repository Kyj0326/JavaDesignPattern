package com.skcc;

public class MainApp {
	
	public static void main(String[] args) {
		
		SignUp member1 = new GoogleSignUp();
		User user = member1.getUserInfo(new User("�迵��","qoloa0326@gmail.com","1234"));
		
		member1.commonSignUp(user);
	
	}

}
