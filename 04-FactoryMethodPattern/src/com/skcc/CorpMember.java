package com.skcc;

public class CorpMember implements MemberFlg {

	@Override
	public boolean Validate(User user) {
		// TODO Auto-generated method stub
		System.out.println("법인이요!");
		return false;
	}

}
