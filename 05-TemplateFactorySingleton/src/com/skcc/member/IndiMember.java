package com.skcc.member;

import com.skcc.dao.UserRequest;
import com.skcc.logger.OcbLogger;

public class IndiMember extends MemberFlg{
	
	@Override
	public boolean Validate(UserRequest user) {
		// TODO Auto-generated method stub
		if ( user.getCi().length()==88 ) {
			OcbLogger.normlog("개인 유효성 검증 정상입니다");
			return true;
		}else{
			OcbLogger.errlog("개인 유효성 검증 실입니다");
			return false;
		}
	}

	
	
}
