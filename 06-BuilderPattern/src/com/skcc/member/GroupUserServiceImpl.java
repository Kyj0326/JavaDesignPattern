package com.skcc.member;

import com.skcc.dao.UserRequest;

public class GroupUserServiceImpl extends UserServie{

	@Override
	public boolean validate(UserRequest user) {
		// TODO Auto-generated method stub
		
		if ( user.getMbrId().length()==9 ) {
			return true;
		}else{
			return false;
		}
	}
		

}
