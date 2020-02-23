package com.dec.svc;

import com.dec.intf.Accumulate;

public class BasicAccumulate implements Accumulate{
	
	private Accumulate addAccumulate;

	
	public BasicAccumulate(Accumulate addAccumulate) {
		super();
		this.addAccumulate = addAccumulate;
	}



	@Override
	public void accmulate() {
		// TODO Auto-generated method stub
		System.out.println("기본 적립입니다.");
		addAccumulate.accmulate();
	}
	
	

}
