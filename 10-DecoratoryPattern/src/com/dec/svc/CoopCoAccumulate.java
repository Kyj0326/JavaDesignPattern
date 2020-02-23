package com.dec.svc;

import com.dec.intf.Accumulate;

public class CoopCoAccumulate extends DecAccumulate{

	public CoopCoAccumulate(Accumulate addAccumulate) {
		super(addAccumulate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accmulate() {
		// TODO Auto-generated method stub
		super.accmulate();
		System.out.println("제휴사적립");
	}
	
	
	
}
