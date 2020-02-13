package com.skcc;

public class GoogleSignUp extends SignUp{

	@Override
	public void SendSignUpInfo(User user) {
		// TODO Auto-generated method stub
		System.out.println("구글로 가입정보 보내자!"+user.getUserinfo()+" " 
				+ user.getEmail() + " " + user.getPassword());
	}

	@Override
	public User getUserInfo(User user) {
		// TODO Auto-generated method stub
		System.out.println("구글에 먼저 로그인 시켜줘~"+user.getUserinfo()+" " 
				+ user.getEmail() + " " + user.getPassword());
		return user;
	}

}
