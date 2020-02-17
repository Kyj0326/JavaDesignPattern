package com.skcc;

import com.skcc.dao.UserRequest;
import com.skcc.fac.MemberFactory;
import com.skcc.member.UserServie;

public class Mainapp {
	
	public static void main(String[] args) {
		
		MemberFactory memFac = new MemberFactory();
		UserRequest indiUser = new UserRequest("M4", 1, "", "asdjiasdjaisodjasiodjasiodjasiodjasoidjasiodjasiodjasiodajsiodasjiodajsiodasasjiodasjdid", null, null);
					
		UserServie test  = memFac.createMember(1);
		
		System.out.println(test.commValidate(indiUser));
		
		UserRequest groupUser = new UserRequest();
		
		groupUser.
		reqFg("M4").
		mbrFg(5).
		mbrId("21231312");
		
		UserServie test1 = memFac.createMember(5);
		
		System.out.println(test1.commValidate(groupUser));
				
	}

}
