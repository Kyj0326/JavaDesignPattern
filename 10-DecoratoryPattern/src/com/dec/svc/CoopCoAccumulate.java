package com.dec.svc;

import com.dec.intf.Accumulate;

public class CoopCoAccumulate extends BasicAccumulate{

	public CoopCoAccumulate(Accumulate addAccumulate) {
		super(addAccumulate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accmulate() {
		// TODO Auto-generated method stub
		System.out.println("특정 제휴가 추가적립입니다.");
	}
	
	
	
}
