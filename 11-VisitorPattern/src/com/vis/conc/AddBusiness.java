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
		System.out.println("�������ʿ� ������ �߰� �� ����Ͻ���.." + MkeAgr.getAgrVer() + MkeAgr.getInfoItem().toString() + "�� ���������� ���ο� ���� �߰��ϸ� �ǰ���!");
	}

	@Override
	public void addBiz(OcbAgreeVersion OcbAgr) {
		// TODO Auto-generated method stub
		System.out.println("OCB�ʿ� ���� �߰� �� ����Ͻ���..");
	}

	@Override
	public void addBiz(TheAgreeVersion TheAgr) {
		// TODO Auto-generated method stub
		System.out.println("��3�ڿ� ���� �߰� �� ����Ͻ���..");
	}

	@Override
	public void addBiz(AgreeVersionImpl agr) {
		// TODO Auto-generated method stub
		System.out.println("ȱ?");
	}
	
	

}
