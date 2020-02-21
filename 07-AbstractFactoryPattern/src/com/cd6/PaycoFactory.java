package com.cd6;

import com.abst.CancelPoint;
import com.abst.CheckPoint;
import com.abst.JonUseFactory;
import com.abst.UsePoint;

public class PaycoFactory implements JonUseFactory{

	@Override
	public CheckPoint createChkPoint() {
		// TODO Auto-generated method stub
		return new PaycoCheck();
	}

	@Override
	public UsePoint createUsePoint() {
		// TODO Auto-generated method stub
		return new PaycoUse();
	}

	@Override
	public CancelPoint createCancelPoint() {
		// TODO Auto-generated method stub
		return new PaycoCancel();
	}
	
	

}
