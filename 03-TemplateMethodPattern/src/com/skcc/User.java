package com.skcc;

public class User {
	
	private String userinfo;
	
	private String email;
	
	private String password;

	public String getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(String userinfo) {
		this.userinfo = userinfo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(String userinfo, String email, String password) {
		super();
		this.userinfo = userinfo;
		this.email = email;
		this.password = password;
	}
	
	
	
	
	

}
