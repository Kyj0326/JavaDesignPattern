package com.cd4;

import com.abst.CancelPoint;
import com.abst.CheckPoint;
import com.abst.JonUseFactory;
import com.abst.UsePoint;

public class EmFactory implements JonUseFactory{

	@Override
	public CheckPoint createChkPoint() {
		// TODO Auto-generated method stub
		return new EmCheck();
	}

	@Override
	public UsePoint createUsePoint() {
		// TODO Auto-generated method stub
		return new EmUse();
	}

	@Override
	public CancelPoint createCancelPoint() {
		// TODO Auto-generated method stub
		return new EmCancel();
	}
	
	
}
