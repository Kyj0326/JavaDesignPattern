package com;

import com.bridge.bridge.BridgeClass;
import com.bridge.dao.CheckList;
import com.bridge.impl.CoopCrdCdValidate;
import com.bridge.impl.JonYnValidate;
import com.bridge.svc.JonService;
import com.jonfac.FactoryJonInstance;
import com.jonfac.abst.CancelPoint;
import com.jonfac.abst.CheckPoint;
import com.jonfac.abst.JonUseFactory;
import com.jonfac.abst.UsePoint;

public class MainApp {
	
	public static void main(String[] args) {
		
		CheckList chk = new CheckList();
		chk.mbrId("123456789")
		.coopCrdCd("A002");
		
			
		BridgeClass jonYn = new JonService(new JonYnValidate());
		BridgeClass coopCrdcd = new JonService(new CoopCrdCdValidate());
		
		if ( jonYn.validate(chk).getJonYn()=="Y" ) {
			System.out.println("먼저 제휴처 대상회원이다!");
			if (coopCrdcd.validate(chk).getTarget().contains("CD")) {
				JonUseFactory test = FactoryJonInstance.getUseFactory(chk);
			
				CheckPoint check = test.createChkPoint();
				check.check();
				UsePoint use = test.createUsePoint();
				use.use();
				CancelPoint cancel = test.createCancelPoint();
				cancel.cancel();
			}
		}
		
		
	}

}
