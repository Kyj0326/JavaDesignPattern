package com.cd1;

import com.abst.CancelPoint;
import com.abst.CheckPoint;
import com.abst.JonUseFactory;
import com.abst.UsePoint;

public class KbFactory implements JonUseFactory{

	@Override
	public CheckPoint createChkPoint() {
		// TODO Auto-generated method stub
		return new KbCheck();
	}

	@Override
	public UsePoint createUsePoint() {
		// TODO Auto-generated method stub
		return new KbUse();
	}

	@Override
	public CancelPoint createCancelPoint() {
		// TODO Auto-generated method stub
		return new KbCancel();
	}
	
	
	
	

}
