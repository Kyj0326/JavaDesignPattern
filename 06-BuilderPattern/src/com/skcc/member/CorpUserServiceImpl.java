package com.skcc.member;

import com.skcc.dao.UserRequest;
import com.skcc.dao.corp.CorpUser;

public class CorpUserServiceImpl extends UserServie {

	@Override
	public boolean validate(UserRequest user) {
		// TODO Auto-generated method stub
		CorpUser corpUser = user.getCorpUser();
		if ( corpUser.getCoBizNo().length()==13 ) {
			return true;
		}else{
			return false;
		}
	}

}
