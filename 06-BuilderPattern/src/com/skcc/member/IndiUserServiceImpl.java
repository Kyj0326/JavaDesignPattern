package com.skcc.member;

import com.skcc.dao.UserRequest;
import com.skcc.logger.OcbLogger;

public class IndiUserServiceImpl extends UserServie{
	
	@Override
	public boolean validate(UserRequest user) {
		// TODO Auto-generated method stub
		if ( user.getCi().length()==88 ) {
			OcbLogger.normlog("CI길이가 정상입니다.");
			return true;
		}else{
			OcbLogger.errlog("CI길이가 정상이 아니에요!!");
			return false;
		}
	}

	
	
}
