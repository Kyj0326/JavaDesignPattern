package com.dec.svc;

import com.dec.intf.Accumulate;

public class CoopCrdCdAccumulate extends DecAccumulate {

	public CoopCrdCdAccumulate(Accumulate addAccumulate) {
		super(addAccumulate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accmulate() {
		// TODO Auto-generated method stub
		super.accmulate();
		System.out.println("카드코드적립");
	}

}
