package com.bridge.svc;

import com.bridge.bridge.BridgeClass;
import com.bridge.dao.CheckList;
import com.bridge.func.Validator;

public class JonService extends BridgeClass{

	public JonService(Validator validator) {
		super(validator);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public CheckList validate(CheckList checkList) {
		// TODO Auto-generated method stub
		System.out.println("üũ�� �ϱ����� ���⿡�ٰ� ������ �����ϸ�ȴ�!!!!!! ��ɰ� ������ �и�!!!!");
		return super.validate(checkList);
	}

}
