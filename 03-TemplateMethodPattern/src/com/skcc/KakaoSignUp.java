package com.skcc;

public class KakaoSignUp extends SignUp{

	@Override
	public void SendSignUpInfo(User user) {
		// TODO Auto-generated method stub
		System.out.println("īī���� ������!"+user.getUserinfo()+" " 
				+ user.getEmail() + " " + user.getPassword());
	}

	@Override
	public User getUserInfo(User user) {
		// TODO Auto-generated method stub
		System.out.println("īī���� �α��� ������" +user.getUserinfo()+" " 
				+ user.getEmail() + " " + user.getPassword());
		return user;
	}
	

}
