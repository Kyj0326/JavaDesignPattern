package com.skcc.member;

import com.skcc.dao.UserRequest;
import com.skcc.dao.busi.BusiUser;

public class BusiUserServiceImpl extends UserServie {

	@Override
	public boolean validate(UserRequest user) {
		// TODO Auto-generated method stub
		BusiUser busiUser = user.getBusiUser();
		if ( busiUser.getPrnBizNo().length()==10 ) {
			return true;
		}else{
			return false;
		}
	}

}
