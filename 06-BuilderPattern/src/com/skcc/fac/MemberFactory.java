package com.skcc.fac;

import com.skcc.member.BusiUserServiceImpl;
import com.skcc.member.CorpUserServiceImpl;
import com.skcc.member.GroupUserServiceImpl;
import com.skcc.member.IndiUserServiceImpl;
import com.skcc.member.UserServie;

public class MemberFactory{
	
	public UserServie createMember(int mbrFg) {
		if (mbrFg==1) {
			return new IndiUserServiceImpl();
		}else if (mbrFg==2) {
			return new CorpUserServiceImpl();
		}else if (mbrFg==3) {
			return new BusiUserServiceImpl();
		}else if (mbrFg==5) {
			return new GroupUserServiceImpl();
		}
		return null;
	}
	

}
