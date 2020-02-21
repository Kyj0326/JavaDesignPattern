package com.logic;

import com.abst.JonUseFactory;
import com.cd1.KbFactory;
import com.cd2.WrFactory;
import com.cd3.BeneFactory;
import com.cd4.EmFactory;
import com.cd5.SamFactory;
import com.cd6.PaycoFactory;
import com.logic.dao.CheckList;

public class JonUseLogic {
	
	private CheckList list;
	
	
	
	public JonUseLogic(CheckList checkList) {
		super();
		this.list = checkList;
	}



	public JonUseFactory getUseFactory() {
		
		if( list.getJonUseYn()=="Y") {
					
			if( list.getCoopCrdCd() =="A001") {
				return new KbFactory();
			}else if ( list.getCoopCrdCd() == "A002") {
				return new WrFactory();
			}else if ( list.getCoopCrdCd() == "A003") {
				return new BeneFactory();
			}else if ( list.getCoopCrdCd() == "A004") {
				return new EmFactory(); 
			}else if ( list.getCoopCrdCd() == "A005") { 
				return new SamFactory();
			}else if ( list.getCoopCrdCd() == "A006") {
				return new PaycoFactory();
			}
		
		}
		
		return null;
		
	}

}
