package com.dec.svc;

import com.dec.intf.Accumulate;

public class OrganAccumulate extends BasicAccumulate {

	public OrganAccumulate(Accumulate addAccumulate) {
		super(addAccumulate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accmulate() {
		// TODO Auto-generated method stub
		System.out.println("특정 기관 추가적립입니다.");
	}
	
	

}
