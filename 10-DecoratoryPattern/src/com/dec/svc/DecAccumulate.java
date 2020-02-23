package com.dec.svc;

import com.dec.intf.Accumulate;

public class DecAccumulate implements Accumulate{
	
	private Accumulate addAccumulate;

	
	public DecAccumulate(Accumulate addAccumulate) {
		super();
		this.addAccumulate = addAccumulate;
	}


	@Override
	public void accmulate() {
		// TODO Auto-generated method stub
		addAccumulate.accmulate();
	}
	
}
