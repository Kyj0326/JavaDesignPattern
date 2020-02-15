package com.skcc.member;

import com.skcc.dao.UserRequest;
import com.skcc.dao.busi.BusiUser;

public class BusiMember extends MemberFlg {

	@Override
	public boolean Validate(UserRequest user) {
		// TODO Auto-generated method stub
		BusiUser busiUser = user.getBusiUser();
		if ( busiUser.getPrnBizNo().length()==10 ) {
			return true;
		}else{
			return false;
		}
	}

}
