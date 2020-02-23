package com.dec.svc;

import com.dec.intf.Accumulate;

public class OrganAccumulate extends DecAccumulate {

	public OrganAccumulate(Accumulate addAccumulate) {
		super(addAccumulate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accmulate() {
		// TODO Auto-generated method stub
		super.accmulate();
		System.out.println("기관코드적립");
	}
	
}
