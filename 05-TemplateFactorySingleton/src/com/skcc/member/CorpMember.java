package com.skcc.member;

import com.skcc.dao.UserRequest;
import com.skcc.dao.corp.CorpUser;

public class CorpMember extends MemberFlg {

	@Override
	public boolean Validate(UserRequest user) {
		// TODO Auto-generated method stub
		CorpUser busiUser = user.getCorpUser();
		if ( busiUser.getCoBizNo().length()==13 ) {
			return true;
		}else{
			return false;
		}
	}

}
