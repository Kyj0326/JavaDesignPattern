package com.cd3;

import com.abst.CancelPoint;
import com.abst.CheckPoint;
import com.abst.JonUseFactory;
import com.abst.UsePoint;

public class BeneFactory implements JonUseFactory{

	@Override
	public CheckPoint createChkPoint() {
		// TODO Auto-generated method stub
		return new BeneCheck();
	}

	@Override
	public UsePoint createUsePoint() {
		// TODO Auto-generated method stub
		return new BeneUse();
	}

	@Override
	public CancelPoint createCancelPoint() {
		// TODO Auto-generated method stub
		return new BeneCancel();
	}
	
	


}
