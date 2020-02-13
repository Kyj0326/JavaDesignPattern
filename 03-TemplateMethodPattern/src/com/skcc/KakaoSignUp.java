package com.skcc;

public class KakaoSignUp extends SignUp{

	@Override
	public void SendSignUpInfo(User user) {
		// TODO Auto-generated method stub
		System.out.println("카카오로 보내자!"+user.getUserinfo()+" " 
				+ user.getEmail() + " " + user.getPassword());
	}

	@Override
	public User getUserInfo(User user) {
		// TODO Auto-generated method stub
		System.out.println("카카오에 로그인 시켜줘" +user.getUserinfo()+" " 
				+ user.getEmail() + " " + user.getPassword());
		return user;
	}
	

}
