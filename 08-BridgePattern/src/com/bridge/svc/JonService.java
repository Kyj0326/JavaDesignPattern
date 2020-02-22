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
		System.out.println("체크를 하기전에 여기에다가 무엇을 구현하면된다!!!!!! 기능과 구현의 분리!!!!");
		return super.validate(checkList);
	}

}
