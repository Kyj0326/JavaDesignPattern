package com.skcc.fac;

import com.skcc.member.BusiMember;
import com.skcc.member.CorpMember;
import com.skcc.member.GroupMember;
import com.skcc.member.IndiMember;
import com.skcc.member.MemberFlg;

public class MemberFactory{
	
	public MemberFlg createMember(int mbrFg) {
		if (mbrFg==1) {
			return new IndiMember();
		}else if (mbrFg==2) {
			return new CorpMember();
		}else if (mbrFg==3) {
			return new BusiMember();
		}else if (mbrFg==5) {
			return new GroupMember();
		}
		return null;
	}
	

}
