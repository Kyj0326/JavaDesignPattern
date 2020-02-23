package com.dec;

import com.dec.intf.Accumulate;
import com.dec.svc.BasicAccumulate;
import com.dec.svc.CoopCrdCdAccumulate;
import com.dec.svc.DecClass;
import com.dec.svc.OrganAccumulate;

public class MainApp {
	
	public static void main(String[] args) {
		
		Accumulate test = new BasicAccumulate(
				new CoopCrdCdAccumulate(
						new OrganAccumulate(
								new DecClass())));
				
				test.accmulate();
				
	}

}
