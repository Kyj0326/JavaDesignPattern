package com.skcc;

import com.skcc.dao.UserRequest;
import com.skcc.fac.MemberFactory;
import com.skcc.member.MemberFlg;

public class Mainapp {
	
	public static void main(String[] args) {
		
		MemberFactory memFac = new MemberFactory();
		UserRequest indiUser = new UserRequest("M4", 1, "", "asdjiasdjaisodjasiodjasiodjasiodjasoidjasiodjasiodjasiodajsiodasjiodajsiodasasjiodasjdid", null, null);
	
				
		MemberFlg test  = memFac.createMember(1);
		
		System.out.println(test.commValidate(indiUser));
		
		System.out.println(test.Validate(indiUser));
		
	}

}
