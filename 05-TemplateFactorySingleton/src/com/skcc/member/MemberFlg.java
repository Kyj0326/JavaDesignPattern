package com.skcc.member;

import com.skcc.dao.UserRequest;
import com.skcc.logger.OcbLogger;

public abstract class MemberFlg {
	
	public boolean commValidate(UserRequest userRequest) {
		
		if ( userRequest.getReqFg() == "M4" ) {
			OcbLogger.normlog("정상적인 요청구분 입니다.");
			return true;
		}
		
		return false;
		
	}
	
	public abstract boolean Validate(UserRequest user);

}
