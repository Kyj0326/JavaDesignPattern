package com.skcc.member;

import com.skcc.dao.UserRequest;

public class GroupMember extends MemberFlg{

	@Override
	public boolean Validate(UserRequest user) {
		// TODO Auto-generated method stub
		
		if ( user.getMbrId().length()==9 ) {
			return true;
		}else{
			return false;
		}
	}
		

}
