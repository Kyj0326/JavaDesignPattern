package com;

import java.util.ArrayList;
import java.util.List;

import com.compp.agrv.AgreeVersionImpl;
import com.compp.agrv.MkeAgreeVersion;
import com.compp.agrv.OcbAgreeVersion;
import com.compp.agrv.TheAgreeVersion;
import com.compp.dao.InfoItem;
import com.vis.conc.AddBusiness;

public class MainApp {
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("ADDR001");
		list1.add("ADDR002");
		list1.add("NAME001");
		list1.add("RESD001");
		
		OcbAgreeVersion ocb = new OcbAgreeVersion(new InfoItem("OM130201",list1));
		List<String> list2 = new ArrayList<>();
		list2.add("TEL001");
		list2.add("TEL002");
		
		TheAgreeVersion the = new TheAgreeVersion(new InfoItem("MN190701",list2));
		
		List<String> list3 = new ArrayList<>();
		list3.add("EMAL001");
		list3.add("TEL001");
		list3.add("TEL002");
		
		MkeAgreeVersion mke = new MkeAgreeVersion(new InfoItem("SH140801",list3));
		
		AgreeVersionImpl agr = new AgreeVersionImpl();
		
		agr.addAgreeVersion(ocb);
		agr.addAgreeVersion(the);
		agr.addAgreeVersion(mke);
		
		System.out.println(agr.getAgrVer());
		
		System.out.println(agr.getInfoItem());
//-----------요기가 visitor패턴 테스트임!!
		mke.accept(new AddBusiness());
	
		
	
	}

}
