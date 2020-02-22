package com.bridge.impl;

import com.bridge.dao.CheckList;
import com.bridge.func.Validator;

public class CoopCrdCdValidate implements Validator{

	@Override
	public CheckList validate(CheckList checkList) {
		// TODO Auto-generated method stub
		if( checkList.getCoopCrdCd() =="A001") {
			checkList.setTarget("CD01");
		}else if ( checkList.getCoopCrdCd() == "A002") {
			checkList.setTarget("CD02");
		}else if ( checkList.getCoopCrdCd() == "A003") {
			checkList.setTarget("CD03");
		}else if ( checkList.getCoopCrdCd() == "A004") {
			checkList.setTarget("CD04");
		}else if ( checkList.getCoopCrdCd() == "A005") { 
			checkList.setTarget("CD05");
		}else if ( checkList.getCoopCrdCd() == "A006") {
			checkList.setTarget("CD06");
		}
		return checkList;
	}
	
	

}
