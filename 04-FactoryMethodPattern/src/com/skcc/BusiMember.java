package com.skcc;

public class BusiMember implements MemberFlg {

	@Override
	public boolean Validate(User user) {
		// TODO Auto-generated method stub
		System.out.println("개인사업자요");
		return false;
	}

}
