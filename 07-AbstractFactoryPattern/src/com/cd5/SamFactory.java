package com.cd5;

import com.abst.CancelPoint;
import com.abst.CheckPoint;
import com.abst.JonUseFactory;
import com.abst.UsePoint;

public class SamFactory implements JonUseFactory{

	@Override
	public CheckPoint createChkPoint() {
		// TODO Auto-generated method stub
		return new SamCheck();
	}

	@Override
	public UsePoint createUsePoint() {
		// TODO Auto-generated method stub
		return new SamUse();
	}

	@Override
	public CancelPoint createCancelPoint() {
		// TODO Auto-generated method stub
		return new SamCancel();
	}

	
}
