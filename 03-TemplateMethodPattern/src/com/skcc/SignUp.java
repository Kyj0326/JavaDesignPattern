package com.skcc;

public abstract class SignUp{
	

	public void commonSignUp(User user) {
		
		System.out.println("�츮 ����Ʈ ������ ����� �Ѵ�.");
		SendSignUpInfo(user);
	}
	
	public abstract void SendSignUpInfo(User user);
	
	public abstract User getUserInfo(User user);
	

}
