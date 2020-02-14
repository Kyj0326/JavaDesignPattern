package com.skcc;

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
