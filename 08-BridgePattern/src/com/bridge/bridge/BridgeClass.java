package com.bridge.bridge;

import com.bridge.dao.CheckList;
import com.bridge.func.Validator;

public class BridgeClass {
	
	private Validator validator;

	public BridgeClass(Validator validator) {
		super();
		this.validator = validator;
	}
	
	public CheckList validate(CheckList checkList) {
		
		return validator.validate(checkList);
		
	}

}
