package com.bridge.impl;

import com.bridge.dao.CheckList;
import com.bridge.func.Validator;

public class JonYnValidate implements Validator{

	@Override
	public CheckList validate(CheckList checkList) {
		if ( checkList.getMbrId()  == "123456789" || checkList.getMbrId()  == "234567890" ) {
			checkList.setJonYn("Y");
		} else{
			checkList.setJonYn("N");
		}
		return checkList;
	}
	
}
