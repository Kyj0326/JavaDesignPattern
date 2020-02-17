package com.skcc.member;

import com.skcc.dao.UserRequest;
import com.skcc.logger.OcbLogger;

public abstract class UserServie {
	
	public boolean commValidate(UserRequest userRequest) {
		
		if ( userRequest.getReqFg() == "M4" ) {
			OcbLogger.normlog("요청구분이 정상입니다.");
			
			return validate(userRequest);
		}
		
		return false;
		
	}
	
	public abstract boolean validate(UserRequest user);

}
