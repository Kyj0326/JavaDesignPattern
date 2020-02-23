package com.vis.conc;

import com.compp.agrv.AgreeVersionImpl;
import com.compp.agrv.MkeAgreeVersion;
import com.compp.agrv.OcbAgreeVersion;
import com.compp.agrv.TheAgreeVersion;
import com.vis.AddFunction;

public class AddBusiness implements AddFunction{

	@Override
	public void addBiz(MkeAgreeVersion MkeAgr) {
		// TODO Auto-generated method stub
		System.out.println("마케팅쪽에 새로이 추가 된 비즈니스요.." + MkeAgr.getAgrVer() + MkeAgr.getInfoItem().toString() + "이 변수가지고 새로운 비즈 추가하면 되겠지!");
	}

	@Override
	public void addBiz(OcbAgreeVersion OcbAgr) {
		// TODO Auto-generated method stub
		System.out.println("OCB쪽에 새로 추가 된 비즈니스요..");
	}

	@Override
	public void addBiz(TheAgreeVersion TheAgr) {
		// TODO Auto-generated method stub
		System.out.println("제3자에 새로 추가 된 비즈니스요..");
	}

	@Override
	public void addBiz(AgreeVersionImpl agr) {
		// TODO Auto-generated method stub
		System.out.println("홧?");
	}
	
	

}
