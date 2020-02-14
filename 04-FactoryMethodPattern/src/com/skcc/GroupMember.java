package com.skcc;

public class GroupMember implements MemberFlg{

	@Override
	public boolean Validate(User user) {
		// TODO Auto-generated method stub
		System.out.println("단체회원이요");
		return false;
	}
		

}
