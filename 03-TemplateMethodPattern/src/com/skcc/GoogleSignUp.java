package com.skcc;

public class GoogleSignUp extends SignUp{

	@Override
	public void SendSignUpInfo(User user) {
		// TODO Auto-generated method stub
		System.out.println("���۷� �������� ������!"+user.getUserinfo()+" " 
				+ user.getEmail() + " " + user.getPassword());
	}

	@Override
	public User getUserInfo(User user) {
		// TODO Auto-generated method stub
		System.out.println("���ۿ� ���� �α��� ������~"+user.getUserinfo()+" " 
				+ user.getEmail() + " " + user.getPassword());
		return user;
	}

}
