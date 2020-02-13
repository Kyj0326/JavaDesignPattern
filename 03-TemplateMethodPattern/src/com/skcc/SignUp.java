package com.skcc;

public abstract class SignUp{
	

	public void commonSignUp(User user) {
		
		System.out.println("우리 사이트 정보에 등록을 한다.");
		SendSignUpInfo(user);
	}
	
	public abstract void SendSignUpInfo(User user);
	
	public abstract User getUserInfo(User user);
	

}
