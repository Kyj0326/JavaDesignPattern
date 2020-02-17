package com;

import com.abst.CheckPoint;
import com.abst.JonUseFactory;
import com.abst.UsePoint;
import com.cd1.KbFactory;
import com.logic.JonUseLogic;
import com.logic.dao.CheckList;

public class MainApp {

	public static void main(String[] args) {
		
		JonUseLogic test = new JonUseLogic(new CheckList("A003", "Y"));
		
		JonUseFactory test1 = test.checkOut();
		
		CheckPoint chk3 = test1.createChkPoint();
		chk3.check();
		UsePoint chk2 = test1.createUsePoint();
		chk2.use();
		
		 
		
		
		
		JonUseFactory kb = new KbFactory();
		
		CheckPoint chk = kb.createChkPoint();
		
		UsePoint chk1 = kb.createUsePoint();
		
		chk.check();
		
		chk1.use();
		
		
		
	}
	
}
